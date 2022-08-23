/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldentoad.controller;

import com.goldentoad.Service.IInventoryService;
import com.goldentoad.Service.IMerchService;
import com.goldentoad.entity.Merch;
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
public class MerchController {

    @GetMapping("/merch")
    public String login(Model model) {
        List<Merch> listaMerch = merchService.getAllMerch();
        model.addAttribute("titulo", "Tabla Merch");
        model.addAttribute("merch", listaMerch);
        return "merch";
    }
    
    @Autowired
    private IMerchService merchService;

    @Autowired
    private IInventoryService inventoryService;

    @GetMapping("/merchN")
    public String merchN(Model model) {
        List<Merch> listaMerch = merchService.getAllMerch();
        model.addAttribute("titulo", "Tabla Merch");
        model.addAttribute("merch", listaMerch);
        return "merchN";
    }
}
