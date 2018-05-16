<%-- 
    Document   : BomPage
    Created on : May 16, 2018, 1:31:44 PM
    Author     : steven
--%>

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
                        for (int i = 0; bom.size() < 10; i++) {
                                
                            
 {%>
                    <tr>
                        <th><% bom.getName();%></th> 
                        <th><% bom.getFormat();%></th> 
                        <th><% bom.getQuantity();%></th> 
                        <th><% bom.getDescription();%></th> 
                    </tr>
                    <% }%>
            </tbody>
            </thead>

        </table>

    </body>
</html>
