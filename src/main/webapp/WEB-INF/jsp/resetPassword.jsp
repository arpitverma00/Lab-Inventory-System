<%@ include file="navbar.jsp"%>
<%@ include file="all_css.jsp" %>
<div class="container-fluid back-img">
<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
  <form action="/resetPassword/{email}" method="post">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-4 col-lg-6 col-xl-5">
        <div class="card bg-white text-dark" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">
            <div class="mb-md-2 mt-md-2 pb-2">
              <h2 class="fw-bold mb-0 text-uppercase">Change Your Password</h2>
              <p class="text-white-50 mb-2">Please enter your new password!</p>
           <div class="form-outline form-white mb-2">
                <input type="email" id="typeEmailX" name ="email" required="required" class="form-control form-control-lg" />
                <label class="form-label" for="typeEmailX">Enter your email</label>
              </div>
              <div class="form-outline form-white mb-2">
                <input type="password" id="typeEmailX" name ="password" required="required" class="form-control form-control-lg" />
                <label class="form-label" for="typeEmailX">PASSWORD</label>
              </div>
              <div class="form-outline form-white mb-2">
                <input type="password" id="typePasswordX" name="password1" required="required" class="form-control form-control-lg" />
                <label class="form-label" for="typePasswordX">CONFIRM NEW PASSWORD</label>
              </div>
      <button class="btn btn-outline-dark btn-lg px-5" type="submit">RESET</button>

            </div>
          </div>

        </div>
    </div>
  </div>

    </form>

  </div>

</section>

  </div>

</html>