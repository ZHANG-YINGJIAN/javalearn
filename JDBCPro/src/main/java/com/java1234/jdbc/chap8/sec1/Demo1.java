package com.java1234.jdbc.chap8.sec1;

import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class Demo1 {
    public static void main(String[] args) throws Exception{
        DbUtil dbUtil = new DbUtil();
        Connection con = dbUtil.getCon();
        DatabaseMetaData dmd = con.getMetaData();//获取元数据
        System.out.println("数据库名称： " + dmd.getDatabaseProductName());
        System.out.println("数据库版本： " + dmd.getDriverMajorVersion() + "." + dmd.getDriverMinorVersion());

    }
}
