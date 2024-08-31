<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg bg-dark navbar-dark">

  <a class="navbar-brand" href="#">Lab Inventory System</a>

  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">

    <span class="navbar-toggler-icon"></span>

  </button>

  <%@ include file="Style.jsp"%>

 

  <div class="collapse navbar-collapse" id="navbarSupportedContent">

    <ul class="navbar-nav mr-auto">

       <li class="nav-item active">

        <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>

      </li>

</ul>

    <form class="form-inline my-2 my-lg-0">

   

     <a href="/login" class="btn btn-light mr-1"><i class="fas fa-sign-in-alt"></i>Login</a>

     <a href="/signup" class="btn btn-light"><i class="fas fa-user"></i> Sign up</a> 

    

    </form>

  </div>

</nav>