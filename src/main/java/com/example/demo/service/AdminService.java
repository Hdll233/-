package com.example.demo.service;

import com.example.demo.pojo.Admin;

/**
 * Created by Administrator on 2019/6/25.
 */
public interface AdminService {
    /**
     * 登录
     * @param account
     * @param password
     * @return
     */
    public Admin login(String account, String password);
}
