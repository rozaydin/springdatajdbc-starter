package com.rhtech.springdatajdbc;

import com.rhtech.springdatajdbc.model.User;
import com.rhtech.springdatajdbc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJdbcApplication implements ApplicationRunner {

    @Autowired
    CategoryRepository categoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJdbcApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User ri = new User(null, "Tidvan");
        System.out.println(categoryRepository);
    }
}