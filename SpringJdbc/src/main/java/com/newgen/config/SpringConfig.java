package com.newgen.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {
	
	/*
	 * Connec
	 * Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newgen1", "root", "sachin909");
			
			
			// Step 2: creating a statement
			Statement stmt = connection.createStatement();
			
			// Step 3: execute and get result set
			ResultSet rs = stmt.executeQuery("select * from student");
	 */

	@Bean
	public DriverManagerDataSource createDatasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
//		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/newgen1");
		datasource.setUsername("root");
		datasource.setPassword("sachin909");
		return datasource;
	}
	
	@Bean
	public JdbcTemplate mySqlJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(createDatasource());
		return jdbcTemplate;
	}
	
	@Bean
	public NamedParameterJdbcTemplate mySqlNamedParameterJdbcTemplate() {
		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(createDatasource());
		return jdbcTemplate;
	}
}
