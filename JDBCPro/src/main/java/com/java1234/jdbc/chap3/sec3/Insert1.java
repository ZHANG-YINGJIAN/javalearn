package com.java1234.jdbc.chap3.sec3;

import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.Statement;

public class Insert1 {
    public static void main(String[] args) throws Exception{
        DbUtil dbUtil = new DbUtil();
        Connection con = dbUtil.getCon();

        String sql = "insert into student values (null,'王',null,null)";
        Statement stmt = con.createStatement();
        int result = stmt.executeUpdate(sql);
        System.out.println("操作结果"+result);

        stmt.close();
        con.close();
    }
}
