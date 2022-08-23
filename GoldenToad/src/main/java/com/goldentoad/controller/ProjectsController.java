package com.goldentoad.controller;

/**
 *
 * @author sebastiancarballo
 */
import com.goldentoad.Service.IProjectsService;
import com.goldentoad.entity.Projects;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectsController {

    @Autowired
    private IProjectsService projectsService;

    @GetMapping("/projects")
    public String projectsN(Model model) {
        List<Projects> listProjects = projectsService.getAllProjects();
        model.addAttribute("titulo", "Projects");
        model.addAttribute("projects", listProjects);
        return "projects";
    }

    @GetMapping("/crearProjects")
    public String crearProjects(Model model) {
        model.addAttribute("projects", new Projects());
        return "crearProjects";
    }

    @PostMapping("/saveProjects")
    public String saveProjects(@ModelAttribute Projects projects) {
        projectsService.saveProjects(projects);
        return "redirect:/projects";
    }

    @GetMapping("/editProjects/{id_projects}")
    public String editarProjects(@PathVariable("id_projects") Integer idProjects, Model model) {
        Projects projects = projectsService.getProjectsById(idProjects);
        model.addAttribute("projects", projects);
        return "crearProjects";
    }

    @GetMapping("/deleteProjects/{id_projects}")
    public String eliminarProjects(@PathVariable("id_projects") Integer idProjects) {
        projectsService.delete(idProjects);
        return "redirect:/projects";
    }
    
        @GetMapping("/portafolio")
    public String login(Model model) {
        List<Projects> listaProjects = projectsService.getAllProjects();
        model.addAttribute("titulo", "Tabla Projects");
        model.addAttribute("projects", listaProjects);
        return "portafolio";
    }

}
