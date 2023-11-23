/**
 * AnywaysDbConfig.java
 * Fecha de creación: Aug 23, 2023, 11:30:19 PM
 */
package com.mexcrisoft.anyways.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Data source para la base de datos de anyways
 * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 1.0.0
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "anywaysEntityManagerFactory", transactionManagerRef = "anywaysTransactionManager", basePackages = {
	"com.mexcrisoft.anyways.dao", "com.mexcrisoft.anyways.repositories" })
public class AnywaysDbConfig {
	private Logger logger = LoggerFactory.getLogger(AnywaysDbConfig.class);
	@Autowired
	private Environment env;

	/**
	 * Asigna los valores para el data source del SCM
	 * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
	 * @return DataSource
	 */
	@Bean(name = "anywaysDataSource")
	DataSource anywaysDatasource() {
		logger.debug("===> Método anywaysDatasource()");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("anyways.datasource.url"));
		dataSource.setUsername(env.getProperty("anyways.datasource.username"));
		dataSource.setPassword(env.getProperty("anyways.datasource.securityCode"));
		dataSource.setDriverClassName(env.getProperty("anyways.datasource.driver-class-name"));
		dataSource.setConnectionProperties(hibernateProperties());
		return dataSource;
	}

	/**
	 * Administrador de entidad de contenedor local Bean de fábrica
	 * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
	 * @return LocalContainerEntityManagerFactoryBean
	 */
	@Bean(name = "anywaysEntityManagerFactory")
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		logger.debug("===> Método entityManagerFactory()");
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(anywaysDatasource());
		em.setPackagesToScan("com.mexcrisoft.anyways.models");
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(hibernateProperties());
		return em;
	}

	/**
	 * Administrador de transacciones de la plataforma
	 * @author Cristian E. Ruiz Aguilar (cristianruiz1195@gmail.com)
	 * @return PlatformTransactionManager
	 */
	@Bean(name = "anywaysTransactionManager")
	PlatformTransactionManager transactionManager() {
		logger.debug("===> Método transactionManager()");
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		return properties;
	}
}
