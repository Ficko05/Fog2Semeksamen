<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <header>
           
            <%@page import="FunctionLayer.Employee"%>

            <%Employee emp = (Employee) session.getAttribute("employee");%>
            <div class="navbar-header">
                <a class="navbar-brand" href="index.jsp">FOG</a>
            </div>
            <ul class="nav navbar-nav">

                <% if (emp != null) { %>
                <li><a href="FrontController?command=EmployeePage">Min Side</a></li>
                    <% }%>
                    <% if (emp == null) { %>
                <li>        <a href="FrontController?command=login">Login</a></li>
                    <% } else { %>
                
                <li> <a href="index.jsp">Logud</a></li>
                
                    <% }%>
                

                <li><a href="FrontController?command=ShowOrders"> Ordre</a></li>
            </ul>
        </header>
    </div>
</nav>
