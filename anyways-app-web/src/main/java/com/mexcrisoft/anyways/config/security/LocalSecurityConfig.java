/**
 * LocalSecurityConfig.java
 * Fecha de creación: Jan 24, 2023, 10:36:02 PM
 */
package com.mexcrisoft.anyways.config.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.mexcrisoft.anyways.config.security.handlers.CustomAccessDeniedHandler;

/**
 * Configuración de la seguridad
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Configuration
@EnableWebSecurity
public class LocalSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.security.config.annotation.web.configuration.
     * WebSecurityConfigurerAdapter#configure(org.springframework.security.config.
     * annotation.authentication.builders.AuthenticationManagerBuilder)
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*
         * UserBuilder users = User.withDefaultPasswordEncoder();
         * auth.inMemoryAuthentication()
         * .withUser(users.username("crisstrock").password("cristian").roles("usuario",
         * "administrador"))
         * .withUser(users.username("chris").password("12345").roles("usuario"))
         * .withUser(users.username("yuyi").password("123").roles("usuario",
         * "ayudante"));
         */
        auth.jdbcAuthentication().dataSource(dataSource);
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.security.config.annotation.web.configuration.
     * WebSecurityConfigurerAdapter#configure(org.springframework.security.config.
     * annotation.web.builders.HttpSecurity)
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()// .anyRequest().authenticated()
        .antMatchers("/")
        .hasRole("USUARIO")
        .antMatchers("/")
        .hasRole("ADMINISTRADOR")
        .antMatchers("/customers/**")
        .hasRole("AYUDANTE")
        .antMatchers("/licenses/**")
        .hasRole("ADMINISTRADOR")
        .and()
        .formLogin()
        .loginPage("/userLogin")
        .loginProcessingUrl("/loginProcessing")
        .usernameParameter("username")
        .passwordParameter("password")
        .permitAll()
        .and()
        .logout()
        .permitAll()
        .and()
        .exceptionHandling()
        // .accessDeniedPage("/accessDenied.jsp")
        .accessDeniedHandler(accessDeniedHandler());

    }

    /**
     * Manejador de accesos denegados
     * @author Cristian E. Ruiz Aguilar (cristian.ruiz@ine.mx,
     *             cristianruiz1195@gmail.com)
     * @return objeto de tipo CustomAccessDeniedHandler
     */
    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        CustomAccessDeniedHandler customAccessDeniedHandler = new CustomAccessDeniedHandler();
        // customAccessDeniedHandler.setErrorPage("/acceso-denied/home");
        return customAccessDeniedHandler;
    }

}
