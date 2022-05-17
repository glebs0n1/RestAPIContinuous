package lt.pusnis.ignitisTestTask.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class MyRole {

    @Id
    @Column(name="role_id")
    private Integer id;

    @Column(name="role_name")
    private String name;

    public MyRole(){}

    public MyRole(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
