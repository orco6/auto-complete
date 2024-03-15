package com.example.autocomplete.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Boy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Boy(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
