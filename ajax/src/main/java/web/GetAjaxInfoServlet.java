package web;

import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetAjaxInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");

        String action = req.getParameter("action");
        if ("checkUserName".equals(action)) {
            this.checkUserName(req,resp);
        }

    }

    public void checkUserName(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
//        String resultJson="{\"name\":\"张三\",\"age\":14}";
        String userName = req.getParameter("userName");
        JSONObject resultJson = new JSONObject();
        if ("jack".equals(userName)) {
            resultJson.put("exist",true);
        }else{
            resultJson.put("exist",false);
        }
        out.println(resultJson);
        out.flush();
        out.close();
    }
}
