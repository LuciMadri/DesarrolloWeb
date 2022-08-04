package com.goldentoad.controller;

import com.goldentoad.Service.IProjectService;
import com.goldentoad.entity.Helpform;

import com.goldentoad.entity.Project;

import com.goldentoad.service.IHelpformService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//Definimos de que tipo de objeto va a ser nuestra clase
@Controller
public class HelpformController {

    //Hacemos inyeccion de dependencias
    @Autowired
    //El controller utiliza el servicio, en este caso personaService
    private IHelpformService helpformService;

    @Autowired
    private IProjectService projectService;

    //==========================================================================
    //--------------------------- Helpform -------------------------------------
    //==========================================================================
    /*El GetMapping crea la ruta, entonces al escribir localhost/persona 
    nos ejecuta el metodo
     */
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

    //==========================================================================
    //--------------------------- Projects -------------------------------------
    //==========================================================================
    @GetMapping("/projects")
    public String project(Model model) {
        List<Project> listProject = projectService.getAllProject();
        model.addAttribute("titulo", "Projects Table");
        model.addAttribute("project", listProject);

        //Aqui retornamos un html que se llama personas.
        return "projects";
    }

    //Crear una persona nueva CRUD
    @GetMapping("/projectN")
    public String crearProject(Model model) {
        model.addAttribute("projects", new Project());
        return "crearProjects";
    }

    @PostMapping("/saveProject")
    public String saveProject(@ModelAttribute Project project) {
        //Con esto lo guardo en la bd
        projectService.saveProject(project);

        //Aqui quiero que me redirija a otro get mapping
        return "redirect:/projects";
    }

    // Aqui en editar solo se esta usando project
    @GetMapping("/editProject/{id_projects}")
    public String editProject(@PathVariable("id_projects") Integer idProject, Model model) {
        Project project = projectService.getProjectById(idProject);
        model.addAttribute("projects", project);
        return "crearProjects";
    }

    @GetMapping("/deleteProject/{id_projects}")
    public String eliminarProject(@PathVariable("id_projects") Integer idProject) {
        projectService.delete(idProject);
        return "redirect:/projects";
    }

    @GetMapping("/home")
    public String home() {

        return "home";
    }

    @GetMapping("/index")
    public String index() {

        return "index";
    }

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/portafolio")
    public String portafolio() {

        return "portafolio";
    }

    @GetMapping("/contact")
    public String contact() {

        return "contact";
    }

}
