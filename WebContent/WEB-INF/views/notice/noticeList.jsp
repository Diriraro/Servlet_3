<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/boot.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>

<div class="container">
	<div class="row">
		<h1>Notice List Page</h1>
		
		<table class="table table-hover">
			<tr>
				<td>NO</td>
				<td>SUBJECT</td>
				<td>DATE</td>
				<td>ID</td>
				<td>HIT</td>
			</tr>	
			
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.no}</td>
					<td><a href="./noticeSelect?no=${dto.no}">${dto.subject}</a></td>
					<td>${dto.today}</td>
					<td>${dto.id}</td>
					<td>${dto.hit}</td>
				</tr>
			</c:forEach>	
		
		
		</table>
		<c:if test="${member.id eq 'admin'}">	
		<a href="./noticeAdd" class="btn btn-primary">Notice Add</a>
		</c:if> 
		
			
    	
	</div>
</div>
  

</body>
</html>