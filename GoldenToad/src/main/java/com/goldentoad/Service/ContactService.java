package com.goldentoad.Service;

import com.goldentoad.entity.Contact;
import com.goldentoad.repository.ContactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author sebastiancarballo
 */
@Service

public class ContactService implements IContactService {

    @Autowired

    private ContactRepository contactRepository;

    @Override
    public List<Contact> getAllContact() {
        return (List<Contact>) contactRepository.findAll();
    }

    @Override
    public Contact getContactById(int id_contact) {
        return contactRepository.findById(id_contact).orElse(null);
    }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void delete(int id_contact) {
        contactRepository.deleteById(id_contact);
    }

}
