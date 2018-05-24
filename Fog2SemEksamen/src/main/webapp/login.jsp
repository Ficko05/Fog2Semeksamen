<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


        <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>JSP Page</title>

    </head>
    <body>

        <%request.getSession().invalidate();%>
        <%@include file="/WEB-INF/Includes/menu.jsp" %>




        <div class="container">
            <div class="row">
                <div class="span12">
                    <div class="" id="loginModal">

                        <div class="modal-body">
                            <div class="well">
                                <ul class="nav nav-tabs">
                                    <li class="active"><a href="#login" data-toggle="tab">Login</a></li>
                                    <li><a href="#create" data-toggle="tab">Create Account</a></li>
                                </ul>
                                <div id="myTabContent" class="tab-content">
                                    <div class="tab-pane active in" id="login">
                                        <form name="login" class="form-horizontal" action="FrontController" method="POST">
                                            <input type="hidden" name="command" value="login" />
                                            <fieldset>
                                                <div id="legend">
                                                    <legend class="">Login</legend>
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
                                    <div class="tab-pane fade" id="create">
                                        <form id="tab">
                                            <label>Full name</label>
                                            <input type="text" value="" name="username" class="input-xlarge" >
                                            <label>Email</label>
                                            <input type="text" value="@nowhere.com" name="email" class="input-xlarge">
                                            <label>Phone</label>
                                            <input type="text" value="" name="phone" class="input-xlarge">
                                            <label>Password</label>
                                            <input type="Password" value="" name="pasword1" class="input-xlarge">
                                            <label>Retype Password</label>
                                            <input type="Password" value="" name="pasword2" class="input-xlarge">

                                            <div>
                                                <button class="btn btn-primary">Create Account</button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container" height="100%" width="100%">
                <img src="data:image/png;base64,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" alt="karl"  height="200" />
            </div>
            <%@include file="/WEB-INF/Includes/footer.jsp" %>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
            <!-- Latest compiled and minified JavaScript -->
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </body>
</html>
