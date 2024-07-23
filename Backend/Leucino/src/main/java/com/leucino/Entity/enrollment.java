package com.masai.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentProfile studentProfile; 

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course; 

    public Enrollment() {}
    public Enrollment(StudentProfile studentProfile, Course course) {
        this.studentProfile = studentProfile;
        this.course = course;
    }

}
