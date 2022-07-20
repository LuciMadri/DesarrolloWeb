package com.goldentoad.repository;

import com.goldentoad.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author David
 */
public interface ProjectRepository extends CrudRepository<Project, Integer> {
    /*
        En CrudRepository si damos ctrl click podremos observar todas las 
        opciones que tenemos para nuestra persona repostory
    
     */
}
