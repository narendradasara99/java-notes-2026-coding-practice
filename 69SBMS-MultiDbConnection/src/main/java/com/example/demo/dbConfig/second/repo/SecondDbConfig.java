package com.example.demo.dbConfig.second.repo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.example.demo.dbConfig.second.repo", entityManagerFactoryRef = "secondEntityManagerFactory", transactionManagerRef = "secondTransactionManager")
public class SecondDbConfig {

	@Bean
	@ConfigurationProperties("spring.datasource.department")
	public DataSourceProperties deptDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean(name="deptDataSource")
	public DataSource deptDataSource() {
		return deptDataSourceProperties().initializeDataSourceBuilder().build();
	}

	@Bean(name = "secondEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean secondEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("deptDataSource") DataSource d) {

		return builder.dataSource(d).packages("com.example.demo.dbConfig.second.entity").build();
	}

	@Bean(name = "secondTransactionManager")
	public PlatformTransactionManager secondTransactionManager(
			@Qualifier("secondEntityManagerFactory") LocalContainerEntityManagerFactoryBean emf) {

		return new JpaTransactionManager(emf.getObject());
	}
}
