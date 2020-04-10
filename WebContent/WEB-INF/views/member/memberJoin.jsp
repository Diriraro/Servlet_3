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
		<form action="./memberJoin" method="post">
    <div class="form-group">
      <label for="ID">ID:</label>
      <input type="text" class="form-control" id="id" placeholder="Enter ID" name="id">
    </div>

    <div class="form-group">
      <label for="PW">Password:</label>
      <input type="password" class="form-control" id="pw" placeholder="Enter PW" name="pw">
    </div> 
       
<!--     <div class="form-group">
      <label for="CPW">Confirm Password:</label>
      <input type="password" class="form-control" id="cpw" placeholder="Enter Confirm Password" name="cpw">
    </div>   -->
    
    <div class="form-group">
      <label for="Name">Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
    </div>  
    
    <div class="form-group">
      <label for="Email">Email:</label>
      <input type="text" class="form-control" id="email" placeholder="Enter Email" name="email">
    </div>  
    
    <div class="form-group">
      <label for="Phone">phone:</label>
      <input type="text" class="form-control" id="phone" placeholder="Enter phone" name="phone">
    </div>          
    
    <div class="form-group">
      <label for="Age">Age:</label>
      <input type="text" class="form-control" id="age" placeholder="Enter age" name="age">
    </div>                  
   
   <button type="submit" class="btn btn-default">Submit</button>
   
  </form>
	</div>
</div>

</body>
</html>