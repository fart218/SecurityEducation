package jp.co.exam.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/view/*")
public class LoginCheckFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
 		HttpServletResponse httpResponse = (HttpServletResponse) response;
 		String requestURI = httpRequest.getRequestURI();
		try {
			HttpSession session = httpRequest.getSession(false);
	 		if ((session == null || session.getAttribute("isAuthenticated") == null)
			 	&& (requestURI.equals("/view/noLockOut")
		 		|| requestURI.equals("/view/security"))) {
				httpResponse.sendRedirect("/");
			} else {
				chain.doFilter(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
 				throw e;
		}
	}

}

