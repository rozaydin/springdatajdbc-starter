package com.rhtech.springdatajdbc;

import com.rhtech.springdatajdbc.config.Config;
import com.rhtech.springdatajdbc.model.AgeGroup;
import com.rhtech.springdatajdbc.model.Category;
import com.rhtech.springdatajdbc.model.User;
import com.rhtech.springdatajdbc.repositories.CategoryRepository;
import com.rhtech.springdatajdbc.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = Config.class, properties = "application-test.properties")
public class SpringDataJdbcApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Value("${rozaydin}")
    String rozaydin;

    @Test
    public void testUserRepository() {

        System.out.println(rozaydin);

        User user = new User(null, "Ridvan Ozaydin");
        user = userRepository.save(user);
        assertThat(user.getId()).isNotEqualTo(null);
    }

}

