package com.masai.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student{

    @Id
    private Long user_id; 
    private String photo; 

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department; 
    private String year; 
    
    public Student(){};
    public Student(Long user_id, String photo, Department department, String year) {
        this.user_id = user_id;
        this.photo = photo;
        this.department = department;
        this.year = year;
    }

}
