<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Approve</title>
<style>


</style>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
crossorigin="anonymous">
</head>
<body>
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
		<div class="row">
			 <h1> List of Requests</h1>
			 </div>
			
			 <form action="/requests" method="get">
			  <label for="status">Status: </label>
			  <select class="form-select" name="status" aria-label="Default select example">
			  <option selected value="pending">pending</option>
			  <option value="approved">Approved</option>
			  <option value="rejected">Rejected</option>
			  
			  
			  </select>
			  <button type="submit">Search</button>
			  
			 </form>
			  
			  
		
			  <table class ="table thead-dark  table-striped "border="1">
			  <thead class ="table-dark">
			  <tr>		
			  			
			  			<th scope="col">Request Id</th>
			  			<th scope ="col">UserId</th>
			  			<th scope ="col">UserEmail</th>
			  			<th scope ="col">Equipment Id</th>
			  			<th scope ="col">Quantity</th>
			  			<th scope ="col">Request Status</th>
			  			<th scope ="col">Actions </th>
			  			  
			  
			  </tr>
			  </thead>
			   <tbody>
			  		<c:forEach var="request" items="${requests}">
			  		<tr>
			  		<td>${request.id}</td>
			  		<td>${request.userId}</td> 
			  		<td>${request.name}</td>
			  		<td>${request.pId}</td>
			  		<td>${request.quantity}</td>
			  		<td>${request.status}</td>
			  		
			  		<c:set var="status" value="${request.status }"/>
			  		<c:if test="${status!='Pending' }">
			  			<td class="col-2 d-none">
			  				<a href ="/approve/${request.id}" class="btn btn-primary btn-sm mb-3">Approve</a>
			  				<a href ="/reject/${request.id}" class="btn btn-danger btn-sm mb-3">Reject</a>
			  				</td>
			  			</c:if>
			  			<c:if test="${status =='Pending'}">
			  			 <td class="col-2">
			  			 <a href ="/approve/${request.id}" class="btn btn-primary btn-sm mb-3">Approve</a>
			  			 <a href ="/reject/${request.id}" class="btn btn-primary btn-sm mb-3">Reject</a>
			  			 </td>
			  		</c:if>
			  			 
			  		</tr>
			  		
			  		</c:forEach>
			  	</tbody>
			  </table>
			 
			</div>

   </div>
</body>
</html>