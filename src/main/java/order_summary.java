import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/order-summary")
public class order_summary extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String product = req.getParameter("product");
        String quantity = req.getParameter("quantity");
        pw.println("<h3> You ordered: "+quantity+" "+ product+"'s!</h3>");

    }
}
