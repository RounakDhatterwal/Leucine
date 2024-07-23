package com.masai.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    public enum Role {
        Student, FacultyMember, Administrator
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String username; 
    private String password; 

    @Enumerated(EnumType.STRING)
    private Role role; 
    private String name; 
    private String email; 
    private String phone; 
    public User() {}
    public User(String username, String password, Role role, String name, String email, String phone) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

}
