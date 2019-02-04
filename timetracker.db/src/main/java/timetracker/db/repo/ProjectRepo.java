package timetracker.db.repo;

import org.springframework.data.repository.CrudRepository;
import timetracker.db.entity.Project;

import java.util.List;

public interface ProjectRepo extends CrudRepository<Project, Integer> {
    List<Project> findAll();
}
