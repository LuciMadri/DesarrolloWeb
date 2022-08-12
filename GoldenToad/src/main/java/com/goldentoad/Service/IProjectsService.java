
package com.goldentoad.Service;
import com.goldentoad.entity.Projects;
import java.util.List;

/*
    Aqui implementamos lo metodos que vamos a utilizar para 
    hacer las consultas a nuestra base de datos
*/

public interface IProjectsService {
    
    public List<Projects> getAllProjects();
    
   
    public Projects getProjectsById (int id_projects);
    
  
    public void saveProjects(Projects projects);

   
    public void delete(int id_projects);
}