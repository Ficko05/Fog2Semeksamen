

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index.jsp">FOG</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="index.jsp">Home</a></li>
      <%request.getSession().invalidate();%> 

      <li><a href="login.jsp"> Login</a></li>
      <li><a href="Employeelogin.jsp"> Emplayee Login</a></li>
      
    </ul>
  </div>
</nav>

