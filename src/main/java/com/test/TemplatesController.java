package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplatesController {

    @GetMapping("/gourmet_catering")
    public String gourmet(){
        System.out.println("In gourmet catering template");
        return "templates_gourmet_catering";
    }

    @GetMapping("/templates_architect")
    public String architect(){
        System.out.println("In architect template");
        return "templates_architect";
    }
}
