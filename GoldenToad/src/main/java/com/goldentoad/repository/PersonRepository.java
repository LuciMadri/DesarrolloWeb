package com.goldentoad.repository;

import com.goldentoad.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {
     // El nombre esta actuando como username
      Person findByUsername (String username); 

   
      
      
}
