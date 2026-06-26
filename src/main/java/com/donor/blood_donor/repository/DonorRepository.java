package com.donor.blood_donor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donor.blood_donor.entity.DonorEntity;

@Repository
public interface DonorRepository extends JpaRepository<DonorEntity, Integer> {

}
