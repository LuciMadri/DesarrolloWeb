package com.goldentoad.controller;

import com.goldentoad.entity.Helpform;

import com.goldentoad.entity.Projects;

import com.goldentoad.service.IHelpformService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.goldentoad.Service.IProjectsService;
import com.goldentoad.entity.Projects;

//Definimos de que tipo de objeto va a ser nuestra clase
@Controller
public class HelpformController {

    //Hacemos inyeccion de dependencias
    @Autowired
    //El controller utiliza el servicio, en este caso personaService
    private IHelpformService helpformService;


    //==========================================================================
    //--------------------------- Helpform -------------------------------------
    //==========================================================================

    @GetMapping("/helpform")
    public String index(Model model) {
        List<Helpform> listHelpform = helpformService.getAllHelpform();
        model.addAttribute("titulo", "Helpform Table");
        model.addAttribute("helpform", listHelpform);
        return "helpform";
    }

    @GetMapping("/help2")
    public String createHelp(Model model) {
        model.addAttribute("helpform", new Helpform());
        return "help2";
    }
    
    @PostMapping("/saveHelp")
    public String saveHelp(@ModelAttribute Helpform helpform) {
        //Con esto lo guardo en la bd
        helpformService.saveHelpform(helpform);

        //Aqui quiero que me redirija a otro get mapping
        return "redirect:/help2";
    }

    //-------------------------------------------------------------------------
    
    

    @GetMapping("/editHelpform/{id_help}")
    public String editHelpform(@PathVariable("id_help") Long idHelp, Model model) {
        Helpform helpform = helpformService.getHelpformById(idHelp);
        model.addAttribute("helpform", helpform);
        return "crearHelpform";

    }

    @GetMapping("/deleteHelpform/{id_help}")
    public String eliminarHelpform(@PathVariable("id_help") Integer idhelp) {
        helpformService.deleteById(idhelp);
        return "redirect:/helpform";
    }

    }

