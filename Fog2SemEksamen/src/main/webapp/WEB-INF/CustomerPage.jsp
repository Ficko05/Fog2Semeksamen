<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%@include file="../includes/menu.jsp" %>
        <h1>Hello World!</h1>
        <p>your length ${length}</p>
        <p>your Width ${width}</p>
        <p>your Height ${height}</p>
        

        <form name="CustomerPage" action="FrontController" method="post">
               <input type="hidden" name="command" value="InputPage">
            
            
            <input type="submit" name="submit" />
         </form>
    </body>
</html>
