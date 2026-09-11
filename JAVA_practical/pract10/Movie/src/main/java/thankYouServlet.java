import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/thankYouServlet")
public class thankYouServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // false = do NOT create a new session, use the one from voteServlet
        HttpSession session = req.getSession(false);
        String movie = (session != null) ? (String) session.getAttribute("votedMovie") : null;

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Thank you for Voting!</h2>");
        out.println("<p>You voted for: <strong>" + movie + "</strong></p>");
        out.println("<p>Session ID: " + (session != null ? session.getId() : "none") + "</p>");

        // URL rewriting again: encodeURL() makes sure jsessionid stays in the
        // link too if cookies are off, so the session isn't lost on click
        out.println("<a href='" + res.encodeURL("movies.html") + "'>Vote Again</a>");
    }
}