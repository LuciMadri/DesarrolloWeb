/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldentoad.Service;

import com.goldentoad.entity.Merch;
import java.util.List;

/**
 *
 * @author madri
 */
public interface IMerchService {
    
    //Este metodo nos permite devolver todas las personas que hay en nuestra bd
    //Como son varios datos se guarda en una lista con objeto de tipo Persona
    public List<Merch> getAllMerch();
    
    //Cuando yo le paso el Id me va a devolver toda la info de esa persona
    //Como solo es uno se guarda en un objeto de tipo persona
    public Merch getMerchById (long id);
    
    //Estos metodos son void porque no van a retornar nada
    
    //Este metodo va a guardar una fila nueva en nuestra bd
    public void savePersona(Merch merch);
    
    //Este metodo va a guardar el id y va a buscar el que tenga el mismo
    //y eliminarlo
    public void delete(long id_merch);
    
    public Merch findByTitle(String title);
}
