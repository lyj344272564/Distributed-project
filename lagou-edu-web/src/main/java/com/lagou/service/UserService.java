package com.lagou.service;


import com.lagou.entity.User;

public interface UserService {

    /**
     * @param phone    手机号
     * @param password 密码
     * @return 用户对象
     */
    User login(String phone, String password);

    /**
     * 检查手机号是否注册过
     *
     * @param phone 手机号
     * @return 0：未注册 ， 1：已注册
     */
    Integer checkPhone(String phone);

    /**
     * 用户注册
     *
     * @param phone    手机号
     * @param password 密码
     * @return 受影响的行数
     */
    Integer register(String phone, String password);
}
