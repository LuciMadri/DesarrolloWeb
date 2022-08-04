package com.goldentoad.repository;
//Oscar Sanchez Boza

import com.goldentoad.entity.About;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends CrudRepository<About,Integer> {
    //About findByFirstname(String firstname_a);
}
