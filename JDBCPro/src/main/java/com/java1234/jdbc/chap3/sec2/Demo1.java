package com.java1234.jdbc.chap3.sec2;

public class Demo1 {
    private static String jdbcName = "com.mysql.jdbc.Driver";

    public  static void main(String[] args){
        try {
            Class.forName(jdbcName);
            System.out.println("加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("加载失败");
        }
    }

}
