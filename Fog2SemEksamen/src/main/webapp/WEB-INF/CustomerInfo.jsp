<%@page import="FunctionLayer.Customer"%>
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

        <h1>Kunde Information</h1>

        <div class="container">
            <h2>Bordered Table</h2>
                      
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>email</th>
                        <th>phone</th>
                        
                        

                    </tr>
                </thead>

                <tbody class="tbodypurchase">
                    <% Customer customer = (Customer) request.getSession().getAttribute("customerInfo");
                        {
                    %>
                    <tr>
                        <th><%= customer.getUsername()%></th>
                        <th><%= customer.getEmail()%></th>
                        <th><%= customer.getPhone()%></th> 
                     
                            
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
        
    </table>
    <br><br>



    
    <%@include file="/WEB-INF/Includes/footeremp.jsp" %>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</body>
</html>
