package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // ✅ changed from 'user' to 'users'
public class User {

    @Id
    private Long id;

    private String name;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
