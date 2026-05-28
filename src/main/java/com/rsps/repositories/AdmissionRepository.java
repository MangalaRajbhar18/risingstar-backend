package com.rsps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsps.models.Admission;

@Repository
public interface AdmissionRepository  extends JpaRepository<Admission, Long>{

	
}
