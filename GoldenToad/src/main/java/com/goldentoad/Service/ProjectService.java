package com.goldentoad.Service;

import com.goldentoad.entity.Project;
import com.goldentoad.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author David
 */
//Le decimos de que es el tipo de clase que va implementar en este caso Servicio
@Service

public class ProjectService implements IProjectService {

    //Autowired para hacer inyeccion de dependencias. 
    @Autowired
    //Inyectamos la clase de personaRepository
    private ProjectRepository projectRepository;
    //Aqui nada mas generamos todos los metodos abstractos.

    @Override
    public List<Project> getAllProject() {
        return (List<Project>) projectRepository.findAll();
    }

    @Override
    public Project getProjectById(int id_projects) {
        return projectRepository.findById(id_projects).orElse(null);
    }

    @Override
    public void saveProject(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void delete(int id_projects) {
        projectRepository.deleteById(id_projects);
    }

}
