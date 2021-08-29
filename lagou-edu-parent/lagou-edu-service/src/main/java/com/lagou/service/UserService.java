package com.lagou.service;


import com.lagou.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户表(User)表服务接口
 *
 * @author Richard
 * @since 2021-08-28 22:47:21
 */
public interface UserService {
    /**
     * 用户登录
     *
     * @param phone    手机号
     * @param password 密码
     * @return 用户对象
     */
    User login(@Param("phone") String phone, @Param("password") String password);

}
