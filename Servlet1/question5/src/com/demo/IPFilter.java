package com.demo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class IPFilter
 */
public class IPFilter implements Filter {

	private FilterConfig filterConfig;
   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
       
        String ipAdress=req.getRemoteAddr();
        String blockedIp=filterConfig.getInitParameter("Blocked Ip");
        
        if(ipAdress.equals(blockedIp)) {
    		res.sendRedirect("forbidden.jsp");
    	}else {
    		chain.doFilter(request, response);
    	}
	}

}
