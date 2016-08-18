package com.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pradeep on 07-06-2016.
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(Exception.class)
    public  String handleException(Exception exception, Model model) {
        model.addAttribute("errorMessage", exception.getMessage());
        model.addAttribute("error", "Reepa");
        return "postError";
    }
}
