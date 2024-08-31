<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lab Inventory System</title>
<link

 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/brands.min.css"

 rel="stylesheet"

/>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
crossorigin="anonymous">


<style type="text/css">
.back-img{
background:url("https://www.labguru.com/hs-fs/hubfs/Imported_Blog_Media/Depositphotos_113503374_xl-2015-2.jpg?width=1200&name=Depositphotos_113503374_xl-2015-2.jpg");
height:90vh;
width:100%;
backgroung-repeat:no-repeat;
background-size:cover;
}
</style>

</head>
<body>
	    <nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="#">
  
  <p class ="fw-bold mb-0">Lab Inventory System</p>
  </a>

  <!-- Toggler/collapsibe Button -->
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>

  <!-- Navbar links -->
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
  <i class="fa-solid fa-flask-vial"></i>
    <ul class="navbar-nav">
      <!-- <li class="nav-item">
      
        <a class="nav-link" href="/equipments">Lab Inventory Management</a>
      </li> -->
      
       <li class="nav-item">
        <a href= "add_equipment" class="nav-link">Add Equipment</a>
        </li>
      <li class="nav-item">
        <a class="nav-link" href="/equipments" >View Equipments</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/user" >View Users</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/requests" >View Requests</a>
      </li>
          
    </ul>
  
  </div>
   <form class="form-inline my-2 my-lg-0">

        <a href="#" class="btn btn-light mr-1">Admin</a>
     <a href="/logout" class="btn btn-light"><i class="fas fa-sign-in-alt"></i>Logout</a>

    

    </form>

</nav>

<div class="container-fluid back-img">

 

     <div class="text-center">

 		

       <h1 class="text-black p-4">Welcome Admin </h1>

 

     </div>
</div>
</body>
</html>
