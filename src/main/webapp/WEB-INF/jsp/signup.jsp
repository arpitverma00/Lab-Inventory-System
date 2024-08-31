<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Sign up Page</title>

<%@ include file="all_css.jsp" %>

</head>

<body style="background-color: #f0f1f2;">

<%@ include file="navbar.jsp" %>

 

<div class="container-fluid">

 <div class="row p-4">

  <div class="col-md-4 offset-md-4">

   <div class="card">

    <div class="card-body">

     <div class="text-center">

        <i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>

        <h5>Registration</h5>
<div class="text-center text-danger">
<h6>${errorMsg}</h6>
</div>
<div class="text-center text-sucess">
<h6>${successMsg}</h6>
</div>

      </div>

      

           <form action="signup" method="post">

           <div class="form-group">

               <label>Enter Name</label>

               <input type="text" required="required" class="form-control" id="exampleInputemail" aria-describedby="emailHelp" name="name">

           </div>

           <div class="form-group">

            <label>Enter Email</label> 

            <input type="email"  required="required" class="form-control" id="exampleInputemail" aria-describedby="emailHelp" name="email">

          </div>

          <div class="form-group">

          <label for="exampleInputPassword1">Enter Password</label>

          <input pattern=".{8,16}" required="required" type="password" class="form-control" id="exampleInputPassword1" name="password">

              

          </div>

          

          <button type="Submit" class="btn btn-primary badge-pill btn-block">Submit</button>

           </form>

        </div>

   </div>

   </div>

 </div>

</div>

</body>

</html>
