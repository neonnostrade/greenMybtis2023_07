<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session</title>
</head>
<body>
<h1>session</h1>
<%=request.getAttribute("msg") %><br/>
id:<%=session.getId() %><br/>
st:<%=session.getAttribute("st") %><br/>
mem:<%=session.getAttribute("mem") %><br/>
ph:<%=session.getAttribute("ph") %><br/>
</body>
</html>