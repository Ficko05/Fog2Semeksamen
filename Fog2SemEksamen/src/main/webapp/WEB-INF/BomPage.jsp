
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.BillOfMaterial.Material"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fog</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    </head>
    <body>
        <%@include file="/WEB-INF/Includes/menuemp.jsp" %>
        <div class="container">
            <% Order order = (Order) request.getSession().getAttribute("order");%>
            <h1>Stykeliste for Order nr. <%=order.getId()%></h1>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Navn</th>
                        <th>Antal</th>
                        <th>    </th>
                        <th>Beskrivelse</th>
                    </tr>
                <tbody class="tbodypurchase">
                    <% ArrayList<Material> bom = (ArrayList<Material>) request.getSession().getAttribute("bom");
                    for (Material mat : bom) {%>
                    <tr>
                        <th><% out.print(mat.getName());%></th> 
                        <th><% out.print(mat.getFormat());%></th> 
                        <th><% out.print(mat.getQuantity());%></th> 
                        <th><% out.print(mat.getDescription());%></th> 
                    </tr>
                    <% }%>
                </tbody>
                </thead>

                
            </table>
                <%
                String svg = (String) request.getSession().getAttribute("svg");
                out.print(svg);
                %>
        </div>
        <%@include file="/WEB-INF/Includes/footeremp.jsp" %>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </body>
</html>
