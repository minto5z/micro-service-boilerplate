package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "minto@gmail.com", "Minto", 1405L),
            new Contact(2L, "mahadur@gmail.com", "Mahadiur", 1405L),
            new Contact(3L, "jaman@gmail.com", "Jaman", 1406L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
