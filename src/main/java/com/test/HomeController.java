package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome() {
        System.out.println("in home controller");
        return "index";
    }

    // This is for blogs template
    @GetMapping("/templates_blog")
    public String blogs(){
        System.out.println("In blogs template");
        System.out.println("Blog templet is from W3 school website.");
        return "templates_blog";
    }

}
