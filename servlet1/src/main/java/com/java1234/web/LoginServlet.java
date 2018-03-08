package com.java1234.web;

import com.java1234.dao.UserDao;
import com.java1234.model.User;
import com.java1234.util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;

public class LoginServlet extends HttpServlet{


    DbUtil dbUtil = new DbUtil();
    UserDao userDao = new UserDao();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        Connection con = null;
        try {
            User user = new User(userName, password);
            con = dbUtil.getCon();
            User currentUser = userDao.login(con,user);
            if (currentUser == null) {
                req.setAttribute("error","用户名或密码错误");
                req.setAttribute("userName",userName);
                req.setAttribute("password",password);
                req.getRequestDispatcher("login.jsp").forward(req, resp);
                System.out.println("no");
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("currentUser",currentUser);
                //               req.getRequestDispatcher("main.jsp").forward(req,resp);
                resp.sendRedirect("main.jsp");
                System.out.println("ok");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
