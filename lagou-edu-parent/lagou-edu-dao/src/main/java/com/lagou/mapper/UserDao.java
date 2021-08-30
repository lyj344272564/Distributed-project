package com.lagou.mapper;

import com.lagou.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * 用户表(User)表数据库访问层
 *
 * @author Richard
 * @since 2021-08-28 22:47:20
 */
@Service
public interface UserDao {
   /**
    * 用户登录
    *
    * @param phone    手机号
    * @param password 密码
    * @return 用户对象
    */
   User login(@Param("phone") String phone, @Param("password") String password);

   /**
    * 检查手机号是否注册
    * @param phone
    * @return 0 未注册   1 已注册
    */
   Integer checkPhone(String phone);

   /**
    * 用户注册
    * @param phone
    * @param password
    * @return
    */
   Integer register(@Param("phone") String phone, @Param("password") String password);

}

