import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/readSession")
public class ReadSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (session != null) {
            String game = (String) session.getAttribute("favoriteGame");
            if (game != null) {
                out.println("<h2>Your favorite game: " + game + "</h2>");
            } else  {
                out.println("<h2>No game found in session</h2>");
            }
        } else  {
            out.println("<h2>No session exists</h2>");
        }
        out.println("<br><a href='login.html'>Back to form</a>");
    }
}
