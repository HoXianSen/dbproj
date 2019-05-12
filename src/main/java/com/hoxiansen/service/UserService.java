package com.hoxiansen.service;

import com.hoxiansen.dao.UserDao;
import com.hoxiansen.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public User findUserByAccount(String account) {
        return userDao.findUserByAccount(account);
    }
}
