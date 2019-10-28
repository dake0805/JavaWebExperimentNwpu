//package lesson.j2ee.ex4;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class MyRequestFilter implements Filter {
//
//    private FilterConfig filterConfig = null;
//
//    public void destroy() {
//        this.filterConfig = null;
//    }
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
//        HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
//
//        String redirectPath = httpServletRequest.getContextPath() + filterConfig.getInitParameter("redirectPath");
//
//        String disableFilter = filterConfig.getInitParameter("disableFilter");
//
//        if (disableFilter.toUpperCase().equals("Y")) {
//            chain.doFilter(req, resp);
//        }
//        if (disableFilter.toUpperCase().equals("N")) {
//            if (httpServletRequest.getRequestURI().contains("/SelectBeer.jsp")) {
//                chain.doFilter(req, resp);
//            } else {
//                httpServletResponse.sendRedirect(redirectPath);
//            }
//        } else {
//            chain.doFilter(req, resp);
//        }
//    }
//
//    public void init(FilterConfig config) throws ServletException {
//        this.filterConfig = config;
//    }
//
//}
