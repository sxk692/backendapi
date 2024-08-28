package com.ochoomega.backendapi.domain.service;

import com.ochoomega.backendapi.domain.entity.Contact;
import com.ochoomega.backendapi.domain.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {

    @Autowired
    private ContactRepository contactRepository;

    public Long registerContact(Contact contact){
        contactRepository.save(contact);
        return contact.getId();
    }

    public Contact getContactById(Long id){
       return contactRepository.getReferenceById(id);
    }

}
