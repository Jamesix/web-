package servlet;


import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

public abstract class BaseServlet extends HttpServlet {

    protected abstract  String getClassName();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action=req.getParameter("aaaa");


        try {
            Class a=Class.forName(getClassName());

            Method method=   a.getDeclaredMethod(action,HttpServletRequest.class,HttpServletResponse.class);
            Object o=   method.invoke(a.newInstance(),req,resp);

            if(o  instanceof String)
            {
                req.getRequestDispatcher(o.toString()).forward(req,resp);
            }
            else if(o instanceof  JsonResult)
            {

                PrintWriter out=resp.getWriter();
                String newsJSON = JSON.toJSONStringWithDateFormat(o,
                        "yyyy-MM-dd HH:mm:ss");
                out.print(newsJSON);
                out.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }






}
