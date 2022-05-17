package lt.gleb.ignitisTestTask.controllers;

import lt.pusnis.ignitisTestTask.models.MyMessage;
import lt.pusnis.ignitisTestTask.models.MyRole;
import lt.pusnis.ignitisTestTask.models.MyUser;
import lt.pusnis.ignitisTestTask.services.MessageService;
import lt.pusnis.ignitisTestTask.services.RoleService;
import lt.pusnis.ignitisTestTask.services.UserService;
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
