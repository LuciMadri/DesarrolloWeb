
package com.goldentoad.controller;


import com.goldentoad.Service.IProjectService;
import com.goldentoad.entity.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
/**
 *
 * @author David
 */

//Definimos de que tipo de objeto va a ser nuestra clase
@Controller
public class ProjectController {
   
    //Hacemos inyeccion de dependencias
    @Autowired
    //El controller utiliza el servicio, en este caso personaService
    private IProjectService projectService;
    

    
     
    

}
