import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name= "bonuses", urlPatterns="/name")
public class bonuses extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

            res.setContentType("text/html");
            PrintWriter pw = res.getWriter();
            pw.println("<h1>Hello, Thomas Offer!</h1>");

    }
}
