package com.java1234.jdbc.chap3.sec4;

import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.Statement;

/**
 * 删除学生
 */
public class Delete {
    private static DbUtil dbUtil = new DbUtil();

    private static int Delete(int id) throws Exception{
        Connection con = dbUtil.getCon();
        String sql = "delete from student Where id ="+id+"";
        Statement stmt = con.createStatement();
        int result = stmt.executeUpdate(sql);
        dbUtil.close(stmt,con);
        return result;
    }

    public static void main(String[] args) throws Exception{
        int result = Delete(17);
        if(result==1){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

}

