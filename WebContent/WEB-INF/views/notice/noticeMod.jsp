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

<form action="./noticeMod" method="post">
	<div class="form-group">
      <input type="hidden" class="form-control" id="no" name="no" value="${dto.no}">
    </div>
	<div class="form-group">
      <input type="hidden" class="form-control" id="id" name="id" value="${member.id}">
    </div>
	<div class="form-group">
      <label for="subject">Subject:</label>
      <input type="text" class="form-control" id="subject" placeholder="Enter Subject" name="subject" value="${dto.subject}">
    </div>
		<div class="form-group">
			<label for="content">Content:</label>
			<textarea class="form-control" rows="20" id="content" placeholder="Enter Content" name="content" >${dto.content}</textarea>

			<button type="submit" class="btn btn-default">Submit</button>
		</div>
	</form>

</body>
</html>