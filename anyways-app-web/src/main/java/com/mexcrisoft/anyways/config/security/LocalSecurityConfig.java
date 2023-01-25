/**
 * LocalSecurityConfig.java
 * Fecha de creación: Jan 24, 2023, 10:36:02 PM
 */
package com.mexcrisoft.anyways.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

/**
 * Configuración de la seguridad
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Configuration
@EnableWebSecurity
public class LocalSecurityConfig extends WebSecurityConfigurerAdapter {

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
        UserBuilder users = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
        .withUser(users.username("crisstrock").password("cristian").roles("administrador"))
        .withUser(users.username("chris").password("12345").roles("usuario"))
        .withUser(users.username("yuyo").password("6789").roles("ayudante"));
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
        http.authorizeRequests()
        .anyRequest()
        .authenticated()
        .and()
        .formLogin()
        .loginPage("/userLogin")
        .loginProcessingUrl("/loginUser")
            .permitAll();
    }

}
