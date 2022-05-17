package lt.gleb.ignitisTestTask.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")

    @ModelAttribute
    public String getErrorPath(Model model, HttpServletRequest request) {
        model.addAttribute("message", "Something went wrong!");
        return "/error";
    }


}
