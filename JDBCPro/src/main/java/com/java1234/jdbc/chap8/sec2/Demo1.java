package com.java1234.jdbc.chap8.sec2;

import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

public class Demo1 {
    public static void main(String[] args) throws Exception{
        DbUtil dbUtil = new DbUtil();
        Connection con = dbUtil.getCon();
        String sql = "select * from student";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSetMetaData rsmd = pstmt.getMetaData();
        int num = rsmd.getColumnCount();//获取总列数
        System.out.println("总共"+num+"列");
        for (int i = 1; i <=num ; i++) {//i从1开始 到num结束 不能是0开始
            System.out.println(rsmd.getColumnName(i)+","+rsmd.getColumnTypeName(i) );
        }
    }
}
