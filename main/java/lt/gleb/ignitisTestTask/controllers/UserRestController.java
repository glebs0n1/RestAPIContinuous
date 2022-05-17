package lt.pusnis.ignitisTestTask.controllers;

import lt.pusnis.ignitisTestTask.models.MyMessage;
import lt.pusnis.ignitisTestTask.services.MessageService;
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
