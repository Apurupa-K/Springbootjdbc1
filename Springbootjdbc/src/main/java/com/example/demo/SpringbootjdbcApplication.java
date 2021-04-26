package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringbootjdbcApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootjdbcApplication.class, args);
		
	}

}