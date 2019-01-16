package com.rhtech.springdatajdbc.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.config.JdbcConfiguration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableJdbcRepositories(basePackages = "com.rhtech.springdatajdbc")
public class Config extends JdbcConfiguration {

    @Bean
    public NamedParameterJdbcOperations createNamedParameterJdbcOperations(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public DataSource createDataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setAutoCommit(false);
        hikariConfig.setJdbcUrl("jdbc:h2:mem:test");
        hikariConfig.setUsername("test");
        hikariConfig.setPassword("test");

        return new HikariDataSource(hikariConfig);
//        ds.setJdbcUrl("jdbc:mysql://localhost:3306/simpsons");
//        ds.setUsername("bart");
//        ds.setPassword("51mp50n");
    }

}
