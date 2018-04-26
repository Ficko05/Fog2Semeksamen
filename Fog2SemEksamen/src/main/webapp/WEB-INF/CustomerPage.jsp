<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
        
        
        

                                <form name="CustomerPage" action="FrontController" method="post">
                                
                                <input type="hidden" name="command" value="CustomerPage" />
                                
                                <input type="text" name="længde"  placeholder="længde" />
                                
                                <input type="text" name="bredde"  placeholder="bredde" />
                                
                                <input type="text" name="højde" placeholder="højde" />
                                <br/><br/>
                                <div class="buttonHolder">
                                <input type="submit" value="CustomerPage" />
                                </div>
                            </form>
    </body>
</html>
