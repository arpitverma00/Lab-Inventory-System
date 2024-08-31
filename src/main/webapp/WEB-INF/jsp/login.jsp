<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="navbar.jsp"%>
<%@ include file="all_css.jsp" %>
<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <form action="/login" method="post">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-4 col-lg-6 col-xl-5">
     
        <div class="card bg-white text-dark" style="border-radius: 1rem;">
        
          <div class="card-body p-5 text-center">
			
            <div class="mb-md-2 mt-md-2 pb-5">
			 <h2>${errorMsg}</h2>
              <h2 class="fw-bold mb-2 text-uppercase">Login</h2>
              <p class="text-white-50 mb-5">Please enter your login and password!</p>

              <div class="form-outline form-white mb-4">
                <input type="email" id="typeEmailX" required="required" name ="email" class="form-control form-control-lg" />
                <label class="form-label" for="typeEmailX">Email</label>
              </div>

              <div class="form-outline form-white mb-4">
                <input type="password" id="typePasswordX" required="required" name="password" class="form-control form-control-lg" />
                <label class="form-label" for="typePasswordX">Password</label>
              </div>

              <p class="small mb-5 pb-lg-2"><a class="text-white-50" href="/resetPassword">Forgot password?</a></p>

              <button class="btn btn-outline-dark btn-lg px-5" type="submit">Login</button>
              
            </div>

             <div>
              <p class="mb-0">Don't have an account? <a href="/signup" class="text-white-50 fw-bold">Sign Up</a>
              </p>
            </div> 

          </div>
        </div>
      </div>
    </div>
    </form>
  </div>
</section>
</html>