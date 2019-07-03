package com.example.demo.service;

import com.example.demo.dao.AdminMapper;
import com.example.demo.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/6/25.
 */
@Service
public class AdminServiceImpl implements AdminService{

    @Resource
    public AdminMapper adminMapper;

    @Override
    public Admin login(String account, String password) {
        return adminMapper.login(account, password);
    }

}
