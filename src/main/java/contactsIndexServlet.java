import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="contactsIndexServlet", urlPatterns = "/contacts")
public class contactsIndexServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("contacts", DaoFactory.getContactListDao().getContacts());
        request.getRequestDispatcher("/contacts/index.jsp").forward(request, response);
    }

}
