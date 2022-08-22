/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldentoad.Service;

import com.goldentoad.entity.Inventory;
import java.util.List;

/**
 *
 * @author madri
 */
public interface IInventoryService {
    
    public List<Inventory> listInventory();
}
