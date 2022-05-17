package lt.gleb.TestTask.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="messages")
public class MyMessage {
    @Id
    @Column(name="message_id")
    private Integer id;

    @Column(name="message_text")
    private String text;

    @Column(name="message_created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name="message_author",referencedColumnName="user_id")
    private MyUser myUser;

    public MyMessage() {
    }

    public MyMessage(Integer id, String text, MyUser myUser,LocalDateTime createdAt) {
        this.id = id;
        this.text = text;
        this.myUser = myUser;
        this.createdAt = createdAt;
    }

    public MyUser getMyUser() {
        return myUser;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setText(String text) {
        this.text = text;
    }
}
