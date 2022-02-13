package com.example.test.service;


import com.example.test.entity.Contact;
import com.example.test.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository contactRepository;


    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void insertContact(Contact contact){
        this.contactRepository.save(contact);
    }

}
