package com.goldentoad.service;

import com.goldentoad.entity.Userform;
import com.goldentoad.repository.UserformRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserformService implements IUserformService{
    
    //Autowired para la inyeccion de dependencias, en este caso Pais
    @Autowired
    private UserformRepository userformRepository;

    public List<Userform> listUser() {
        //Aqui devolvemos una lista de paises de paisRepository.
        return (List<Userform>) userformRepository.findAll();
    }
}
