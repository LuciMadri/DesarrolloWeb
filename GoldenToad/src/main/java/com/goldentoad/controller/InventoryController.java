/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldentoad.controller;

import com.goldentoad.Service.IInventoryService;
import com.goldentoad.entity.Inventory;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author madri
 */
@Controller
public class InventoryController {

    @GetMapping("/inventory")
    public String login() {

        return "inventory";
    }

    @Autowired
    private IInventoryService inventoryService;
    
    @GetMapping("/inventoryN")
    public String merchN(Model model){
        List<Inventory> listaInventory = inventoryService.getAllInventory();
        model.addAttribute("titulo", "Tabla Inventory");
        model.addAttribute("inventory", listaInventory);
        return "inventoryN";
    }
}


