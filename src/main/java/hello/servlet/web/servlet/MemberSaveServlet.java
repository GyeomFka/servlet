package hello.servlet.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;

@WebServlet(name = "memberSaveServlet", urlPatterns = "/servlet/members/save")
public class MemberSaveServlet extends HttpServlet {

	private MemberRepository memberRepository = MemberRepository.getInstance();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MemberSaveServlet.service");

		String username = request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));

		Member member = new Member(username, age);
		memberRepository.save(member);

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter writer = response.getWriter();

		writer.write("<html>");
		writer.write("<head>");
		writer.write("<meta charset=\"UTF-8\">");
		writer.write("</head>");
		writer.write("<body>");
		writer.write("<ul>");
		writer.write("<li>"+member.getId()+"</li>");
		writer.write("<li>"+member.getUsername()+"</li>");
		writer.write("<li>"+member.getAge()+"</li>");
		writer.write("</ul>");
		writer.write("<a href=\"/index.html\">main</a>");
		writer.write("</body>");
		writer.write("</html>");
	}
}
