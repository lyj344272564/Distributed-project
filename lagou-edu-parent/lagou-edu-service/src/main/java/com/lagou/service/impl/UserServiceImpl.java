package com.lagou.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.lagou.entity.User;
import com.lagou.mapper.UserDao;
import com.lagou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 用户表(User)表服务实现类
 *
 * @author Richard
 * @since 2021-08-28 22:47:22
 */
@Service
class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User login(String phone, String password) {
        return userDao.login(phone,password);
    }
}
