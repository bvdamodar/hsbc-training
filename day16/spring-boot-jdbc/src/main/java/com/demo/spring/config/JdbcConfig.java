package com.demo.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource ;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"com.demo.spring"})
public class JdbcConfig {

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:derby://localhost:1527/demodb");
//		ds.setUsername("");
//		ds.setPassword("");
		return ds;
	}
	
	@Bean
	public JdbcTemplate JdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
	}
	
}
