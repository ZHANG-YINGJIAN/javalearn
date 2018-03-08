package com.java1234.jdbc.chap4.sec3;

import com.java1234.jdbc.chap3.model.Student;
import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Update {
    private static DbUtil dbUtil = new DbUtil();

    /**
     * 更新学生
     * @param stu
     * @return
     * @throws Exception
     */

    private static int updateStu(Student stu) throws Exception{

        Connection con = dbUtil.getCon();
        String sql = "update student set name=? where id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1,stu.getName());//对应第一个？
        pstmt.setInt(2,stu.getId());//对应第二个？ 不能混
        int result = pstmt.executeUpdate();
        dbUtil.close(pstmt,con);
        return result;
    }

    public static void main(String[] args) throws Exception{
        Student stu = new Student(3,"zha");
        int result = updateStu(stu);
        if(result==1){
            System.out.println("更新成功");
        }else{
            System.out.println("更新失败");
        }

    }
}
