<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
 <%
 	int one = Integer.valueOf(request.getParameter("one"));
 	int two = Integer.valueOf(request.getParameter("two"));
	if(one>two){
 %>
	<jsp:forward page="come.jsp" ><jsp:param value="<%=one %>" name="max"/></jsp:forward>
<% 
	}else{
%>
	<jsp:forward page="come.jsp" ><jsp:param value="<%=two %>" name="max"/></jsp:forward>
<% }%>

</body>
</html>