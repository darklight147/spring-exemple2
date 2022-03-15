package iir4.g5.cours.springexemple2.services;

import iir4.g5.cours.springexemple2.models.Project;
import iir4.g5.cours.springexemple2.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService <Project>  {

    @Autowired
    ProjectRepository<Project> projectRepository;

    @Override
    public void ajouter(Project o) {
        projectRepository.ajouter(o);
    }

    @Override
    public void modifier(Project o) {
        projectRepository.modifier(o);
    }

    @Override
    public void supprimer(int idProject) {
        projectRepository.supprimer(idProject);
    }

    @Override
    public List<Project> get() {
        return projectRepository.get();
    }

    @Override
    public Project get(int id) {
        return projectRepository.get(id);
    }
}
