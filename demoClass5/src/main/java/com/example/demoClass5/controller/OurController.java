package com.example.demoClass5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OurController {

    @RequestMapping("/")
    //@ResponseBody

    public String ListItems(){

        //return "This is the list of all the Items";
        return "home";
    }
}
