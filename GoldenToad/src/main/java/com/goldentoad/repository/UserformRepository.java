package com.goldentoad.repository;

import com.goldentoad.entity.Userform;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserformRepository extends CrudRepository<Userform,Long> {
    
}
