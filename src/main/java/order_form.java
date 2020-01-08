import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name= "order_from", urlPatterns="/order-form")
public class order_form extends HttpServlet{


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<h1>Order Form</h1><form method=\"POST\" action=\"/order-summary\">\n" +
                "    <label for=\"product\">product:</label>\n" +
                "    <input id=\"product\" name=\"product\" placeholder=\"Enter the product\" />\n" +"    <label for=\"quantity\">quantity:</label>\n" +
                        "    <input id=\"quantity\" name=\"quantity\" placeholder=\"Enter the quantity\" />\n"+"<input type=\"submit\">"+
                "</form>");

    }
}
