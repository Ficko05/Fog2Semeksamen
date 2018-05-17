

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
        <h1>Create Employee</h1>
        <%@include file="/WEB-INF/Includes/menuemp.jsp" %>

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
        <%@include file="/WEB-INF/Includes/footeremp.jsp" %>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


    </body>
</html>
