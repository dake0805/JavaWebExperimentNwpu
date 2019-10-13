package lesson.j2ee.ex1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowDarkBeer", urlPatterns = {"/ShowDarkBeer.do"})
public class ShowDarkBeer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html> " + "<body>"
                + "<h1 align=center>Beer Color</h1>" + "<br>"
                + "My selected beer color is: " + "dark" + "</body>" + "</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
