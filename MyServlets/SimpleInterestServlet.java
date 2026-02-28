import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleInterestServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Read form data
        double principal = Double.parseDouble(request.getParameter("principal"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        double time = Double.parseDouble(request.getParameter("time"));

        double si = (principal * rate * time) / 100;

        // Save to database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb", "root", "");
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO simple_interest(principal, rate, time, si) VALUES (?, ?, ?, ?)");
            ps.setDouble(1, principal);
            ps.setDouble(2, rate);
            ps.setDouble(3, time);
            ps.setDouble(4, si);
            ps.executeUpdate();
            con.close();

            out.println("<html><body>");
            out.println("<h2>Simple Interest: " + si + "</h2>");
            out.println("<p>Saved to database successfully.</p>");
            out.println("</body></html>");
        } catch (Exception e) {
            out.println("Error: " + e);
        }
    }
}
