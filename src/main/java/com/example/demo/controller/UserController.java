package com.example.demo.controller;

import com.example.demo.pojo.Admin;
import com.example.demo.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/6/24.
 */
@Controller
public class UserController {

    @Resource
    public AdminService adminService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/register")
    public String register(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("/login")
    public Admin login(@Param("account") String account, @Param("password") String password){
        Admin admin = adminService.login(account, password);
        if (admin == null){
            return null;
        }
        return admin;
    }

    @ResponseBody
    @RequestMapping("/test")
    public Admin test(){
        Admin admin = new Admin();
        admin.setAccount("aaa");
        admin.setPassword("123456");
        return admin;
    }
}
