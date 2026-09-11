import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/logoutSession")
public class LogoutSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        if (session != null) {
            session.invalidate();
        }

        res.setContentType("text/html");
        res.getWriter().println("<h2>Session ended. You are logged out.</h2>");
        res.getWriter().println("<a href='login.html'>Start Again</a>");
    }
}
