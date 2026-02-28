import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LifeCycleServlet extends HttpServlet {

    public void init() throws ServletException {
        System.out.println("Servlet Initialized");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Servlet Life Cycle Demo</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
        System.out.println("Servlet Destroyed");
    }
}
