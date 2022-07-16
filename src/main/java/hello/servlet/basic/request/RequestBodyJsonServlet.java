package hello.servlet.basic.request;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StreamUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import hello.servlet.basic.HelloData;

@WebServlet(name = "requestBodyJsonServlet", urlPatterns = "/request-body-json")
public class RequestBodyJsonServlet extends HttpServlet {

	/**
	 * 기본 lib jackson 사용
	 */
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletInputStream inputStream = request.getInputStream();
		String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

		System.out.println("messageBody = " + messageBody);

		HelloData helloData = mapper.readValue(messageBody, HelloData.class);

		System.out.println("helloData.getUsername() = " + helloData.getUsername());
		System.out.println("helloData.getAge() = " + helloData.getAge());

		response.getWriter().write("ok");
	}
}