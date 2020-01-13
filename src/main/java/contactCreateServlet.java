import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contacts/create")
public class contactCreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        Contact contact = new Contact(
                request.getParameter("firstName"),
                request.getParameter("lastName"),
                request.getParameter("phoneNUMBER")
        );
    }

}
