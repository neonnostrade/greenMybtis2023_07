<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionExam</title>
</head>
<body>
<h1>sessionExam</h1>
<script>
<%if(request.getAttribute("msg")!=null){ %>
	alert("<%=request.getAttribute("msg") %>")
	location.href = "<%=request.getAttribute("goUrl") %>"
	<%} %>
</script>
<%if(request.getAttribute("text")!=null){ %>
	<%=request.getAttribute("text") %>
<%} %>
<%if(request.getAttribute("pid")!=null){ %>
	<a href="/session/logoutt">로그아웃</a>
<%}%>
</body>
</html>