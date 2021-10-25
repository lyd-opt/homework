package com.dong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1
{@RequestMapping("/t3")
    public  String tset(Model model){
    model.addAttribute("msg","VIP客户！");
    return "hello";
}
}
