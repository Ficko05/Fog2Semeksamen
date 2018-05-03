<%-- 
    Document   : showOrder
    Created on : 28-03-2018, 17:56:57
    Author     : Nicolai
--%>

<%@page import="FunctionLayer.Calculate"%>
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
       <%@include file="../includes/menu_login.jsp" %>
        
           <% 
        List<Order> orders =(List<Order>) request.getAttribute("orders");
     
        for(Order order:orders){
        %> <a> <%= order.toString()%> <%= Calculate.orderCalculator(order).toString() %> </a> <br> <%  
        }

        %>

    </body>
</html>
