import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name= "bonuses", urlPatterns="/bonuses")
public class bonuses extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        if (name == null || name.equals("")){
            res.setContentType("text/html");
            PrintWriter pw = res.getWriter();
            pw.println("<h1>Hello<h1>");
        } else {
            res.setContentType("text/html");
            PrintWriter pw = res.getWriter();
            pw.println("<h1>Hello, "+name+"!</h1>");
        }
    }
}
