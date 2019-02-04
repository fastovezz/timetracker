package timetracker.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import timetracker.db.entity.User;
import timetracker.db.entity.Work;
import timetracker.db.repo.UserRepo;
import timetracker.db.repo.WorkRepo;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController
{
    private UserRepo userRepo;
    private WorkRepo workRepo;

    @Autowired
    public UserController(UserRepo userRepo, WorkRepo workRepo)
    {
        this.userRepo = userRepo;
        this.workRepo = workRepo;
    }

    @PostMapping("/")
    public void save(@RequestBody User user) {
        userRepo.save(user);
    }

    @GetMapping("/{idUser}/projects{idProject}/works")
    public ResponseEntity<List<Work>> getUserWorksByProject(@PathVariable Integer idUser, @PathVariable Integer idProject) {
        return ResponseEntity.ok(workRepo.findByIdUserAndIdProject(idUser, idProject));
    }

}
