package lt.gleb.TestTask.controllers;

import lt.gleb.TestTask.models.MyMessage;
import lt.gleb.TestTask.models.MyRole;
import lt.gleb.TestTask.models.MyUser;
import lt.gleb.TestTask.services.MessageService;
import lt.gleb.TestTask.services.RoleService;
import lt.gleb.TestTask.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin")
public class AdminRestController {
    @Autowired
    public UserService userService;

    //http://localhost:8081/admin/users
    @GetMapping(path="/users")
    public Iterable<MyUser> getAllUsers(){
        return userService.getAllMyUsers();
    }
    @Autowired
    public RoleService roleService;

    //http://localhost:8081/admin/roles
    @GetMapping(path="/roles")
    public Iterable<MyRole> getAllRoles(){
        return roleService.getAllMyRoles();
    }

    @Autowired
    public MessageService messageService;

    //http://localhost:8081/admin/posts
    @GetMapping(path="/posts")
    public Iterable<MyMessage> getAllMessages(){
        return messageService.getAllMyMessages();
    }
}
