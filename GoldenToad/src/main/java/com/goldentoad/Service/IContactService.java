package com.goldentoad.Service;

import com.goldentoad.entity.Contact;
import java.util.List;

/**
 *
 * @author sebastiancarballo
 */
public interface IContactService {
    
 public List<Contact> getAllContact();
    
   
    public Contact getContactById (int id_contact);
    
  
    public void saveContact(Contact contact);

   
    public void delete(int id_contact);
}
