package com.hoxiansen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping(path = {"", "/"})
    public String indexSlash() {
        return "redirect:/admin/index";
    }

    @GetMapping("/index")
    public String index() {
        return "admin/index";
    }

    @GetMapping("/login")
    public String login() {
        return "admin/login";
    }
}
