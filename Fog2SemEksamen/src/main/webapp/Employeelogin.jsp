<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="/WEB-INF/Includes/menu.jsp" %>

        <div class="container">
            <div class="col-lg-4 ">
        <h1>Employee Login</h1>
                <br>
                <form name="EmployeePage" action="FrontController" method="post">
                    <input type="hidden" name="command" value="LoginEmployeePage" />
                    <input type="text" name="email"  placeholder="Email" />
                    <input type="password" name="password"  placeholder="Password" />
                    <br/><br/>
                    <input class="btn btn-success" type="submit" value="Employee" />
                </form>
            </div>
        </div>
        <br>
        <div class="container">
            
            <img src="https://www.johannesfog.dk/globalassets/footer-263x175/sporg-fog.jpg" alt="karl" height="300" >
        </div>


        <%@include file="/WEB-INF/Includes/footer.jsp" %>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </body>
</html>
