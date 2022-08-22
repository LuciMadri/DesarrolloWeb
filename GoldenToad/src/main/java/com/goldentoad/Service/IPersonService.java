
package com.goldentoad.Service;

import com.goldentoad.entity.Person;
import java.util.List;

/**
 *
 * @author David
 */
public interface IPersonService {
    //    public List<Person> listUser();
    
     public List<Person> getAllPerson();

    public Person getPersonById_person(long id_person);

    public void savePerson(Person person);

    public void delete(long id_person);
    
    //Devolver una persona por el username
    public Person findByUsername (String username); 
}
