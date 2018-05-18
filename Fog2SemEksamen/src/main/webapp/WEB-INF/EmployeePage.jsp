<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="/WEB-INF/Includes/menuemp.jsp" %>

        <div class="text-center">

            <h1>Employee</h1>

            <form name="CustomerPage" action="FrontController" method="post">
                <input type="hidden" name="command" value="ShowOrders" />
                <br/><br/>
                <input class="btn btn-success" type="submit" value="OrdreOversigt" />
            </form>
            <br><br>




            </form>

            <form name="EmployeePage" action="FrontController" method="post">

                <input type="hidden" name="command" value="CreateEmployeePage" />


                <br/><br/>
                <input class="btn btn-success" type="submit" value="Create new Employee" />
            </form>
        </div>
        <div class="container">
            
            <img src="https://www.google.com/search?biw=1366&bih=662&tbm=isch&sa=1&ei=Vq3-Wrm2JIjOwQKiu5j4BQ&q=johannes+fog&oq=johannes&gs_l=img.3.0.35i39k1j0l9.26957.28594.0.29241.8.8.0.0.0.0.196.1015.0j8.8.0....0...1c.1.64.img..0.8.996...0i67k1.0.2pGugtpUrnI#imgrc=rD28IWJ629CotM:" height="200" >
        </div>
        
        <%@include file="/WEB-INF/Includes/footeremp.jsp" %>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </body>
</html>
