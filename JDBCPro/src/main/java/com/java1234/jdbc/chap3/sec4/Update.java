package com.java1234.jdbc.chap3.sec4;

import com.java1234.jdbc.chap3.model.Student;
import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.Statement;

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
        String sql = "update student set name = '"+stu.getName()+"'WHERE id="+stu.getId()+"";
        //如果是字符 用'"++"'  如果是整型 用"++"即可
        Statement stmt = con.createStatement();
        int result = stmt.executeUpdate(sql);
        dbUtil.close(stmt,con);
        return result;
    }

    public static void main(String[] args) throws Exception{
        Student stu = new Student(13,"小",null,null);
        int result = updateStu(stu);
        if(result==1){
            System.out.println("更新成功");
        }else{
            System.out.println("更新失败");
        }


    }
}
