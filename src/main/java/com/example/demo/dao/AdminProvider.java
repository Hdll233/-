package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Administrator on 2019/6/27.
 */
public class AdminProvider {

    public String sql;
    public static String test = "ss";

    public static String getTest() {
        return test;
    }

    public static void setTest(String test) {
        AdminProvider.test = test;
    }

/*public String login(String account, String password){
        StringBuilder sql = new StringBuilder("SELECT * from admin");

        if (!account.equals("")) {
            sql.append(" where account = #{account}");
        }

        if (!password.equals("")) {
            sql.append(" and password = #{password}");
        }

        return sql.toString();
    }*/

    public String login(@Param("account") String account,@Param("password") String password){
        return new SQL(){{
            SELECT("*");
            FROM("admin");
            if(!account.equals("")){
                WHERE("account = #{account}");
            }
            if(!password.equals("")){
                WHERE("password = #{password}");
            }
            //从这个toString可以看出，其内部使用高效的StringBuilder实现SQL拼接
        }}.toString();
    }

    /*public String login(String account, String password){
        SQL sql = new SQL();
        sql.SELECT("*");
        sql.FROM("admin");

        if (!account.equals("")) {
            sql.WHERE("account = #{account}");
        }

        if (!password.equals("")) {
            sql.WHERE("password = #{password}");
        }

        return sql.toString();
    }*/

    /*public static void main(String[] args) {
        AdminProvider adminProvider = new AdminProvider();
        adminProvider.login("admin", "123153");
        System.out.println(adminProvider.login("admin", "123153"));
    }*/

    public static void main(String[] args) {
        AdminProvider adminProvider = new AdminProvider();
        System.out.println(AdminProvider.test);
        AdminProvider.test= "556";
        System.out.println(AdminProvider.test);

    }
}
