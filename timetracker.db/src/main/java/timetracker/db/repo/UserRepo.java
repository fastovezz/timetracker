package timetracker.db.repo;

import org.springframework.data.repository.CrudRepository;
import timetracker.db.entity.User;

public interface UserRepo extends CrudRepository<User, Integer>
{
}
