package com.mycompany.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for handling home page requests
 */
@Controller
public class HomeController {

    /**
     * Handle requests to the root URL
     * @return the name of the view template to render
     */
    @GetMapping("/")
    public String home() {
        return "index";
    }
}
