import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
                if (username.equals("Nabina") && password.equals("1234")) {
                    request.setAttribute("username", username);

                    // Forward to a welcome page or handle login success accordingly.
                    request.getRequestDispatcher("newjsp.jsp").forward(request, response);
                } else {
                    out.println("Invalid username or password");
                }
            } else {
                out.println("Empty username or password");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet to handle login";
    }
}
