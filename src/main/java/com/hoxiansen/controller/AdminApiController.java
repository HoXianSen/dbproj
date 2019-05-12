package com.hoxiansen.controller;

import com.hoxiansen.common.CommonRes;
import com.hoxiansen.common.ResCode;
import com.hoxiansen.entity.User;
import com.hoxiansen.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/admin")
public class AdminApiController {
    @Resource
    private UserService userService;

    @GetMapping("/login")
    public CommonRes login(String account, String password) {
        CommonRes res = new CommonRes();
        User user = userService.findUserByAccount(account);
        if (user == null) {
            res.setCodeAndMsg(ResCode.USER_NOT_FOUND);
        }
        return res;
    }
}
