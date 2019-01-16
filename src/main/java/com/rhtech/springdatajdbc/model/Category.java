package com.rhtech.springdatajdbc.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Wither;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

/**
 * Coarse classification for {@link LegoSet}s, like "Car", "Plane", "Building" and so on.
 *
 * @author Jens Schauder
 */
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE, onConstructor = @__(@PersistenceConstructor))
public class Category {

    private final @Id
    @Wither
    Long id;
    private String name, description;
    private LocalDateTime created;
    private @Setter
    long inserted;
    private AgeGroup ageGroup;

    public Category(String name, String description, AgeGroup ageGroup) {

        this.id = null;
        this.name = name;
        this.description = description;
        this.ageGroup = ageGroup;
        this.created = LocalDateTime.now();
    }

    public void timeStamp() {

        if (inserted == 0) {
            inserted = System.currentTimeMillis();
        }
    }
}