import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            String studentName = request.getParameter("studentName");
            String rollNo = request.getParameter("rollNo");
            String course = request.getParameter("course");
            String password = request.getParameter("password");

            if (studentName != null && !studentName.isEmpty() && password != null && !password.isEmpty()
                    && rollNo != null && !rollNo.isEmpty() && course != null && !course.isEmpty()) {
                if (studentName.equals("Nabina") && password.equals("1234")) {
                    request.setAttribute("studentName", studentName);
                    request.setAttribute("rollNo", rollNo);
                    request.setAttribute("course", course);

                    request.getRequestDispatcher("welcome.jsp").forward(request, response);
                } else {
                    out.println("Invalid user or password");
                }
            } else {
                out.println("Empty student name or password");
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
        return "Servlet to display student details";
    }
}
