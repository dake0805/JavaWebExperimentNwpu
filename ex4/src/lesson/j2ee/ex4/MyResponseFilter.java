package lesson.j2ee.ex4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyResponseFilter implements Filter {
    private FilterConfig filterConfig = null;

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        ServletResponse newResponse = response;
        if (request instanceof HttpServletRequest) {
            newResponse = new CharResponseWrapper((HttpServletResponse) response);
        }
        chain.doFilter(request, newResponse);
        if (newResponse instanceof CharResponseWrapper) {
            String text = newResponse.toString();
            if (text != null) {
                text += "This is an included section! <br>";
                response.getWriter().write(text);
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {
        this.filterConfig = config;
    }

}
