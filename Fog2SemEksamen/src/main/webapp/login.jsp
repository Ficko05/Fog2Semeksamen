<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


        <title>JSP Page</title>

    </head>
    <body>

        <%@include file="/WEB-INF/Includes/menulog.jsp" %>

        <div class="container">
            <div class="row">

                <div class="col-lg-4 "
                     <h1>Login</h1>
                    <form  name="login" action="FrontController" method="post">
                        <input type="hidden" name="command" value="login" />
                        <input type="text" name="email"  placeholder="Email" />
                        <input type="password" name="password"  placeholder="Password" />
                        <br/><br/>
                        <input class="btn btn-success" type="submit" value="Login" />
                    </form>
                </div>
                <div class="col-lg-4 "
                     <br><br>
                     <form name="EmployeePage" action="FrontController" method="post">
                    <input type="hidden" name="command" value="LoginEmployeePage" />
                        <input type="text" name="email"  placeholder="Email" />
                        <input type="password" name="password"  placeholder="Password" />
                        <br/><br/>
                        <input class="btn btn-success" type="submit" value="employee" />
                    </form>
                </div>

                <div class="col-lg-4 "
                     <h2>Register</h2>
                    <form name="RegisterPage" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="RegisterPage">
                        Name:<br>
                        <input type="text" name="username" value="">
                        <br>
                        Email:<br>
                        <input type="text" name="email" value="@nowhere.com">
                        <br>
                        Phone:<br>
                        <input type="text" name="phone" value="">
                        <br>
                        Password:<br>
                        <input type="password" name="password1" value="">
                        <br>
                        Retype Password:<br>
                        <input type="password" name="password2" value="">
                        <br>
                        <input class="btn btn-success" type="submit" value="Submit">
                    </form>
                </div>
            </div>
        </div>
        <%@include file="/WEB-INF/Includes/footer.jsp" %>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </body>
</html>
