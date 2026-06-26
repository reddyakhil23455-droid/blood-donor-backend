package com.donor.blood_donor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.donor.blood_donor.entity.DonorEntity;
import com.donor.blood_donor.service.DonorService;

@RestController
@RequestMapping("/api/donors")
@CrossOrigin(origins = "*")
public class DonorController {

    @Autowired
    private DonorService service;

    // Register Donor
    @PostMapping
    public DonorEntity saveDonor(@RequestBody DonorEntity donor) {
        return service.saveDonor(donor);
    }

    // Get All Donors
    @GetMapping
    public List<DonorEntity> getAllDonors() {
        return service.getAllDonors();
    }

    // Get Donor By ID
    @GetMapping("/{id}")
    public DonorEntity getDonorById(@PathVariable Integer id) {
        return service.getDonorById(id);
    }

    // Update Donor
    @PutMapping("/{id}")
    public DonorEntity updateDonor(@PathVariable Integer id,
                                   @RequestBody DonorEntity donor) {
        return service.updateDonor(id, donor);
    }

    // Delete Donor
    @DeleteMapping("/{id}")
    public String deleteDonor(@PathVariable Integer id) {
        service.deleteDonor(id);
        return "Donor Deleted Successfully";
    }
}