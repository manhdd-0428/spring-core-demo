package com.example.demoweb.controller;

import com.example.demoweb.service.HomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private HomeService homeService;

    public HomeController() {}
    public  HomeController(HomeService homeService) {
        this.homeService = homeService;
    }
    @GetMapping("/")
    public String function() {
        return "index";
    }

    public String getMessage() {
        return this.homeService.getHomePage();
    }
}
