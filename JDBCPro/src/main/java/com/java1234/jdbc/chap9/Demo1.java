package com.java1234.jdbc.chap9;

import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class Demo1 {

    private static DbUtil dbUtil = new DbUtil();

    private static void outAccount(Connection con,String accountName,int account) throws Exception{
        String sql = "update t_account set accountBalance = accountBalance-? where accountName = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1,account);
        pstmt.setString(2,accountName);
        pstmt.executeUpdate();
    }

    private static void inAccount(Connection con,String accountName,int account) throws Exception{
        String sql = "update t_account set accountBalance = accountBalance+? where accountName = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1,account);
        pstmt.setString(2,accountName);
        pstmt.executeUpdate();
    }

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Savepoint sp = null;
        try {
            con = dbUtil.getCon();
            con.setAutoCommit(false); //取消自动提交
            System.out.println("张三向李四转账");
            int account = 500;
            outAccount(con,"zhang",account);
            sp = con.setSavepoint();//设置保存点
            inAccount(con,"li",account);
            System.out.println("转账成功");
        } catch (Exception e) {
            con.rollback();//回滚
//            con.rollback(sp);//回滚到sp保存点  一般不用
            e.printStackTrace();
        }finally {
            try {
                con.commit();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
