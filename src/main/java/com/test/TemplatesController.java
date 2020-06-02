package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplatesController {

    // This is for gourmet template
    @GetMapping("/gourmet_catering")
    public String gourmet(){
        System.out.println("In gourmet catering template");
        return "templates_gourmet_catering";
    }

    // This is for architect template
    @GetMapping("/templates_architect")
    public String architect(){
        System.out.println("In architect template");
        System.out.println("Architect templet is from W3 school website.");
        return "templates_architect";
    }

    // This is for blogs template
    @GetMapping("/templates_blog")
    public String blogs(){
        System.out.println("In blogs template");
        System.out.println("Blog templet is from W3 school website.");
        return "templates_blog";
    }
}
