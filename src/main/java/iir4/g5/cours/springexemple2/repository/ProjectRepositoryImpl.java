package iir4.g5.cours.springexemple2.repository;

import iir4.g5.cours.springexemple2.models.Project;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository<Project>{

    static private List<Project> projects  = new ArrayList<>();

    @Override
    public void ajouter(Project project) {
        projects.add(project);
    }

    @Override
    public void modifier(Project project) {
        int id = project.getId();

        for (Project p: projects)  {
            if (p.getId() == p.getId()) {
                p.setDescription(project.getDescription());
                break;
            }
        }

    }

    @Override
    public void supprimer(int idProject) {
        for (Project p: projects)  {
            if (p.getId() == idProject) {
                projects.remove(p);
                break;
            }
        }
    }

    @Override
    public List<Project> get() {
        return projects;
    }

    @Override
    public Project get(int idProject) {
        for (Project p: projects) {
            if (p.getId() == idProject) {
                return p;
            }
        }

        return null;
    }
}
