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
    
    //Autowired para la inyeccion de dependencias
    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public List<Inventory> getAllInventory() {
         return (List<Inventory>) inventoryRepository.findAll();
    }

    @Override
    public Inventory getInventoryById(long id_inventory) {
        return inventoryRepository.findById(id_inventory).orElse(null);
    }

    @Override
    public void saveInventory(Inventory inventory) {
         inventoryRepository.save(inventory);
    }

  



 
    
    
    
}
