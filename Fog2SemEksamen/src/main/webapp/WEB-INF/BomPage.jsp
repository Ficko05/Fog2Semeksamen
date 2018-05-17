
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
        <h1>Stykeliste</h1>

        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Navn</th>
                    <th>Antal</th>
                    <th>    </th>
                    <th>Beskrivelse</th>
                </tr>
            <tbody class="tbodypurchase">
                <% ArrayList<Material> bom = (ArrayList<Material>) request.getAttribute("bom");
                    for (Material mat : bom) {%>
                <tr>
                    <th><% mat.getName();%></th> 
                    <th><% mat.getFormat();%></th> 
                    <th><% mat.getQuantity();%></th> 
                    <th><% mat.getDescription();%></th> 
                </tr>
                <% }%>
            </tbody>
        </thead>

    </table>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</body>
</html>
