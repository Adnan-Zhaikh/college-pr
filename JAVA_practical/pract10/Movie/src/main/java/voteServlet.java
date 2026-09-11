import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/voteServlet")
public class voteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String movie = req.getParameter("movie");

        // ---- HttpSession part ----
        // true = create a new session if one doesn't already exist
        HttpSession session = req.getSession(true);
        session.setAttribute("votedMovie", movie);

        // ---- URL Rewriting part ----
        // encodeRedirectURL() appends ";jsessionid=..." to the URL when the
        // browser has cookies disabled, so the session still carries over
        String redirectURL = res.encodeRedirectURL("thankYouServlet?movie=" + movie);

        // Forward user to thank you page
        res.sendRedirect(redirectURL);
    }
}


