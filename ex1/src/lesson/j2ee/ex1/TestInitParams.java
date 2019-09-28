package lesson.j2ee.ex1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "lesson.j2ee.ex1.TestInitParams")
public class TestInitParams extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

    /**
     * @param request
     * @param response
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("test init parameters<br>");
        Enumeration enumeration = getServletConfig().getInitParameterNames();
        while (enumeration.hasMoreElements()) {
            printWriter.println("<br>param name =" + enumeration.nextElement() + "<br>");
        }

        printWriter.println("main email is " + getServletConfig().getInitParameter("mainEmail"));
        printWriter.println("<br>");
        printWriter.println("admin email is " + getServletConfig().getInitParameter("adminEmail"));
    }
}
