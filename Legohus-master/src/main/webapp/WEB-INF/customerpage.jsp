
<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
           <%@include file="../includes/menu_login.jsp" %>
        <h1>Hello <%User user = (User) session.getAttribute("user");
        out.print(user.getEmail());%> </h1>
        You are now logged in as a customer of our wonderful site.
      
    </body>
</html>
