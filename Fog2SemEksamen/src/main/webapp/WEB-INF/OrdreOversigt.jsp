<%@page import="java.util.List"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>odre oversigt</h1>
        
  
           
        <p>hey</p>
        
        <%List<Order> orders = (List<Order>) request.getAttribute("orders");
        
        for(Order order:orders){
            %> <a> <%= order.toString()%> </a><br><%
        }
        %>
        
        
        <form name="DrawerPage" action="FrontController" method="post">

            <input type="hidden" name="command" value="DrawerPage" />


            <br/><br/>
            <div class="buttonHolder">
                <input type="submit" value="CustomerPage" />
            </div>
        </form>
        
    </body>
</html>
