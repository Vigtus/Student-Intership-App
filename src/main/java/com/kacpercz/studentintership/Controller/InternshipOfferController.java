package com.kacpercz.studentintership.Controller;

import com.kacpercz.studentintership.Model.InternshipOffer;
import com.kacpercz.studentintership.Service.InternshipOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/internship-offers")
public class InternshipOfferController {

    private final InternshipOfferService internshipOfferService;

    @Autowired
    public InternshipOfferController(InternshipOfferService internshipOfferService) {
        this.internshipOfferService = internshipOfferService;
    }

    @GetMapping
    public List<InternshipOffer> getAllOffers() {
        return internshipOfferService.findAll();
    }

    @GetMapping("/{id}")
    public InternshipOffer getOffer(@PathVariable Long id) {
        return internshipOfferService.findById(id);
    }

    @PostMapping
    public InternshipOffer createOffer(@RequestBody InternshipOffer offer) {
        return internshipOfferService.save(offer);
    }

    @PutMapping("/{id}")
    public InternshipOffer updateOffer(@PathVariable Long id, @RequestBody InternshipOffer newData) {
        return internshipOfferService.update(id, newData);
    }

    @DeleteMapping("/{id}")
    public void deleteOffer(@PathVariable Long id) {
        internshipOfferService.delete(id);
    }
}
