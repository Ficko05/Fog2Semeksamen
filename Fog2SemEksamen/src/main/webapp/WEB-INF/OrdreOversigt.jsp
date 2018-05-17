<%@page import="java.util.List"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <link href="stylesheet.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="/WEB-INF/Includes/menuemp.jsp" %>

        <h1>odre oversigt</h1>

        <div class="container">
            <h2>Bordered Table</h2>
            <p></p>            
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Height</th>
                        <th>Length</th>
                        <th>Width</th>
                        <th>Roof_id</th>
                        <th>Date</th>
                        <th>Status</th>
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
                        <th><%= order.getDate()%></th>
                        <th><%= order.getStatus()%> </th>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>

        <form name="CustomerPage" action="FrontController" method="post">

                <input type="hidden" name="command" value="CustomerpageButton" />
            <br/><br/>
            <input class="btn btn-success" type="submit" value="CustomerPage" />
        </form>
    </table>
    <br><br>
    
    <%@include file="/WEB-INF/Includes/footerlog.jsp" %>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</body>
</html>
