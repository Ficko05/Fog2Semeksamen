
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>inputpage</h1>
        <div>
            <table>
                <tr>
                    <td>
                        <form      action="FrontController" method="POST">
                            <input type="hidden" name="command" value="CreateOrderPage"> 
                            <br/>
                            Height:
                            <br/>
                            <input type="number" name="height" value="1" min="1" >
                            <br/>
                            Length:
                            <br/>
                            <input type="number" name="length" value="1" min="1" >
                            <br/>
                            Width:
                            <br/>
                            <input type="number" name="width" value="1" min="1" > 
                            <br>
                            roof_id:
                            <br/>
                            <input type="number" name="roof_id" value="1" min="1" > 
                            <br>                            
                            <input type="submit" value="submit">
                            <br/>
                        </form>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
