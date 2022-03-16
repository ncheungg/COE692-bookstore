<%-- 
    Document   : customerHome
    Created on : Feb 15, 2022, 9:46:45 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Home</title>
        
        <!--import bootstrap css-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            
            <h1 class="text-center">Customer Home</h1>
            
            <h6 class="text-center">Welcome back ${username}!</h6>
            
            <div class="row g-2">
                <div class="col text-center">
                    <form action="CustomerHome" method="get">
                        <input name="userID" value="${userID}" type="hidden">
                        <button name="customer-action" value="profile" type="submit" class="btn btn-info">View Profile Info</button>
                    </form>
                </div>
                
                <div class="col text-center">
                    <form action="CustomerHome" method="get">
                        <input name="userID" value="${userID}" type="hidden">
                        <button name="customer-action" value="history" type="submit" class="btn btn-warning">View Purchase History</button>
                    </form>
                </div>
                
                <div class="col text-center">
                    <form action="CustomerHome" method="get">
                        <input name="userID" value="${userID}" type="hidden">
                        <button name="customer-action" value="search" type="submit" class="btn btn-primary">Search for Books</button>
                    </form>
                </div>
            </div>
            
        </div>
        
        <!--import bootstrap js-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
