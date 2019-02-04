package timetracker.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import timetracker.db.entity.Project;
import timetracker.db.repo.ProjectRepo;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/projects")
public class ProjectController {

    private ProjectRepo projectRepo;

    @Autowired
    public ProjectController(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @GetMapping("/")
    public ResponseEntity<List<Project>> getAll() {
        return ResponseEntity.ok(projectRepo.findAll());
    }

    @PostMapping("/")
    public void save(@RequestBody Project project) {
        projectRepo.save(project);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Project project) {
        Optional<Project> loadedProjectOption = projectRepo.findById(id);
        if(loadedProjectOption.isPresent()) {
            Project loadedProject = loadedProjectOption.get();
            loadedProject.setName(project.getName());
            projectRepo.save(loadedProject);
        }
    }

}
