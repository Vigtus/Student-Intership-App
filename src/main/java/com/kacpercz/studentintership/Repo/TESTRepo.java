package com.kacpercz.studentintership.Repo;

import com.kacpercz.studentintership.Model.TEST;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TESTRepo extends JpaRepository<TEST, Long> {
}
