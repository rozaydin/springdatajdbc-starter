package com.rhtech.springdatajdbc.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private Long id;
    private String name;

    @java.beans.ConstructorProperties({"id", "name"})
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User withId(Long id) {
        return this.id == id ? this : new User(id, this.name);
    }
}
