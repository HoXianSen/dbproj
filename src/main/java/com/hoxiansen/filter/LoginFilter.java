package com.hoxiansen.filter;

import com.hoxiansen.common.Constants;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        String[] ignores = {"login"};
        String url = request.getRequestURI();
        for (String ignore : ignores) {
            if (url.endsWith(ignore)) {
                filterChain.doFilter(request, response);
                return;
            }
        }
        Object obj = request.getSession().getAttribute(Constants.SESSION_ATTR_USER);
//        if (obj == null) {
//            response.sendRedirect("/admin/login");
//            return;
//        }
        filterChain.doFilter(request, response);
    }
}
