package com.rhtech.springdatajdbc.repositories;

import com.rhtech.springdatajdbc.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
