/**
 * AnywaysAppConfig.java
 * Fecha de creación: Nov 21, 2022, 10:07:36 PM
 *
 * Copyright (c) 2022 Instituto Nacional Electoral. Dirección
 * Ejecutiva del Registro Federal de Electores.
 * Periférico Sur 239, México, D.F., C.P. 01010.
 * Todos los derechos reservados.
 *
 * Este software es información confidencial, propiedad del
 * Instituto Nacional Electoral. Esta información confidencial
 * no deberá ser divulgada y solo se podrá utilizar de acuerdo
 * a los términos que determine el propio Instituto.
 */
package com.mexcrisoft.anyways.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mexcrisoft.anyways.formatters.FechaNacimientoFormatter;

/**
 * Application configurator
 * @author Cristian Ruiz (cristianruiz1195@gmail.com)
 * @version 1.0
 * @since Anyways 0.0.1-SNAPSHOT
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.mexcrisoft.anyways.controller", "com.mexcrisoft.anyways.repository",
"com.mexcrisoft.anyways.service" })
@PropertySource("classpath:application.properties")
public class AnywaysAppConfig implements WebMvcConfigurer {
    @Autowired
    private Environment env;

    /**
     * Set up my view resolver
     * @author Cristian Ruiz Aguilar (cristianruiz1195@gmail.com)
     * @return view resolver
     */
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * addResourceHandlers(org.springframework.web.servlet.config.annotation.
     * ResourceHandlerRegistry)
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/css/");
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * addFormatters(org.springframework.format.FormatterRegistry)
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        System.out.println("Inside addFormatter method");
        registry.addFormatter(new FechaNacimientoFormatter());
    }

    /**
     * Bean encargado de establecer conexión con la base de datos
     * @author Cristian Ruiz Aguilar (cristianruiz1195@gmail.com)
     * @return dataSource for MySQL
     */
    @Bean
    public DataSource dataSource() {
        // Crear pool de conecciones
        ComboPooledDataSource securityDataSource = new ComboPooledDataSource();
        try {
            // Establecer el driver JDBC
            securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
            // Log de las propiedades de la conexión
            System.out.println("URL database: " + env.getProperty("jdbc.url"));
            System.out.println("Usuario conectado a la db: " + env.getProperty("jdbc.user"));
            // Establecer propiedades de conexión con DB
            securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
            securityDataSource.setUser(env.getProperty("jdbc.user"));
            securityDataSource.setPassword(env.getProperty("jdbc.password"));
            // Establecer las propiedades del pool de conexiones
            /*  pool sizing */
            securityDataSource.setInitialPoolSize(Integer.parseInt(env.getProperty("connection.pool.initialPoolSize")));
            securityDataSource.setMinPoolSize(Integer.parseInt(env.getProperty("connection.pool.minPoolSize")));
            securityDataSource.setMaxPoolSize(Integer.parseInt(env.getProperty("connection.pool.maxPoolSize")));
            securityDataSource.setAcquireIncrement(3);
            /* retries */
            securityDataSource.setAcquireRetryAttempts(30);
            securityDataSource.setAcquireRetryDelay(1000);
            securityDataSource.setBreakAfterAcquireFailure(false);
            /* refreshing connections */
            securityDataSource.setMaxIdleTime(Integer.parseInt(env.getProperty("connection.pool.maxIdleTime")));
            securityDataSource.setMaxConnectionAge(10);
            /* timeouts and testing */
            securityDataSource.setCheckoutTimeout(30000);
            securityDataSource.setIdleConnectionTestPeriod(60);
            securityDataSource.setTestConnectionOnCheckout(true);
            securityDataSource.setPreferredTestQuery("SELECT 1");
            securityDataSource.setTestConnectionOnCheckin(true);
            System.out.println("La conexión se realizó correctamente!");
        } catch (PropertyVetoException e) {
            // TODO Auto-generated catch block
            System.out.println("Exception: " + e.getMessage());
        }
        return securityDataSource;
    }
}
