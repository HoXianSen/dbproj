package com.hoxiansen.dao;

import com.hoxiansen.entity.User;

public interface UserDao {
    User findUserByAccount(String account);
}
