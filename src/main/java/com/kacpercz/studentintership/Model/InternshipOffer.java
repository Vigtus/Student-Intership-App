package com.kacpercz.studentintership.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "internship_offers")
public class InternshipOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Powiązanie z Company
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    private LocalDate startDate;
    private LocalDate endDate;

    // Gettery i Settery
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
