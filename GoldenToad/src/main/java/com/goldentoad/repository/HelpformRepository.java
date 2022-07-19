package com.goldentoad.repository;

import com.goldentoad.entity.Helpform;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Definimos de que tipo es nuestra clase, en este caso un repositorio.
@Repository

/*
    Creamos personaRepository que es una interfaz la cual extiende a 
    CrudRepository y tiene objetos genericos de Persona y Long
*/

//Le pasamos la entidad y el tipo de id
public interface HelpformRepository extends CrudRepository<Helpform,Long>{
    
    /*
        En CrudRepository si damos ctrl click podremos observar todas las 
        opciones que tenemos para nuestra persona repostory
    
    */
}
