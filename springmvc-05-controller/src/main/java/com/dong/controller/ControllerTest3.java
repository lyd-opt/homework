package com.dong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/l1")
public class ControllerTest3
{
    @RequestMapping("/t2")
    public String test(Model model){
        model.addAttribute("msg","ControllerTest03!");
        return "moc";
    }
}
