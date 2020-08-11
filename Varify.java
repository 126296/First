import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Varify"})
public class Varify extends HttpServlet {
    @Override
    public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        String uname = req.getParameter("username");
        String passwd=req.getParameter("password");
        req.setAttribute("user",uname);
        req.setAttribute("pass",passwd);
        
        RequestDispatcher rd=req.getRequestDispatcher("Display");
        rd.forward(req, res);
    }
}
