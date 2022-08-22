
package com.goldentoad.Service;

import com.goldentoad.entity.Person;
import com.goldentoad.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author David
 */
@Service
public class PersonService implements IPersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPerson() {
        return (List<Person>) personRepository.findAll();

    }

    @Override
    public Person getPersonById_person(long id_person) {
        return personRepository.findById(id_person).orElse(null);
    }

    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public void delete(long id_person) {
        personRepository.deleteById(id_person);
    }

    @Override
    public Person findByUsername(String username) {
       return personRepository.findByUsername(username); 
    }

}
