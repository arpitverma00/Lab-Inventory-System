<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lab Inventory System</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
crossorigin="anonymous">
</head>
<body>
<%@include file="all_css.jsp" %>
	    <nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="#">Lab Inventory System</a>

  <!-- Toggler/collapsibe Button -->
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>

  <!-- Navbar links -->
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
       <li class="nav-item">
        <a class="nav-link" href="/welcome">Home</a>
        </li>
        
       
      
    </ul>
  </div>
</nav>

	<div class ="container">
			<div class="center">
			 <h1> List Users</h1>
			 </div>
			
			  <div class="row">
			 <div style="text-align:center">
			  <table class ="table thead-dark  table-striped "border="1">
			  <thead class ="table-dark">
			   <tr>		
			  			
			  			<th scope="col">UserId</th>
			  			<th scope ="col">Name</th>
			  			<th scope ="col">Email</th>
			  			<th scope ="col">Password</th>
			  			<th scope ="col">Actions </th>
			  			
			  
			  
			  
			  </tr>
			  </thead>
			  
			   <tbody>
			  		<c:forEach var="user" items="${user}">
			  		<tr>
			  		<td> ${user.id }</td>
			  		<td> ${user.name }</td> 
			  		<td>${user.email }</td>
			  		<td>${user.password }</td>
			  		<td>
			  			<a href="/edit_users/${user.id}"
			  			class ="btn btn-primary">Update</a>
			  			
			  			<a href="/delete_users/${user.id}"
			  			class ="btn btn-danger">Delete</a>
			  		</td>
			  		</tr>
			  		
			  		</c:forEach>
			  	</tbody>
			  </table>
			 
			</div>

   </div>
</body>
</html>
			  
			  
			  
			  
			  
			  