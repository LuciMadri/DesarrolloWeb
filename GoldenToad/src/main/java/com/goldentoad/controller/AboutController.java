package com.goldentoad.controller;
//Oscar Sanchez Boza
import com.goldentoad.entity.About;
import com.goldentoad.service.IAboutService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AboutController {
    @Autowired
    private IAboutService aboutService;
    //==========================================================================
    //===============================ABOUT======================================
    //==========================================================================
    @GetMapping("/aboutN")
    public String newsN(Model model) {
        List<About> listAbout = aboutService.listAbout();
        model.addAttribute("titulo", "About Table");
        model.addAttribute("about", listAbout);
        return "aboutN";
    }
    
    @GetMapping("/crearAbout")
    public String crearAbout(Model model) {
        model.addAttribute("about", new About());
        return "crearAbout";
    }
    
    @PostMapping("/saveAbout")
    public String guardarNews(@ModelAttribute About about) {
        aboutService.saveAbout(about);
        return "redirect:/aboutN";
    }
    
    @GetMapping("/editAbout/{id_about}")
    public String editarNews(@PathVariable("id_about") Integer idAbout, Model model) {
        About about = aboutService.getAboutById(idAbout);
        model.addAttribute("about", about);
        return "crearAbout";
    }
   
    @GetMapping("/deleteAbout/{id_about}")
    public String eliminarNews(@PathVariable("id_about") Integer idAbout) {
        aboutService.deleteAbout(idAbout);
        return "redirect:/aboutN";
    }
    
    @GetMapping("/about")
    public String news(Model model) {
        List<About> listAbout = aboutService.listAbout();
        model.addAttribute("about", listAbout);
        return "about";
    }
    
}
