package com.java1234.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static String dbUrl = "jdbc:mysql://localhost:3306/db_jsp";
    private static String dbUserName = "root";
    private static String dbPassWord = "root";
    private static String jdbcName = "com.mysql.jdbc.Driver";

    public Connection getCon() throws Exception{
        Class.forName(jdbcName);//反射 实例化驱动包
        Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassWord);
        return con;
    }

//    public void close(Statement stmt, Connection con) throws Exception{
//        if(stmt!=null){
//            stmt.close();
//            if(con!=null){
//                con.close();
//            }
//        }
//    }

    public void closeCon(Connection con) {
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DbUtil dbUtil = new DbUtil();
        try {
            dbUtil.getCon();
            System.out.println("链接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

