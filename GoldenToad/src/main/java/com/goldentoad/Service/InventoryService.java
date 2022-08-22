/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldentoad.Service;

import com.goldentoad.entity.Inventory;
import com.goldentoad.repository.InventoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService implements IInventoryService{
    
    //Autowired para la inyeccion de dependencias, en este caso Pais
    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> listInventory() {
        //Aqui devolvemos una lista de paises de paisRepository.
        return (List<Inventory>) inventoryRepository.findAll();
    }
    
}
