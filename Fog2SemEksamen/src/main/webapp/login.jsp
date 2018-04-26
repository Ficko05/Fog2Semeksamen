

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>JSP Page</title>
        
    </head>
    <body>

        <%@include file="Includes/menu.jsp" %>

       
        <p>hey</p>

  <h1>Login</h1>
                            <form name="login" action="FrontController" method="post">
                                
                                <input type="hidden" name="command" value="login" />
                                
                                <input type="text" name="email"  placeholder="Email" />
                                
                                <input type="password" name="password"  placeholder="Password" />
                                <br/><br/>
                                <div class="buttonHolder">
                                <input type="submit" value="Login" />
                                </div>
                            </form>
  

    </body>
</html>
