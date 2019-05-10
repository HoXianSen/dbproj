package com.hoxiansen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/admin")
public class AdminController {

    @GetMapping("/")
    public String index() {
        return "admin/index";
    }
}
