package com.kacpercz.studentintership.Controller;

import com.kacpercz.studentintership.Model.Internship;
import com.kacpercz.studentintership.Service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/internships")
public class InternshipController {

    private final InternshipService internshipService;

    @Autowired
    public InternshipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }

    @GetMapping
    public List<Internship> getAllInternships() {
        return internshipService.findAll();
    }

    @GetMapping("/{id}")
    public Internship getInternship(@PathVariable Long id) {
        return internshipService.findById(id);
    }

    @PostMapping
    public Internship createInternship(@RequestBody Internship internship) {
        return internshipService.save(internship);
    }

    @PutMapping("/{id}")
    public Internship updateInternship(@PathVariable Long id, @RequestBody Internship newData) {
        return internshipService.update(id, newData);
    }

    @DeleteMapping("/{id}")
    public void deleteInternship(@PathVariable Long id) {
        internshipService.delete(id);
    }
}
