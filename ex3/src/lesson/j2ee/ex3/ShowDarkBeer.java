package lesson.j2ee.ex3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowDarkBeer extends HttpServlet {

	/**
	 * The doPost method implements the request and response between browser and
	 * server
	 * 
	 * @param request
	 *            the browser request
	 * @param response
	 *            the server response
	 * 
	 * @throws IOException
	 *             if there are errors from the input
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String colorParam = "Dark";
		PrintWriter out = response.getWriter();
		out.println(
				"<html> " + "<body>" + "<h1 align=center>Beer Color</h1>" + "<hr><br>" + "You selected beer color is: "
						+ colorParam + "<br>" + "Sorry, The dark beer's item display error!" + "</body>" + "</html>");
	}
}
