package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by reepa on 06-06-2016.
 */
@Controller
@RequestMapping("/posts")
public class PostController {

    @RequestMapping(value ="/", method= RequestMethod.GET)
    public String post(Model model) throws Exception {

        String name = null;
        model.addAttribute("greeting", "hello");
        //if(name == null) throw new NullPointerException("Null Exception");
        return "list";
    }

    /*@ExceptionHandler(Exception.class)
    public  String handleException(Exception exception, Model model) {
        model.addAttribute("errorMessage", exception.getMessage());
        return "postError";
    }*/
}
