<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="stylesheet.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <style>
            img {
                display: block;
                margin-left: auto;
                margin-right: auto;
            }
        </style>
        

    </head>
    <body>
        <%request.getSession().invalidate();%>
        <%@include file="/WEB-INF/Includes/menu.jsp" %>

        <div class="text-center" height="100%" width="100%">
            <img src="http://shop.johannesfog.dk/gfx/foglogok.png" height="200"/>        
        </div>


        <div class="container" height="100%" width="100%">
            <img src="https://solundhuse.dk/wp-content/uploads/2018/01/Karl_2_with_extension_small-1.jpg" alt="karl"  height="500" />
        </div>

        <%@include file="/WEB-INF/Includes/footer.jsp" %>


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </body>
</html>
