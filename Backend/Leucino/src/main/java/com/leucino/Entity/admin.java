package com.masai.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AdministratorProfile {

    @Id
    private Long user_id; 
    private String photo; 

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department; 

    public AdministratorProfile() {}
    public AdministratorProfile(Long user_id, String photo, Department department) {
        this.user_id = user_id;
        this.photo = photo;
        this.department = department;
    }
}
