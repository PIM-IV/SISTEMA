package com.sha.gestaoHoteleira.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() { return "login.html"; }
}
