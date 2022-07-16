package hello.servlet.basic.request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		printStartLine(request);
		printHeader(request);

	}

	private void printStartLine(HttpServletRequest request) {

		System.out.println(" ::::: request line start ::::: ");

		String method = request.getMethod();
		String protocol = request.getProtocol();
		String scheme = request.getScheme();
		StringBuffer requestUrl = request.getRequestURL();
		String requestURI = request.getRequestURI();
		String queryString = request.getQueryString();
		boolean secure = request.isSecure();

		System.out.println("method = " + method);
		System.out.println("protocol = " + protocol);
		System.out.println("scheme = " + scheme);
		System.out.println("requestUrl = " + requestUrl);
		System.out.println("requestURI = " + requestURI);
		System.out.println("queryString = " + queryString);
		System.out.println("secure = " + secure);

		System.out.println(" ::::: request line end ::::: ");
	}

	private void printHeader(HttpServletRequest request) {
		System.out.println(" ::::: header line start ::::: ");

		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			System.out.println(headerName + " : " + headerName);
		}

		System.out.println(" ::::: header line end ::::: ");
	}

}
