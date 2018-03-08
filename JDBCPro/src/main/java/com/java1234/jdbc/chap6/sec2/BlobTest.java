package com.java1234.jdbc.chap6.sec2;

import com.java1234.jdbc.chap3.model.Student;
import com.java1234.jdbc.chap3.util.DbUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;

public class BlobTest {
    private static DbUtil dbUtil = new DbUtil();

    private static int addStu(Student stu) throws Exception{
        Connection con = dbUtil.getCon();
        String sql = "insert into student values (?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1,stu.getId());
        pstmt.setString(2,stu.getName());

        File context = stu.getContext();
        InputStream inputStream = new FileInputStream(context);
        pstmt.setAsciiStream(3,inputStream,context.length());

        File pic = stu.getPic();
        InputStream inputStream1 = new FileInputStream(pic);
        pstmt.setBinaryStream(4,inputStream1,pic.length());

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
            String name = rs.getString("name");

            Clob c = rs.getClob("context");
            String context = c.getSubString(1, (int) c.length());

            Blob b = rs.getBlob("pic");
            FileOutputStream out = new FileOutputStream(new File("D://pic2.jpg"));
            out.write(b.getBytes(1, (int) b.length()));
            out.close();

            System.out.println("学生姓名:"+name);
            System.out.println("学生介绍:"+context);

        }
        dbUtil.close(pstmt,con);
    }

    public static void main(String[] args) throws Exception{
//        File context = new File("c://hw.txt");
//        File pic = new File("c://b.jpg");
//        Student stu = new Student(9, "JIE", context, pic);
//        int result = addStu(stu);
//        if(result==1){
//            System.out.println("添加成功");
//        }else{
//            System.out.println("添加失败");
//        }

        getStu(9);
    }
}
