package com.rsps.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Admission {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    // ===== STUDENT DETAILS =====

	    private String studentName;

	    private String classApplyingFor;

	    private String dateOfBirth;

	    private String gender;

	    private String previousSchool;



	    // ===== PARENT DETAILS =====

	    private String fatherName;

	    private String motherName;

	    private long mobileNo;

	    private String fatherOccupation;

	    private String motherOccupation;



	    // ===== ADDRESS =====

	    private String address;


}
