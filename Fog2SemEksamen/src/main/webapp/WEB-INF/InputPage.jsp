
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <style>
            .center-block {
                display: block;
                margin-right: auto;
                margin-left: auto;
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="/WEB-INF/Includes/menulog.jsp" %>
        <div class="center-block">
            <h1>inputpage</h1>
            <table>
                <tr>
                    <td>
                        <form action="FrontController" method="POST">
                            <input type="hidden" name="command" value="CreateOrderPage"> 
                            <br/>
                            Height:
                            <br/>
                            <input type="number" name="height" placeholder="minimum 200cm" min="200" >
                            <br/>
                            Length:
                            <br/>
                            <input type="number" name="length" placeholder="minimum 250cm" min="250" >
                            <br/>
                            Width:
                            <br/>
                            <input type="number" name="width" placeholder="minimum 250cm" min="250" > 
                            <br>
                            roof_id:
                            <br/>
                            <input type="number" name="roof_id" value="1" placeholder="1" min="1" > 
                            <br>                            
                            <input type="submit" value="submit">
                            <br/>
                        </form>
                    </td>
                </tr>
            </table>
        </div>
        <br><br>
        <%@include file="/WEB-INF/Includes/footerlog.jsp" %>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </body>
</html>
