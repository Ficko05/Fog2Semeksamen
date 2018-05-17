<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <header>
            <%@page import="FunctionLayer.Customer"%>
           

            <%Customer cust = (Customer) session.getAttribute("customer");%>
            <div class="navbar-header">
                <a class="navbar-brand" href="index.jsp">FOG</a>
            </div>
            <ul class="nav navbar-nav">

                <% if (cust != null) { %>
                <li><a href="FrontController?command=CustomerPageButton">Min Side</a></li>
                    <% }%>
                    <% if (cust == null) { %>
                <li>        <a href="FrontController?command=login">Login</a></li>
                    <% }  if(cust != null) { %>
                    
                <li> <a href="index.jsp">Logud</a></li>


                <% }%>


                <li><a href="FrontController?command=ShowCustomerOrders"> Mine ordre</a></li>
            </ul>
        </header>
    </div>
</nav>
