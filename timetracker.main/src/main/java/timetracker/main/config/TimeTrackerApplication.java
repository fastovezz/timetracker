package timetracker.main.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"timetracker.main", "timetracker.**.config"})
public class TimeTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeTrackerApplication.class, args);
    }
}
