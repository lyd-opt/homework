package com.dong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//代表这个类会被spring接管
public class ControllerTest2
{   @RequestMapping("/t2")
    public String test(Model model){
        model.addAttribute("msg","Controller实现2");
        return "hello";
    }
}
