/**
 * LocalSecurityConfig.java
 * Fecha de creación: Jan 24, 2023, 10:36:02 PM
 */
package com.mexcrisoft.anyways.config.security;

import javax.servlet.ServletException;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Configuración de la seguridad
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Configuration
@EnableWebSecurity
public class LocalSecurityConfig {
	private Logger logger = LoggerFactory.getLogger(LocalSecurityConfig.class);
	@Autowired
	private DataSource dataSource;

	/**
	 * Configuración global del administrador de construcción del autentificador
	 * @author Cristian E. Ruiz Aguilar (cristian.ruiz@ine.mx,
	 *         cristianruiz1195@gmail.com)
	 * @param auth
	 * @throws Exception
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		logger.debug("====> Método configureGlobal()");
		auth.jdbcAuthentication().dataSource(dataSource);
	}

	/**
	 * Configuración del la securidad de filtros en cadena
	 * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
	 * @param http
	 * @return SecurityFilterChain
	 * @throws Exception
	 * @throws ServletException
	 */
	@Bean(name = "adminSupSecurityFilterChain")
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception, ServletException {
		/*http.authorizeHttpRequests()
			.requestMatchers(new AntPathRequestMatcher("/"))
			.hasAnyRole("ADMINISTRADOR", "AYUDANTE", "USUARIO")
			.requestMatchers(new AntPathRequestMatcher("/customers/**"))
			.hasAnyRole("ADMINISTRADOR", "AYUDANTE")
			.requestMatchers(new AntPathRequestMatcher("/licenses/**"))
			.hasRole("ADMINISTRADOR")
			.requestMatchers(new AntPathRequestMatcher("/prestamos/**"))
			.hasRole("AYUDANTE")
			.and()
			.formLogin(login -> login.loginPage("/userLogin")
				.loginProcessingUrl("/loginProcessing")
				.usernameParameter("username")
				.passwordParameter("password")
				.permitAll())
			.logout(logout -> logout.permitAll());*/
		http.authorizeHttpRequests().anyRequest().permitAll();
		return http.build();
	}

}
