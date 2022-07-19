package com.goldentoad.controller;

import com.goldentoad.entity.Helpform;
import com.goldentoad.entity.Userform;
import com.goldentoad.service.IHelpformService;
import com.goldentoad.service.IUserformService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

//Definimos de que tipo de objeto va a ser nuestra clase
@Controller
public class HelpformController {

    //Hacemos inyeccion de dependencias
    @Autowired
    //El controller utiliza el servicio, en este caso personaService
    private IHelpformService helpformService;

    @Autowired
    private IUserformService userformService;

    /*El GetMapping crea la ruta, entonces al escribir localhost/persona 
    nos ejecuta el metodo
     */

    @GetMapping("/helpform")

    //Puede ser cualquier nombre en vez de INDEX
    /*Aqui le pasamos un objeto de tipo model, ya que le pasamos informacion
    que puede ser sustituida ya que proviene de la bd, entonces la forma en la
    que le pasamos esos valores es por el objeto de tipo model*/
    public String index(Model model) {
        /*Aqui creamos una lista y le pasamos la informacion por medio del metodo
          getAllPersona de nuestra clase interface.*/
        List<Helpform> listHelpform = helpformService.getAllHelpform();

        /*Aqui, en nuestro html donde se encuentre la palabra titulo lo va a 
          sustituir por tabla persona*/
        model.addAttribute("titulo", "Helpform Table");

        /*Aqui, en nuestro html donde se encuentre la palabra personas lo va a 
         sustituir por la listaPersona*/
        model.addAttribute("helpform", listHelpform);

        //Aqui retornamos un html que se llama personas.
        return "helpform";
    }
    
    @GetMapping("/save")
    public String saveHelpform(@ModelAttribute Helpform helpform){
        //Con esto lo guardo en la bd
        helpformService.saveHelpform(helpform);
        
        //Aqui quiero que me redirija a otro get mapping
        return "redirect:/helpform";
    }
    
    @GetMapping("/editHelpform/{id}")
    public String editHelpform(@PathVariable("id") Long idHelpform, Model model){
        Helpform helpform = helpformService.getHelpformById(idHelpform);
        List<Userform> listUserform = userformService.listUser();
        model.addAttribute("helpform", helpform);
        model.addAttribute("userform", listUserform);
        return "create";
    } 
}
