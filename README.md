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