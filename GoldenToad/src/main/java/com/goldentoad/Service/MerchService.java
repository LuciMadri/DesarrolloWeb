/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldentoad.Service;

import com.goldentoad.entity.Merch;
import com.goldentoad.repository.MerchRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MerchService implements IMerchService{

    //Autowired para hacer inyeccion de dependencias. 
    @Autowired
    //Inyectamos la clase de personaRepository
    private MerchRepository merchRepository;
    
    @Override
    public List<Merch> getAllMerch() {
        return (List<Merch>) merchRepository.findAll();
    }

    @Override
    public Merch getMerchById(long id_merch) {
        return merchRepository.findById(id_merch).orElse(null);
    }

    @Override
    public void savePersona(Merch merch) {
        merchRepository.save(merch);
    }

    @Override
    public void delete(long id_merch) {
        merchRepository.deleteById(id_merch);
    }

    @Override
    public Merch findByTitle(String title) {
        return merchRepository.findByTitle(title);
    }
    
}
