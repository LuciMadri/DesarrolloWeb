package com.goldentoad.repository;

import com.goldentoad.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer>{
        Contact findByTitle(String title);
}
