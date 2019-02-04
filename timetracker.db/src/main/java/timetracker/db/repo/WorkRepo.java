package timetracker.db.repo;

import org.springframework.data.repository.CrudRepository;
import timetracker.db.entity.Work;

import java.util.List;

public interface WorkRepo extends CrudRepository<Work, Integer> {
    List<Work> findByIdUserAndIdProject(Integer idUser, Integer IdProject);
}
