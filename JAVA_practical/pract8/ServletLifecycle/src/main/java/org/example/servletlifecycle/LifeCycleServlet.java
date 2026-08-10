package org.example.servletlifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init() method Called");
    }

    @Override
    protected void service(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("service() method called");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Servlet Life Cycle Demo</h1>");
        out.println("<h2>service() method executed successfully.</h2>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public void destroy() { System.out.println("destroy() method called");}
}
