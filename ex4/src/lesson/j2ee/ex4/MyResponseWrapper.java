package lesson.j2ee.ex4;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class MyResponseWrapper extends HttpServletResponseWrapper {
    public MyResponseWrapper(HttpServletResponse response) {
        super(response);
    }
}
