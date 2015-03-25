<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1" import="com.vince.dao.impl.TeacherDaoImpl,com.vince.dao.TeacherDao,com.vince.model.person,java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	TeacherDao dao = new TeacherDaoImpl();
	List<person>  person = dao.findAll();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html"  charset=UTF-8" >
<title>Insert title here</title>
</head>
<body>
	<table border=0>
	
		<tr>
			<td>tid</td>
			<td>name</td>
			<td>sex</td>
		</tr>
		<%
		for(int i=0;i<person.size();i++){
			person p = person.get(i);	
		%>
		<tr>
			<td><%=p.getTid() %></td>
			<td><%=p.getName() %></td>
			<td><%=p.getDescription()%></td>
		</tr>
		
		<%
		}
		%>
	</table>
</body>
</html>