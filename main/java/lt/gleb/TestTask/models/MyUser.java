package lt.gleb.TestTask.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


@Entity
@Table(name = "users")

public class MyUser {

    @Id
    @GeneratedValue
    @Column(name="user_id")
    private int id;

    @Column(name="user_name")
    private String name;

    @ManyToOne
    @JoinColumn(name="user_role",referencedColumnName="role_id")
    private MyRole myRole;

    @Column(name="deleted")
    private boolean deleted;

    @JsonIgnore
    @Column(name="user_token")
    private String token;

    @Transient
    private Set<MyRole> roles = new HashSet<>();

    public MyUser(){
    }

    public MyUser(int id, String name, MyRole myRole, boolean deleted, String token) {
        this.id = id;
        this.name = name;
        this.myRole = myRole;
        this.deleted = deleted;
        this.token = token;
        this.roles.add(myRole);
    }

    public boolean hasRole(String roleName) {
        Iterator<MyRole> iterator = this.roles.iterator();
        while (iterator.hasNext()) {
            MyRole role = iterator.next();
            if (role.getName().equals(roleName)) {
                return true;
            }
        }

        return false;
    }

    public String getMyRoleName(MyRole myRole){
        return myRole.getName();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MyRole getMyRole() {
        return myRole;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String getToken() {
        return token;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Set<MyRole> getRoles() {
        return roles;
    }
}
