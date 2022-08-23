package com.goldentoad.controller;

import com.goldentoad.Service.IContactService;
import com.goldentoad.entity.Contact;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author sebastiancarballo
 */
@Controller
public class ContactController {
    
 @Autowired
    private IContactService contactService;

    @GetMapping("/contactN")
    public String contactN(Model model) {
        List<Contact> listContact = contactService.getAllContact();
        model.addAttribute("titulo", "Contact");
        model.addAttribute("contact", listContact);
        return "contactN";
    }

    @GetMapping("/crearContact")
    public String crearContact(Model model) {
        model.addAttribute("contact", new Contact());
        return "crearContact";
    }

   @PostMapping("/saveContact")
    public String saveContact(@ModelAttribute Contact contact) {
        contactService.saveContact(contact);
        return "redirect:/contactN";
    }

    @GetMapping("/editContact/{id_contact}")
    public String editContact(@PathVariable("id_contact") Integer idContact, Model model) {
       Contact contact = contactService.getContactById(idContact);
        model.addAttribute("contact", contact);
        return "crearContact";
    }

    @GetMapping("/deleteContact/{id_contact}")
    public String deleteContact(@PathVariable("id_contact") Integer idContact) {
        contactService.delete(idContact);
        return "redirect:/contactN";
    }
    
    @GetMapping("/contact")
    public String login(Model model) {
        List<Contact> listaContact = contactService.getAllContact();
        model.addAttribute("titulo", "Tabla Contact");
        model.addAttribute("contact", listaContact);
        return "contact";
    }

}

