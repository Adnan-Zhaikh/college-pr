import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/createSession")
public class CreateSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String game = req.getParameter("game");

        HttpSession session = req.getSession();
        session.setAttribute("favoriteGame", game);

        res.setContentType("text/html");
        res.getWriter().println("<h2>Session Created! Game: " + game + "</h2>");
        res.getWriter().println("<a href='readSession'>Go to Read Session</a>");
    }
}
