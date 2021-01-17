package com.example.demo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Database {
    @Bean
    public DataSource MySqlDataSource(){
        DriverManagerDataSource source = new DriverManagerDataSource();

        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/cs202_project?useLegacyDatetimeCode=false&serverTimezone=Turkey");
        source.setUsername("root");
        source.setPassword("Password4!");

        return source;
    }
}