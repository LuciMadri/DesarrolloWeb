
package com.goldentoad.Service;
import com.goldentoad.entity.Project;
import java.util.List;

/*
    Aqui implementamos lo metodos que vamos a utilizar para 
    hacer las consultas a nuestra base de datos
*/

public interface IProjectService {
    
     //Este metodo nos permite devolver todas las personas que hay en nuestra bd
    //Como son varios datos se guarda en una lista con objeto de tipo Persona
    public List<Project> getAllProject();
    
    //Cuando yo le paso el Id me va a devolver toda la info de esa persona
    //Como solo es uno se guarda en un objeto de tipo persona
    public Project getProjectById (int id_projects);
    
    //Estos metodos son void porque no van a retornar nada
    
    //Este metodo va a guardar una fila nueva en nuestra bd
    public void saveProject(Project project);
    
    //Este metodo va a guardar el id y va a buscar el que tenga el mismo
    //y eliminarlo
    public void delete(int id_projects);
}