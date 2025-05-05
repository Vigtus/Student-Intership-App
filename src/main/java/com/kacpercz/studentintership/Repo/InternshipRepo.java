package com.kacpercz.studentintership.Repo;

import com.kacpercz.studentintership.Model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipRepo extends JpaRepository<Internship, Long> {
}
