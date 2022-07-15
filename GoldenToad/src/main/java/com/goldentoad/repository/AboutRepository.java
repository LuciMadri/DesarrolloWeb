package com.goldentoad.repository;
//Oscar Sanchez Boza

import com.goldentoad.entity.About;
import org.springframework.data.repository.CrudRepository;


public interface AboutRepository extends CrudRepository<About,Integer> {
    About findByFirstName(String firstName);
}
