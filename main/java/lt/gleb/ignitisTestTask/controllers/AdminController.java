package lt.gleb.ignitisTestTask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/admin")
public class AdminController {
    // http://localhost:8081/admin/
    @GetMapping(path = "/")
    public String getHomePage(){
        return "admin/homepage";
    }
}
