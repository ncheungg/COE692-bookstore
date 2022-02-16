<%-- 
    Document   : customerLogin
    Created on : Feb 15, 2022, 8:44:21 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Login</title>
        
        <!--import bootstrap css-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            
            <h1>Customer Login</h1>
            
            <form action="Login" method="post">
                <div class="mb-3">
                    <label for="username-input" class="form-label">Username</label>
                    <input name="username" type="text" class="form-control" id="username-input" aria-describedby="username-help" placeholder="Your username">
                    <div id="username-help" class="form-text">We'll never share your information with anyone else.</div>
                </div>
                
                <div class="mb-3">
                    <label for="password-input" class="form-label">Password</label>
                    <input name="password" type="password" class="form-control" id="password-input" placeholder="Your password">
                </div>
                
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            
        </div>
        
        <!--import bootstrap js-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
