package lt.gleb.ignitisTestTask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/")
public class HomeController {
    // http://localhost:8081/
    @GetMapping(path = "/")
    public String getHomePage(){
        return "homepage";
    }

    // http://localhost:8081/login
    @GetMapping(path = "/login")
    public String getLoginPage(){
        return "login";
    }




}
