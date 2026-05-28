package com.rsps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsps.models.Admission;
import com.rsps.repositories.AdmissionRepository;



@Service
public class AdmissionService {

    @Autowired
    private AdmissionRepository admissionRepository;



    // SAVE ADMISSION
    public Admission saveAdmission(Admission admission) {

        return admissionRepository.save(admission);
    }



    // GET ALL ADMISSIONS
    public List<Admission> getAllAdmissions(){

        return admissionRepository.findAll();
    }



    // DELETE ADMISSION
    public void deleteAdmission(Long id) {

        admissionRepository.deleteById(id);
    }
}