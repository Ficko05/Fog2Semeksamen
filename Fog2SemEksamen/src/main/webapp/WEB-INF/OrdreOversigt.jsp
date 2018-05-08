<%@page import="java.util.List"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="stylesheet.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>

        <h1>odre oversigt</h1>
        <table id="purchasetable">
            <thead class="tbodypurchase">
                <tr>
                    <th>Height</th>
                    <th>Length</th>
                    <th>Width</th>
                    <th>Roof_id</th>
                    <th>Date</th>
                    <th>status</th>
                </tr>
            </thead>
            <tbody class="tbodypurchase">
                <% List<Order> orders = (List<Order>) request.getAttribute("orders");
                    for (Order order : orders) {%>
                <tr>
                    <th><%= order.getHeight()%></th> 
                    <th><%= order.getLength()%></th> 
                    <th><%= order.getWidth()%></th> 
                    <th><%= order.getRoof_id()%></th>
                    <th><%= order.getDate() %></th>
                    <th><%= order.getStatus() %> </th>


                </tr>
                <% }%>
            </tbody>
            


            <form name="DrawerPage" action="FrontController" method="post">

                <input type="hidden" name="command" value="DrawerPage" />


                <br/><br/>
                <div class="buttonHolder">
                    <input type="submit" value="CustomerPage" />
                </div>
            </form>
        </table>
    </body>
</html>
