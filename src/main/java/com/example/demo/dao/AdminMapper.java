package com.example.demo.dao;

import com.example.demo.pojo.Admin;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/6/25.
 */
@Mapper
@Repository
public interface AdminMapper {

    /**
     * 登录
     * @return
     */
    //@Select("SELECT * from admin where account=#{account} and password=#{password}")
    @SelectProvider(type = AdminProvider.class, method = "login")
    Admin login(@Param("account") String account, @Param("password") String password);
}
