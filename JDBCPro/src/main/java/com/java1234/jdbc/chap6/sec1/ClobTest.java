package com.java1234.jdbc.chap6.sec1;

import com.java1234.jdbc.chap3.model.Student;
import com.java1234.jdbc.chap3.util.DbUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClobTest {

    private static DbUtil dbUtil = new DbUtil();

    /**
     * 插入学生
     * @param stu
     * @return
     * @throws Exception
     */

    private static int addStu(Student stu) throws Exception{
        Connection con = dbUtil.getCon();
        String sql = "insert into student values (?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1,stu.getId());//第一个？
        pstmt.setString(2,stu.getName());//第二个？
        File context = stu.getContext();
        InputStream inputStream = new FileInputStream(context);
        pstmt.setAsciiStream(3, inputStream, context.length());

        int result = pstmt.executeUpdate();
        dbUtil.close(pstmt,con);
        return result;
    }

    public static void getStu(int id) throws Exception{
        Connection con = dbUtil.getCon();
        String sql = "select * from student where id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1,id);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
//            int id = rs.getInt("id");
            String name = rs.getString("name");

            Clob clob = rs.getClob("context");
            String context = clob.getSubString(1, (int) clob.length());

            System.out.println("学生姓名:"+name);
            System.out.println("学生介绍:"+context);
        }
        dbUtil.close(pstmt,con);

    }
    public static void main(String[] args) throws Exception{
//        File context = new File("C://hw.txt");
//        Student stu = new Student(5,"yong",context);
//        int result = addStu(stu);
//        if(result==1){
//            System.out.println("添加成功");
//        }else{
//            System.out.println("添加失败");
//        }
        getStu(5);
    }
}