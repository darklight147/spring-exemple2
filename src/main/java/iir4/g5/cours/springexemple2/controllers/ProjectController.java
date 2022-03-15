package iir4.g5.cours.springexemple2.controllers;


import iir4.g5.cours.springexemple2.exception.NotFoundException;
import iir4.g5.cours.springexemple2.models.Project;
import iir4.g5.cours.springexemple2.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    ProjectService<Project> projectService;

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return  projectService.get();
    }

    @GetMapping("/projects/{idProject}")
    @ResponseBody
    public Project getProject(@PathVariable  int idProject) {
        Project project = projectService.get(idProject);

        if (project == null) {
            throw new NotFoundException("No project found");
        }

        return project;
    }

    @PostMapping("/projects")
    public void addProject(@RequestBody Project p) {
        projectService.ajouter(p);

        return;
    }

    @PutMapping("/projects")
    public void updateProject(@RequestBody Project p) {
        projectService.modifier(p);

        return;
    }


    @DeleteMapping("/projects/{idProject}")
    public void deleteProject(@PathVariable int idProject) {
        projectService.supprimer(idProject);

        return;
    }



}
