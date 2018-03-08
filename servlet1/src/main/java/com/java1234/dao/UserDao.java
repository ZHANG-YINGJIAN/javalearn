package com.java1234.dao;

import com.java1234.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * dao对数据库进行操作
 */

public class UserDao {

    public User login(Connection con,User user) throws Exception{
        User resultUser = null;
        String sql = "select * from t_user where userName = ? and password =?";
        PreparedStatement pstmt = con.prepareStatement(sql);//预编译
        pstmt.setString(1,user.getUserName());
        pstmt.setString(2,user.getPassword());
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            resultUser = new User();
            resultUser.setUserName(rs.getString("userName"));
            resultUser.setPassword(rs.getString("password"));
        }
        return resultUser;
    }
}
