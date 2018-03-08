package com.java1234.jdbc.chap4.sec2;

import com.java1234.jdbc.chap3.model.Student;
import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Insert {

    private static DbUtil dbUtil = new DbUtil();

    /**
     * 插入学生
     * @param stu
     * @return
     * @throws Exception
     */

    private static int addStu(Student stu) throws Exception{
        Connection con = dbUtil.getCon();
        String sql = "insert into student values (?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
//        pstmt.setInt(1,stu.getId());
//        pstmt.setString(2,stu.getName());

        pstmt.setInt(1,stu.getId());//第一个？
        pstmt.setString(2,stu.getName());//第二个？
        int result = pstmt.executeUpdate();
        dbUtil.close(pstmt,con);
        return result;
    }

    public static void main(String[] args) throws Exception{
        Student stu = new Student(7,"yong");
        int result = addStu(stu);
        if(result==1){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
}
