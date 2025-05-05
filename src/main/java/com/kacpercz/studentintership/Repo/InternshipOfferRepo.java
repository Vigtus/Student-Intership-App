package com.kacpercz.studentintership.Repo;

import com.kacpercz.studentintership.Model.InternshipOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipOfferRepo extends JpaRepository<InternshipOffer, Long> {
}