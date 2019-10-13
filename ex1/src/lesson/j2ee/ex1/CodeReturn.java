package lesson.j2ee.ex1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 编写一个向客户端发送非HTML数据的Servlet：CodeReturn.java。
 * 其中发送的jar文件为：bookCode.jar，
 * 将它放到WebContent目录下的resources子目录中
 *
 * @author zzzy
 */
@WebServlet(name = "CodeReturn", urlPatterns = {"/codeReturn.jar"})
public class CodeReturn extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * 实现 doGet() 方法
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/jar");
        ServletContext servletContext = getServletContext();
        InputStream inputStream = servletContext.getResourceAsStream("/resources/bookCode.jar");

        byte[] bytes = new byte[1024];
        int read = 0;
        OutputStream outputStream = response.getOutputStream();
        while ((read = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, read);
        }
        outputStream.flush();
        outputStream.close();
    }
}
