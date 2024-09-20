package com.newgen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {

	@Bean
	public DriverManagerDataSource createDatasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
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
	
//	@Bean
//	public NamedParameterJdbcTemplate mySqlNamedParameterJdbcTemplate() {
//		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(createDatasource());
//		
//		return jdbcTemplate;
//	}
}
