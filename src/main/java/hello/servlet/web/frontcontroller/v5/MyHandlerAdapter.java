package hello.servlet.web.frontcontroller.v5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.web.frontcontroller.ModelView;

public interface MyHandlerAdapter {

	boolean supports(Object handler);//controller 넘어왔을때 지원 가능 여부

	ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException,
		IOException;
}
