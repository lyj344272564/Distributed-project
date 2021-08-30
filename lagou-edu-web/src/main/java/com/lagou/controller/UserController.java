package com.lagou.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lagou.entity.User;
import com.lagou.entity.UserDTO;
import com.lagou.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/login")
    public UserDTO login(String phone, String password) {
        UserDTO userDTO = new UserDTO();
        User user = null;

        System.out.println(phone+ " " +password );

        Integer i = userService.checkPhone(phone);

        if (i == 0) {
            userService.register(phone,password);
            userDTO.setMessage("手机号尚未注册，系统已帮您自动注册，请牢记密码！");
            user = userService.login(phone, password);
        } else {
            user = userService.login(phone, password);
            if (user == null) {
                userDTO.setState(300); //300表示失败
                userDTO.setMessage("帐号密码不匹配，登录失败！");
            } else {
                userDTO.setState(200); //200表示成功
                userDTO.setMessage("登录成功！");
            }
        }
        userDTO.setContent(user);

        return userDTO;

    }


}
