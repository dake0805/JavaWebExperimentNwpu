
package lesson.j2ee.ex1;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

/**
 * 如果用户选择brown，则redirect到一个Servlet: ShowBrownBeer.java进行显示
 * 若用户选择dark，则dispatch到另外一个Servlet: ShowDarkBeer.java进行显示
 *
 * @author zy
 */
@WebServlet(name = "SelectBeer", urlPatterns = "/SelectBeer.do")
public class SelectBeerServlet extends HttpServlet {
    /**
     * 实现 doPost()
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
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
