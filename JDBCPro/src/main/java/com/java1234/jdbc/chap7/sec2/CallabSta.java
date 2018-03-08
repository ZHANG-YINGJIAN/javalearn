package com.java1234.jdbc.chap7.sec2;

import com.java1234.jdbc.chap3.util.DbUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class CallabSta {
    private static DbUtil dbUtil = new DbUtil();

    /**
     * 调用存储过程，通过id查询name
     * @param id
     * @return
     * @throws Exception
     */
    private static String getStuNameById(int id) throws Exception{
        Connection con = dbUtil.getCon();
        String sql = "{CALL pro_getStuNameById(?,?)}";
        CallableStatement cstmt = con.prepareCall(sql);
        cstmt.setInt(1,id);//设置第一个参数
        cstmt.registerOutParameter(2, Types.VARCHAR);//设置返回类型
        cstmt.execute();
        String name = cstmt.getString("bN");//获得返回值
        dbUtil.close(cstmt,con);
        return name;
    }

    public static void main(String[] args) throws Exception{
        System.out.println("学生名：" + getStuNameById(13));
    }
}
