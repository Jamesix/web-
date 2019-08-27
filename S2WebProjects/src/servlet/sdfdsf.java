package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "user1111",urlPatterns = "/project")
public class sdfdsf  extends  BaseServlet{
    @Override
    protected String getClassName() {
        return "servlet.sdfdsf";
    }

    public  String index(HttpServletRequest req, HttpServletResponse resp){


        return "view/pro/idnex.jsp";

    }
}
