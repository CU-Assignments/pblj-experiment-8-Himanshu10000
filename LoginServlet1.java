import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "admin123".equals(password)) {
            out.println("<html><body>");
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Invalid username or password!</h2>");
            out.println("</body></html>");
        }
    }
}
