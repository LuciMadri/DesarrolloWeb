package com.goldentoad.repository;


import com.goldentoad.entity.Projects;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends CrudRepository<Projects, Integer> {
    Projects findByTitle(String title);
    
    
}
