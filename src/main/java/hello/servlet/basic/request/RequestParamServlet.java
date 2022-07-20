package hello.servlet.basic.request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1. 파라미터 전송
 * http://localhost:8080/request-param?username=hello&age=20
 */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		printAllParameters(request);
		printSingleParam(request);

		response.getWriter().write("ok");

	}

	private void printAllParameters(HttpServletRequest request) {
		System.out.println(" ::: request param servlet service ::: ");

		/*request.getParameterNames().asIterator()
				.forEachRemaining(parameterNames -> System.out.println(parameterNames
					+ " : " + request.getParameter(parameterNames)));*/

		System.out.println(" ::: request param servlet service ::: ");
	}

	private void printSingleParam(HttpServletRequest request) {
		System.out.println(" :: 단일 파라미터 조회 :: ");

		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("age"));

		System.out.println(" :: 단일 파라미터 조회 :: ");
	}

}
