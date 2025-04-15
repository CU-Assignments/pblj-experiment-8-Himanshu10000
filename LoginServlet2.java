import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if ("user".equals(user) && "pass123".equals(pass)) {
            out.println("<html><body>");
            out.println("<h2>Hello, " + user + "! You have successfully logged in.</h2>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Login failed. Please try again.</h2>");
            out.println("</body></html>");
        }
    }
}
