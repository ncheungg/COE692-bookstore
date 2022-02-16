<%-- 
    Document   : customerHistory
    Created on : Feb 15, 2022, 10:01:41 PM
    Author     : student
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Purchase History</title>
        
        <!--import bootstrap css-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            
            <h1 class="text-center mb-4">Purchase History</h1>
            
            <table class="table">
                <thead>
                    <th scope="col">Title</th>
                    <th scope="col">Authors</th>
                    <th scope="col">Year</th>
                </thead>
                
                <tbody>
                    <c:forEach items="${history}" var="entry">
                        <tr>
                            <c:forEach items="${entry}" var="value">
                                <td>${value}</td>
                            </c:forEach>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            
        </div>
        
        <!--import bootstrap js-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>


