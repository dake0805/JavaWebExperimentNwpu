
package test;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;


@WebServlet(name = "SelectBeer", urlPatterns = "/SelectBeer.do")
public class SelectBeerServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String colorParam = request.getParameter("color");

        switch (colorParam) {
            case "brown":
                response.sendRedirect("ShowBrownBeer.do");
                break;
            case "dark":
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("ShowDarkBeer.do");
                requestDispatcher.forward(request, response);
                break;
        }

        PrintWriter out = response.getWriter();
        out.println("<html> " + "<body>"
                + "<h1 align=center>Beer Color</h1>" + "<br>"
                + "My selected beer color is: " + colorParam + "</body>" + "</html>");
    }
}
