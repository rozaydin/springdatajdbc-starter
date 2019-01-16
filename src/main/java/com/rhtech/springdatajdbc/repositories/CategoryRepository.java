package com.rhtech.springdatajdbc.repositories;

import com.rhtech.springdatajdbc.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {}
