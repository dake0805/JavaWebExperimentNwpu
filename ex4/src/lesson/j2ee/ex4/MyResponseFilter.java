package lesson.j2ee.ex4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

public class MyResponseFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
