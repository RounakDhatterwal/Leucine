package com.masai.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FacultyProfile {

    @Id
    private Long user_id; 
    private String photo; 

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department; 
    private String office_hours; 

    public FacultyProfile() {}
    public FacultyProfile(Long user_id, String photo, Department department, String office_hours) {
        this.user_id = user_id;
        this.photo = photo;
        this.department = department;
        this.office_hours = office_hours;
    }

}
