package com.karvy.courier.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.karvy.courier.dao" })
public class DatabaseTestConfig {
	@Bean
	  public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/courierdata");
	    dataSource.setUsername("root");
	    dataSource.setPassword("root");
	    return dataSource;
	  }

	  @Bean
	  public LocalSessionFactoryBean sessionFactory() {
	    LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
	    sessionFactoryBean.setDataSource(dataSource());
	    sessionFactoryBean.setPackagesToScan("com.karvy.courier.entity");
	    Properties hibernateProperties = new Properties();
	    hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	    //hibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
	    //hibernateProperties.put("hibernate.hbm2ddl.auto", HIBERNATE_HBM2DDL_AUTO);
	    sessionFactoryBean.setHibernateProperties(hibernateProperties);
	    
	    return sessionFactoryBean;
	  }

	  @Bean
	  public HibernateTransactionManager transactionManager() {
	    HibernateTransactionManager transactionManager = 
	        new HibernateTransactionManager();
	    transactionManager.setSessionFactory(sessionFactory().getObject());
	    return transactionManager;
	  }
}
