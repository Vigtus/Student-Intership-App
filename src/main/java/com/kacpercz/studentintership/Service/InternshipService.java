package com.kacpercz.studentintership.Service;

import com.kacpercz.studentintership.Model.Internship;
import com.kacpercz.studentintership.Repo.InternshipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InternshipService {

    private final InternshipRepo internshipRepo;

    @Autowired
    public InternshipService(InternshipRepo internshipRepo) {
        this.internshipRepo = internshipRepo;
    }

    public List<Internship> findAll() {
        return internshipRepo.findAll();
    }

    public Internship findById(Long id) {
        return internshipRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Internship with id " + id + " not found."));
    }

    public Internship save(Internship internship) {
        return internshipRepo.save(internship);
    }

    public Internship update(Long id, Internship newData) {
        Internship existing = findById(id);
        existing.setStatus(newData.getStatus());
        existing.setGrade(newData.getGrade());
        existing.setOffer(newData.getOffer());
        existing.setSupervisor(newData.getSupervisor());
        existing.setStudent(newData.getStudent());
        return internshipRepo.save(existing);
    }

    public void delete(Long id) {
        if (!internshipRepo.existsById(id)) {
            throw new RuntimeException("Internship with id " + id + " not found.");
        }
        internshipRepo.deleteById(id);
    }
}