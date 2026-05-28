package com.rsps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsps.models.Contact;
import com.rsps.repositories.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
    private ContactRepository contactRepository;

    // SAVE MESSAGE
    public Contact saveMessage(Contact message) {
        return contactRepository.save(message);
    }
    
 // GET ALL MESSAGES
    public List<Contact> getAllMessages() {
        return contactRepository.findAll();
    }

    // DELETE MESSAGE
    public void deleteMessage(Long id) {
        contactRepository.deleteById(id);
    }

}
