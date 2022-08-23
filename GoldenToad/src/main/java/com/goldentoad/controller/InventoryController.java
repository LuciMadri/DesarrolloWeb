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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author madri
 */
@Controller
public class InventoryController {

    @Autowired
    private IInventoryService inventoryService;

    @GetMapping("/inventory")
    public String inventoryN(Model model) {
        List<Inventory> listInventory = inventoryService.listInventory();
        model.addAttribute("titulo", "Inventory Table");
        model.addAttribute("inventory", listInventory);
        return "inventoryN";
    }

    @GetMapping("/crearInventory")
    public String crearInventory(Model model) {
        model.addAttribute("inventory", new Inventory());
        return "crearInventory";
    }

    @PostMapping("/guardarInventory")
    public String guardarInventory(@ModelAttribute Inventory inventory) {
        inventoryService.saveInventory(inventory);
        return "redirect:/inventoryN";
    }

    @GetMapping("/editarInventory/{id_inventory}")
    public String editarInventory(@PathVariable("id_inventory") Long idInventory, Model model) {
        Inventory inventory = inventoryService.getInventoryById(idInventory);
        model.addAttribute("inventory", inventory);
        return "crearInventory";
    }

    @GetMapping("/eliminarInventory/{id_inventory}")
    public String eliminarInventory(@PathVariable("id_inventory") Long idInventory) {
        inventoryService.deleteInventory(idInventory);
        return "redirect:/inventoryN";
    }

}
