package lt.gleb.TestTask.controllers;

import lt.gleb.TestTask.models.MyMessage;
import lt.gleb.TestTask.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserRestController {

    @Autowired
    public MessageService messageService;

    //http://localhost:8081/user/posts
    @GetMapping(path="/posts")
    public Iterable<MyMessage> getAllMessages(){
        return messageService.getAllMyMessages();
    }
}
