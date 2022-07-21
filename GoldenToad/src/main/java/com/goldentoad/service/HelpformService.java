package com.goldentoad.service;

import com.goldentoad.entity.Helpform;
import com.goldentoad.repository.HelpformRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Le decimos de que es el tipo de clase que va implementar en este caso Servicio
@Service

//Implementamos IPersonaService
//Este implements es una clase implementaria, osea que tiene una
//o mas interfaces.
public class HelpformService implements IHelpformService{

    //Se agrega el repository
    
    //Autowired para hacer inyeccion de dependencias. 
    @Autowired
    //Inyectamos la clase de personaRepository
    private HelpformRepository helpformRepository;
    
    
    //Aqui nada mas generamos todos los metodos abstractos.
    
    @Override
    public List<Helpform> getAllHelpform() {
        //Aqui devolvemos una lista de personas de personaRepository.
        return (List<Helpform>) helpformRepository.findAll();
    }

    @Override
    public Helpform getHelpformById(long id_helpform) {
        //Vamos a  devolver el id de la persona o sino nulo
        return helpformRepository.findById(id_helpform).orElse(null);
    }

    @Override
    public void saveHelpform(Helpform helpform) {
        //Para guardar la persona
        helpformRepository.save(helpform);
    }

    @Override
    public void deleteById(long id_helpform) {
        //Eliminamos por id
        helpformRepository.deleteById(id_helpform);
    }
    
}
