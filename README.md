- jar : 내장 톰캣 간단 빌드
- war : 톰캣서버 별도 설정

### HttpServletRequest 개요
- HttpServletRequest, HttpServletResponse 객체들은 HTTP요청 메시지, HTTP응답 메시지를 
편리하게 사용하도록 도와주는 객체

### HTTP 요청 데이터 개요
- GET - 쿼리 파라미터
- POST - HTML Form
- HTTP message body

### HTTP 응답 데이터 
- 단순 Text응답 (writer.println("ok"))
- HTML응답
- HTTP API - MessageBody JSON응답

--- 
- HttpServletRequest
- HttpServletResponse
--
- MVC로 나뉜 이유
  - Servlet or JSP 로만 작성을 하려면 ***역할이 너무 많아진다***
  - 설계에서 나누는 포인트는, 변경 주기(Life Cycle)를 두고 나눠도 설계가 깔끔해진다.
  - 최적화된 특성을 살리는게 중요하다.

--
- MVC 패턴의 한계?
  - 중복된 코드가 존재한다.
  - 사용하지 않는 리소스가 존재한다.

- 해결책
  - Front Controller Pattern

--
- Servlet, jsp -> mvc pattern
  - jsp가 필요해진 이유 -> servlet 코드에서 view 영역을 분리시키기 위해(html 코드가 많아 유지보수 어려워진다)
  - jsp를 통해 java언어로 html출력이 수월해진다.

-- 
- MVC 프레임워크 만들기


--
Front controller 패턴 복습
-- 
V5
Adapter Pattern
한 가지 타입의 컨트롤러 Interface만 사용 -> 여러 Controller Interface사용이 가능하도록

프론트 컨트롤러가 다양한 방식의 컨트롤러를 처리ㅎ할 수 있도록 변경

--
