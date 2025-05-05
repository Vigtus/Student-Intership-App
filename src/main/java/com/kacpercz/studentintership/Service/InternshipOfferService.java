package com.kacpercz.studentintership.Service;

import com.kacpercz.studentintership.Model.InternshipOffer;
import com.kacpercz.studentintership.Repo.InternshipOfferRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InternshipOfferService {

    private final InternshipOfferRepo internshipOfferRepo;

    @Autowired
    public InternshipOfferService(InternshipOfferRepo internshipOfferRepo) {
        this.internshipOfferRepo = internshipOfferRepo;
    }

    public List<InternshipOffer> findAll() {
        return internshipOfferRepo.findAll();
    }

    public InternshipOffer findById(Long id) {
        return internshipOfferRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("InternshipOffer with id " + id + " not found."));
    }

    public InternshipOffer save(InternshipOffer offer) {
        return internshipOfferRepo.save(offer);
    }

    public InternshipOffer update(Long id, InternshipOffer newData) {
        InternshipOffer existing = findById(id);
        existing.setTitle(newData.getTitle());
        existing.setDescription(newData.getDescription());
        existing.setStartDate(newData.getStartDate());
        existing.setEndDate(newData.getEndDate());
        existing.setCompany(newData.getCompany());
        return internshipOfferRepo.save(existing);
    }

    public void delete(Long id) {
        if (!internshipOfferRepo.existsById(id)) {
            throw new RuntimeException("InternshipOffer with id " + id + " not found.");
        }
        internshipOfferRepo.deleteById(id);
    }
}
