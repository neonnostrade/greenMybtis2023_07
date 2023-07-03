<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>너 경고</title>
</head>
<body>
<script>
	alert("<%=request.getAttribute("msg")%>")
	location.href="<%=request.getAttribute("goUrl")%>"
</script>
</body>
</html>