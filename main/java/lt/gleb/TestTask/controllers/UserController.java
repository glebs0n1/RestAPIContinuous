package lt.gleb.TestTask.controllers;

import lt.gleb.TestTask.models.MyMessage;
import lt.gleb.TestTask.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    // http://localhost:8081/user/
    @GetMapping(path = "/")
    public String getHomePage(){
        return "user/homepage";
    }


}
