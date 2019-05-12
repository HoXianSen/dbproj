package com.hoxiansen.controller;

import com.hoxiansen.common.CommonRes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminApiController {
    @GetMapping("/login")
    public CommonRes login() {
        CommonRes res = new CommonRes();
        return res;
    }
}
