package com.java1234.jdbc.chap3.sec3;

import com.java1234.jdbc.chap3.model.Student;
import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.Statement;

public class Insert3 {
    private static DbUtil dbUtil=new DbUtil();

    /**
     * 添加学生
     * @param id
     * @param name
     * @return
     * @throws Exception
     */

    private static int addStu(Student stu) throws Exception{
        Connection con = dbUtil.getCon();
        String sql = "insert into student values('"+stu.getId()+"','"+stu.getName()+"')";
        Statement stmt = con.createStatement();
        int result = stmt.executeUpdate(sql);
        dbUtil.close(stmt,con);
        return result;

    }
    public static void main(String[] args) throws Exception{
        Student stu = new Student(4,"zhou");
        int result = addStu(stu);
        if(result==1){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }

    }
}
