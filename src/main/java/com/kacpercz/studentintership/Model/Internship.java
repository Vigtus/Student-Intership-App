package com.kacpercz.studentintership.Model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "internships")
public class Internship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Powiązanie z ofertą praktyk
    @ManyToOne
    @JoinColumn(name = "offer_id")
    private InternshipOffer offer;

    // Powiązanie z opiekunem (rola AppUser)
    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private AppUser supervisor;

    // Powiązanie z uczestnikiem praktyk (rola AppUser)
    @ManyToOne
    @JoinColumn(name = "student_id")
    private AppUser student;

    @Column(length = 100)
    private String status;

    private BigDecimal grade; // np. ocena w formacie 3.5, 4.0, itp.

    // Gettery i Settery
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public InternshipOffer getOffer() {
        return offer;
    }
    public void setOffer(InternshipOffer offer) {
        this.offer = offer;
    }
    public AppUser getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(AppUser supervisor) {
        this.supervisor = supervisor;
    }
    public AppUser getStudent() {
        return student;
    }
    public void setStudent(AppUser student) {
        this.student = student;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public BigDecimal getGrade() {
        return grade;
    }
    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }
}
