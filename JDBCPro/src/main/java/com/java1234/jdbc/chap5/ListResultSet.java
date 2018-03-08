package com.java1234.jdbc.chap5;

import com.java1234.jdbc.chap3.model.Student;
import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ListResultSet {
    private static DbUtil dbUtil = new DbUtil();

    /**
     * 遍历结果
     * @throws Exception
     */


//    private static void listStudent() throws Exception{
//        Connection con = dbUtil.getCon();
//        String sql = "select * from student";
//        PreparedStatement pstmt = con.prepareStatement(sql);
//        ResultSet rs = pstmt.executeQuery();
//        while(rs.next()){
//            int id = rs.getInt("id");//获取第一列值
//            String name = rs.getString("name");//获取第二列值
//            System.out.println("学生编号: "+id+" 学生姓名: "+name);
//
//        }
//    }
//    public static void main(String[] args) throws Exception{
//        listStudent();
//    }
    private static List<Student> listStu() throws Exception{
        List<Student> studentList = new ArrayList<Student>();
        Connection con = dbUtil.getCon();
        String sql = "select * from student";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            int id = rs.getInt("id");//获取第一列值
            String name = rs.getString("name");//获取第二列值

            Student student = new Student(id,name);
            studentList.add(student);
        }
        return studentList;
    }

    public static void main(String[] args) throws Exception{
        List<Student> studentList = listStu();
        for(Student student:studentList){
            System.out.println(student);
        }
    }

}
