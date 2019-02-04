package timetracker.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import timetracker.db.repo.UserRepo;

public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
}
