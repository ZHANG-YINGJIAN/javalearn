package com.java1234.jdbc.chap4.sec4;

import com.java1234.jdbc.chap3.model.Student;
import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete {
    private static DbUtil dbUtil = new DbUtil();

    private static int delete(int id) throws Exception{
        Connection con = dbUtil.getCon();
        String sql = "DELETE FROM student WHERE id = ?";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1,id);
        int result = pstmt.executeUpdate();
        dbUtil.close(pstmt,con);
        return result;
    }
    public static void main(String[] args) throws Exception{
        int result = delete(3);
        if(result==1){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
}
