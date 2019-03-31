package expedientesx.util;

import java.io.IOException;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class BotonVolverFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		response.setHeader("Expires", "Tue, 03 Jul 2001 06:00:00 GMT");
		response.setHeader("Last-Modified", new Date().toString());
		response.setHeader("Cache-Control",
				"no-store, no-cache, must-revalidate, max-age=0, post-check=0, pre-check=0");
		response.setHeader("Pragma", "no-cache");

		chain.doFilter(request, response);
	}

}
