<%-- 
    Document   : customerProfile
    Created on : Feb 15, 2022, 10:01:30 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Profile</title>

        <!--import bootstrap css-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>  
        <div class="container">
                                                
            <h1 class="text-center">ACCOUNT DETAILS</h1>
            <style type="text/css">
                body { background: #03ABA0 !important; }
            </style>
            <h2>ACCOUNT SECURITY</h2>
            <div class="alert alert-info">
               <div class="row">
                <div class="col">USERNAME:</div>
                <div class="col">${user.getUsername()}</div>
                <div class="w-100"></div>
                <div class="col">PASSWORD:</div>
                <div class="col">*****</div>                       
                </div>                                                                                         
            </div>
 
            <h3>ABOUT ME</h3>
            <div class="alert alert-info">
                <div class="row">
                <div class="col">FIRST NAME:</div>
                <div class="col">${user.getFirstName()}</div>
                <div class="w-100"></div>
                <div class="col">LAST NAME:</div>
                <div class="col">${user.getLastName()}</div>
                <div class="w-100"></div>
                <div class="col">PHONE NUMBER:</div>
                <div class="col">${user.getPhoneNumber()}</div>                
                </div>                                                                                         
            </div>

<!--            <h3>SAVED ADDRESSES</h3>
            <div class="alert alert-info">
                <div class="row">BILLING ADDRESS</div>
                <div class="row">Tobias</div>
                <div class="row">1 Apple Drive</div>
                <div class="row">Toronto ON</div>   
                <div class="row">H67R52 Canada</div>
                <div class="row">4563447897</div>       
                </div>                                                                                         
            </div>            -->
            
            
            
            
            
            
            
            
            
            
            
            
        </div>
            
            
            
            
            


              
            
        </div>
        
        <!--import bootstrap js-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>        
