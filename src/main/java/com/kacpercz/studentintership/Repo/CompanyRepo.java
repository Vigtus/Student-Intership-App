package com.kacpercz.studentintership.Repo;

import com.kacpercz.studentintership.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Long> {
}