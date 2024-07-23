package com.masai.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String name; 
    private String description; 

    public Department() {}
    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
