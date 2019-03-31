package expedientesx.util;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class RecordarLoginFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		String login = request.getParameter("j_username");
		if(login!=null&&!login.isEmpty()){
			System.out.println("RecordarLoginFilter  login:"+login);
			response.addCookie(new Cookie("SPRING_SECURITY_LAST_USERNAME", login));
		}
		chain.doFilter(request, response);
	}

}
