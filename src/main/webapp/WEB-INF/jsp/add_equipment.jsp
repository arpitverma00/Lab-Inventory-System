<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        <a class="nav-link" href="/equipments">Lab Inventory Management</a>
      </li>
      
    </ul>
  </div>
</nav>

<br>
<br>
 		<div class="container">
 			<div class= "row">
 				<div class ="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">
 				  <h1 class="text-center">Add New Equipment</h1>
 				   <div class= "card-body"></div>
 				   		<form action="/equipments"  method ="POST">
 				   		<div class ="form-group">
 				   		<label>Equipment Name</label>
 				   		<input required="required"
 				   		type="text"
 				   		name="name"
 				   		
 				   		class="form-control"
 				   		placeholder="Enter the Equipment name"
 				   		/>
 				   		</div>
 				   		
 				   		<div class ="form-group">
 				   		<label>Equipment Brand Name</label>
 				   		<input required="required"
 				   		type="text"
 				   		name="brand"
 				   		
 				   		class="form-control"
 				   		placeholder="Enter Equipment's brand name"
 				   		/>
 				   		</div>
 				   		
 				   		<div class ="form-group">
 				   		<label>Equipment Quantity</label>
 				   		<input required="required"
 				   		type="number" min=1 max=2000
 				   		name="quantity"
 				   		
 				   		class="form-control"
 				   		placeholder="Enter the Equipment's quantity"
 				   		/>
 				   		</div>
 				   		
 				   		
 				   		<div class ="form-group">
 				   		<label>Equipment Price</label>
 				   		<input required="required"
 				   		type="number" min=1 max=1000000
 				   		name="price"
 				   		
 				   		class="form-control"
 				   		placeholder="Enter the Equipment's price"/>
 				   		</div>
 				   		
 				   		<div class="box-footer">
 				   		    <button type="submit" class= "btn btn-primary">
 				   		    Submit
 				   		    </button>
 				   		    </div>
 				   		 </form>
 				   
 				  </div>
 				</div>
 		</div>
</body>
</html>