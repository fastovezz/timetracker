package timetracker.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import timetracker.db.entity.Work;
import timetracker.db.repo.WorkRepo;
import timetracker.main.service.WorkService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/works")
public class WorkController {
    private WorkService workService;
    private WorkRepo workRepo;

    @Autowired
    public WorkController(WorkService workService, WorkRepo workRepo) {
        this.workService = workService;
        this.workRepo = workRepo;
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Work>> getAll() {
        return ResponseEntity.ok(workService.findAll());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        Optional<Work> loadedWorkOption = workRepo.findById(id);
        if(loadedWorkOption.isPresent()) {
            workRepo.delete(loadedWorkOption.get());
        }
    }
}
