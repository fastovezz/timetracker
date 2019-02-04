package timetracker.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import timetracker.db.entity.Work;
import timetracker.db.repo.WorkRepo;

import java.util.List;

@Service
public class WorkService {
    private WorkRepo workRepo;

    @Autowired
    public WorkService(WorkRepo workRepo) {
        this.workRepo = workRepo;
    }

    public List<Work> findAll() {
        return (List<Work>) workRepo.findAll();
    }
}
