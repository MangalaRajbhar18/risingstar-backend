package com.rsps.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsps.models.Admin;
import com.rsps.repositories.AdminRepository;

@Service
public class AdminService {
	
	 @Autowired
	    private AdminRepository adminRepository;

	    public Admin login(Admin admin) 
	    {
           return adminRepository.findByEmailAndPassword(
	                admin.getEmail(),
	                admin.getPassword());
	    }

}
