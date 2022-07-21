package com.goldentoad.controller;

import com.goldentoad.Service.IProjectService;
import com.goldentoad.entity.Helpform;
import com.goldentoad.entity.News;
import com.goldentoad.entity.Project;
import com.goldentoad.entity.Userform;
import com.goldentoad.service.IHelpformService;
import com.goldentoad.service.INewsService;
import com.goldentoad.service.IUserformService;
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
    private IUserformService userformService;

    @Autowired
    private INewsService newsService;

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
    
    @GetMapping("/helpformN")
    public String createHelpform(Model model){
        List<Userform> listUsers = userformService.listUser();
        model.addAttribute("helpform", new Helpform());       
        model.addAttribute("users", listUsers);
        return "crearHelpform";
    }

   
    
    @PostMapping("/saveHelpform")
    public String saveHelpform(@ModelAttribute Helpform helpform) {
        //Con esto lo guardo en la bd
        helpformService.saveHelpform(helpform);

        //Aqui quiero que me redirija a otro get mapping
        return "redirect:/helpform";
    }

    @GetMapping("/editHelpform/{id_help}")
    public String editHelpform(@PathVariable("id_help") Long idHelp, Model model) {
        Helpform helpform = helpformService.getHelpformById(idHelp);
        List<Userform> listUser = userformService.listUser();
        model.addAttribute("helpform", helpform);
        model.addAttribute("users", listUser);
        return "crearHelpform";
        
        
    }
    
    @GetMapping("/deleteHelpform/{id_help}")
    public String eliminarHelpform(@PathVariable("id_help") Integer idhelp) {
        helpformService.deleteById(idhelp);
        return "redirect:/helpform";
    }

    //==========================================================================
    //===============================NEWS=======================================
    //==========================================================================
    @GetMapping("/newsN")
    public String news(Model model) {
        List<News> listNews = newsService.getAllNews();
        model.addAttribute("titulo", "News Table");
        model.addAttribute("news", listNews);
        return "newsN";
    }

    //Crear una persona nueva CRUD
    @GetMapping("/crearNews")
    public String crearNews(Model model) {
        model.addAttribute("news", new News());
        return "crearNews";
    }

    @PostMapping("/save")
    public String guardarNews(@ModelAttribute News news) {
        newsService.saveNews(news);
        return "redirect:/newsN";
    }

    @GetMapping("/editNews/{id_news}")
    public String editarNews(@PathVariable("id_news") Integer idNews, Model model) {
        News news = newsService.getNewsById(idNews);
        model.addAttribute("news", news);
        return "crearNews";
    }

    @GetMapping("/delete/{id_news}")
    public String eliminarNews(@PathVariable("id_news") Integer idNews) {
        newsService.delete(idNews);
        return "redirect:/newsN";
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

}
