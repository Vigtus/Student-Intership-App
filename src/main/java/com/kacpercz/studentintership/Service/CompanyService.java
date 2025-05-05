package com.kacpercz.studentintership.Service;

import com.kacpercz.studentintership.Model.Company;
import com.kacpercz.studentintership.Repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepo companyRepo;

    @Autowired
    public CompanyService(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    public List<Company> findAll() {
        return companyRepo.findAll();
    }

    public Company findById(Long id) {
        return companyRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Company with id " + id + " not found."));
    }

    public Company save(Company company) {
        return companyRepo.save(company);
    }

    public Company update(Long id, Company newData) {
        Company existing = findById(id);
        existing.setName(newData.getName());
        existing.setLocation(newData.getLocation());
        existing.setDescription(newData.getDescription());
        existing.setContact(newData.getContact());
        existing.setWebsite(newData.getWebsite());
        return companyRepo.save(existing);
    }

    public void delete(Long id) {
        if (!companyRepo.existsById(id)) {
            throw new RuntimeException("Company with id " + id + " not found.");
        }
        companyRepo.deleteById(id);
    }
}
