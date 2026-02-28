import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class HiddenFieldServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String hiddenValue = request.getParameter("hiddenField");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Username: " + username + "</h2>");
        out.println("<h2>Hidden Field Value: " + hiddenValue + "</h2>");
        out.println("</body></html>");
    }
}
