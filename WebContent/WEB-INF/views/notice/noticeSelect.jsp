<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

			<table class="table table-hover">
				<tr class="danger">
					<td>NO : ${dto.no}</td>
					<td>SUBJECT : ${dto.subject}</td>
					<td>TODAY : ${dto.today}</td>
					<td>ID : ${dto.id}</td>
					<td>HIT : ${dto.hit}</td>

				</tr>

			</table>

			<div class="container">
				<div class="jumbotron">

					<p>${dto.content}</p>
				</div>

			</div>
		<c:if test="${member.id eq 'admin'}">	
		<a href="./noticeMod?no=${dto.no}" class="btn btn-primary">Update</a>
		<button id="del" class="btn btn-danger">Delete</button>
		</c:if>

		</div>
	</div>
	<script type="text/javascript">
			$("#del").click(function() {
			var result = confirm("삭제?");
			if(result){
				location.href="./noticeDelete?no=${dto.no}";			
			}
		});
	
	</script>

</body>
</html>