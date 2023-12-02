package com.hagar.sprintboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(required = false) String name , @RequestParam(required = false) String color, Model model) {
        model.addAttribute("userName",name);
        model.addAttribute("color",color);
        return "hello.html";
    }
//    @RequestMapping("/hello/{name}/{color}")
//    public String hello(@PathVariable String name ,@PathVariable String color, Model model) {
//        model.addAttribute("userName",name);
//        model.addAttribute("color",color);
//        return "hello.html";
//    }
}
