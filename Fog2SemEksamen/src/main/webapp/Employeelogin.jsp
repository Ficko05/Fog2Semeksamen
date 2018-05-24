<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="/WEB-INF/Includes/menu.jsp" %>


        <div class="container">
            <div class="row">
                <div class="span12">
                    <div class="" id="loginModal">

                        <div class="modal-body">
                            <div class="well">

                                <div id="myTabContent" class="tab-content">
                                    <div class="tab-pane active in" id="login">
                                        <form name="EmployeePage" class="form-horizontal" action="FrontController" method="POST">
                                            <input type="hidden" name="command" value="LoginEmployeePage" />
                                            <fieldset>
                                                <div id="legend">
                                                    <legend class="">Employee Login</legend>
                                                </div>    
                                                <div class="control-group">
                                                    <!-- Username -->
                                                    <label class="control-label"  for="email">E-Mail</label>
                                                    <div class="controls">
                                                        <input type="text" id="username" name="email" placeholder="Email" class="input-xlarge">
                                                    </div>
                                                </div>

                                                <div class="control-group">
                                                    <!-- Password-->
                                                    <label class="control-label" for="password">Password</label>
                                                    <div class="controls">
                                                        <input type="password" id="password" name="password" placeholder="Password" class="input-xlarge">
                                                    </div>
                                                </div>


                                                <div class="control-group">
                                                    <!-- Button -->
                                                    <div class="controls">
                                                        <button type="submit" class="btn btn-success">Login</button>
                                                    </div>
                                                </div>
                                            </fieldset>
                                        </form>                
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container" height="100%" width="100%">

                <img src="https://www.johannesfog.dk/globalassets/footer-263x175/sporg-fog.jpg" alt="karl" height="300" >
            </div>
            <br><br><br><br><br><br>


            <%@include file="/WEB-INF/Includes/footer.jsp" %>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
            <!-- Latest compiled and minified JavaScript -->
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </body>
</html>
