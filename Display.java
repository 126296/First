import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Display"})
public class Display extends HttpServlet {

    static int n;
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        String myuname="admin";
        String mypass="admin";
        
        String uname=(String) req.getAttribute("user");
        String passwd=(String) req.getAttribute("pass");
        
        PrintWriter pw=res.getWriter();
        if(uname.equals(myuname))
        {
            if(passwd.equals(mypass))
                pw.println("Hello "+myuname);
            else
                pw.println("Login failed");
        }
        else
            pw.println("Login failed");
    }
    }