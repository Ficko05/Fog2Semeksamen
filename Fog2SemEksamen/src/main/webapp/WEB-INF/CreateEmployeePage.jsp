

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create Employee</h1>
        
        <h2>Register new Employee</h2>
                      <form name="CreateEmployeePage" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="CreateEmployee">
                        Name:<br>
                        <input type="text" name="username" value="">
                        <br>
                        Email:<br>
                        <input type="text" name="email" value="@Fog.com">
                        <br>
                        Phone:<br>
                        <input type="text" name="phone" value="">
                        <br>
                        Cpr:<br>
                        <input type="text" name="cpr" value="">
                        <br>
                        Password:<br>
                        <input type="password" name="password1" value="">
                        <br>
                        Retype Password:<br>
                        <input type="password" name="password2" value="">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
        
    </body>
</html>
