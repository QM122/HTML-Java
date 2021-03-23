package com.example.HTML_Java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/greeting")
    public String index(Model model){
        Person person = new Person(111, "Ali", "Ali11@gmail.com");
        model.addAttribute(person);
        return "greeting";
    }


//    @GetMapping("/greeting")
//    public String greeting
//    (
//        @RequestParam(name="name", required = false, defaultValue = "World")
//        String name, Model model
//    )
//    {
//        model.addAttribute("name", name);
//        return "greeting";
//    }
}
