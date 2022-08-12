package com.goldentoad.Service;


import com.goldentoad.entity.Projects;
import com.goldentoad.repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ProjectsService implements IProjectsService {


    @Autowired

    private ProjectsRepository projectsRepository;
   
    @Override
    public List<Projects> getAllProjects() {
        return (List<Projects>) projectsRepository.findAll();
    }

    @Override
    public Projects getProjectsById(int id_projects) {
        return projectsRepository.findById(id_projects).orElse(null);
    }

    @Override
    public void saveProjects(Projects projects) {
        projectsRepository.save(projects);
    }

    @Override
    public void delete(int id_projects) {
        projectsRepository.deleteById(id_projects);
    }
    
//    @Override
//    public Projects findByTitle(String title) {
//        return projectsRepository.findByTitle(title);
//    }

    
}
