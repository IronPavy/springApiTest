package com.example.test.controller;

import com.example.test.entity.Contact;
import com.example.test.service.ContactService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ContactController {

    private final ContactService contactService;


    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/insert")
    void insertContact(@RequestBody Contact contact){
            this.contactService.insertContact(contact);
    }
    @GetMapping("/getAll")
    void getContact(){

    }
}
