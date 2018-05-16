
<%@page import="FunctionLayer.BillOfMaterial.Material"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fog</title>
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

</body>
</html>
