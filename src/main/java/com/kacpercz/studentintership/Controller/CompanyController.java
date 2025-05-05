package com.kacpercz.studentintership.Controller;


import com.kacpercz.studentintership.Model.Company;
import com.kacpercz.studentintership.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> getAllCompanies() {
        return companyService.findAll();
    }

    @GetMapping("/{id}")
    public Company getCompany(@PathVariable Long id) {
        return companyService.findById(id);
    }

    @PostMapping
    public Company createCompany(@RequestBody Company company) {
        return companyService.save(company);
    }

    @PutMapping("/{id}")
    public Company updateCompany(@PathVariable Long id, @RequestBody Company newData) {
        return companyService.update(id, newData);
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.delete(id);
    }
}
