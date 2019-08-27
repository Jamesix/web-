package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "user",urlPatterns = "/user")
public class User extends BaseServlet {
    @Override
    protected String getClassName() {
        return "servlet.User";
    }

    public  String add(HttpServletRequest req, HttpServletResponse resp){

        req.setAttribute("sdfsdf","sdfsdf");
        return "/WEB-INF/view/add.jsp";

    }
    public  String edd(HttpServletRequest req, HttpServletResponse resp){

        return "/WEB-INF/view/edit.jsp";

    }

    public  JsonResult del(HttpServletRequest req, HttpServletResponse resp){

        JsonResult ss=new JsonResult();
        ss.setCode(200);
        ss.setMag("ss");
        String[] ssssss={"111","2222","是大法官"};
        ss.setData(ssssss);
        return ss;

    }


}
