/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldentoad.repository;

import com.goldentoad.entity.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author madri
 */

@Repository
public interface InventoryRepository extends CrudRepository<Inventory,Long>{
     
}
