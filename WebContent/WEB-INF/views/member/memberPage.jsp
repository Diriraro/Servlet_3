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
	<h1>ID : ${sessionScope.member.id}</h1>
	<h1>Name : ${member.name}</h1>
	<h1>Email : ${member.email}</h1>
	<h1>Phone : ${member.phone}</h1>
	<h1>Age : ${member.age}</h1>
	
	<button class="btn btn-primary" id="upd">Update</button>
	<button class="btn btn-danger" id="del">Delete</button>
	</div>
</div>

<script type="text/javascript">
	//js	document.getElementById
	//js	document.quertSelector
	//jquery $(선택자)

	$("#del").click(function() {
		var result = confirm("삭제?");
		if(result){
			location.href="./memberDelete";			
		}
	});
	$("#upd").on("click", function() {
		location.href = "./memberUpdate";
	});
	
	/* $("#upd").click(function() {
		var result = confirm("변경?");
		if(result){
			var pwp = prompt("비밀번호입력");
			if(pwp=='${member.pw}'){
			location.href="./memberUpdate";				
			}else{
				alert("비번틀림");
			}
		}
	}); */
</script>

</body>
</html>