package com.java1234.web;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RedirectServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("requestKey","request值");
        HttpSession session = req.getSession();
        session.setAttribute("sessionKey","session值");
        ServletContext application = session.getServletContext();
        application.setAttribute("applicationKey","application值");
        resp.sendRedirect("target.jsp");//页面跳转
//        RequestDispatcher rd = req.getRequestDispatcher("target.jsp");
//        rd.forward(req,resp);//服务器跳转
    }
}
