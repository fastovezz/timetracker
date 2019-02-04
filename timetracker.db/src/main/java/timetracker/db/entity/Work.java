package timetracker.db.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "work")
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_work")
    private Integer id;

    @NotNull
    @Column
    private String task;

    @Column
    private String comment;

    @Column(name = "id_user", insertable = false, updatable = false)
    private Integer idUser;

    @Column(name = "id_project", insertable = false, updatable = false)
    private Integer idProject;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_project")
    Project project;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdProject() {
        return idProject;
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Work work = (Work) o;
        return Objects.equals(id, work.id) &&
                Objects.equals(task, work.task);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, task);
    }
}
