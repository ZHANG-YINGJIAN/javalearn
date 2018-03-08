package com.java1234.jdbc.chap3.sec2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2 {
    private static String dbUrl = "jdbc:mysql://localhost:3306/db_jsp";
    private static String dbUserName = "root";
    private static String dbPassWord = "root";
    private static String jdbcName = "com.mysql.jdbc.Driver";


    public static void main(String[] args){
        try {
            Class.forName(jdbcName);
            System.out.println("驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("驱动加载失败");
        }
        Connection con = null;
        try {
            //获取数据库连接
            con = DriverManager.getConnection(dbUrl,dbUserName,dbPassWord);
            System.out.println("获取数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
