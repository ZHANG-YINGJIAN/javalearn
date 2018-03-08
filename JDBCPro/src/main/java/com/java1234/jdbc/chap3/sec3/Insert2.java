package com.java1234.jdbc.chap3.sec3;

import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.Statement;

public class Insert2 {

    private static DbUtil dbUtil=new DbUtil();

    /**
     * 添加学生
     * @param id
     * @param name
     * @return
     * @throws Exception
     */

    private static int addStu(int id,String name) throws Exception{
        Connection con = dbUtil.getCon();//获取数据库链接
        String sql = "insert into student values("+id+",'"+name+"')";//创建SQL语句
        Statement stmt = con.createStatement();//获取Statement 用于将SQL 语句发给数据库
        int result = stmt.executeUpdate(sql);//Statement方法
        dbUtil.close(stmt,con);
        return result;

    }
    public static void main(String[] args) throws Exception{
        int result = addStu(3,"wang");
        if(result==1){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }

    }
}
