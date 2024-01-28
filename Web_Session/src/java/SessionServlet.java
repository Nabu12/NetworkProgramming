import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        
        HttpSession session = request.getSession();
        
        session.setAttribute("username", username);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Session Value</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Session Value</h1>");
            out.println("<p>Username: " + username + "</p>");
            out.println("<p>Session ID: " + session.getId() + "</p>");
            out.println("<a href=\"index.html\">Go back to the form</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
