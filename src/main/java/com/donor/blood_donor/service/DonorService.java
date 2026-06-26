package com.donor.blood_donor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donor.blood_donor.entity.DonorEntity;
import com.donor.blood_donor.repository.DonorRepository;

@Service
public class DonorService {

    @Autowired
    private DonorRepository repository;

    // Register Donor
    public DonorEntity saveDonor(DonorEntity donor) {
        return repository.save(donor);
    }

    // Get All Donors
    public List<DonorEntity> getAllDonors() {
        return repository.findAll();
    }

    // Get Donor By ID
    public DonorEntity getDonorById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    // Update Donor
    public DonorEntity updateDonor(Integer id, DonorEntity donor) {

        DonorEntity existingDonor = repository.findById(id).orElse(null);

        if (existingDonor != null) {

            existingDonor.setFullName(donor.getFullName());
            existingDonor.setAge(donor.getAge());
            existingDonor.setGender(donor.getGender());
            existingDonor.setBloodGroup(donor.getBloodGroup());
            existingDonor.setPhone(donor.getPhone());
            existingDonor.setEmail(donor.getEmail());
            existingDonor.setState(donor.getState());
            existingDonor.setDistrict(donor.getDistrict());
            existingDonor.setCity(donor.getCity());
            existingDonor.setPincode(donor.getPincode());
            existingDonor.setAddress(donor.getAddress());
            existingDonor.setLastDonationDate(donor.getLastDonationDate());
            existingDonor.setAvailability(donor.getAvailability());

            return repository.save(existingDonor);
        }

        return null;
    }

    // Delete Donor
    public void deleteDonor(Integer id) {
        repository.deleteById(id);
    }
}