import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the parameter value from the request
        String data = request.getParameter("data");

        // Create a new cookie with the given name and value
        Cookie cookie = new Cookie("myCookie", data);

        // Set the maximum age of the cookie (optional)
        cookie.setMaxAge(60 * 60 * 24); // The cookie will expire after 24 hours (in seconds)

        // Add the cookie to the response
        response.addCookie(cookie);

        // Set the content type for the response
        response.setContentType("text/html;charset=UTF-8");

        // Display the value of the cookie
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cookie Example</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cookie Example</h1>");
            out.println("<p>Data stored in the cookie: " + data + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
