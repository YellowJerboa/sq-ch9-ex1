package com.example.controllers;

import com.example.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private final LoggedUserManagementService loggedUserManagementService;

    @GetMapping("main")
    public String mainGet () {
        return "main.html";
    }

    public MainController (LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }
}
