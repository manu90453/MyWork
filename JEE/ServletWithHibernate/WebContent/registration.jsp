<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register here</title>
   <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
   <body>
   
       <div id="header">
          <h1>SEVA</h1>
       </div>
       <div id="nav">
       </div>
       <div>
        <font color="red">
        <h4>---------- Contact Info ----------</h4></font>  
          <form action="RegistrationServlet" method="post">
            First name:<br>
            <input type="text" name="firstName"><br>
            Last name:<br>
            <input type="text" name="lastName"><br>
            E-mail:<br>
            <input type="text" name="email"><br>
            Password:<br>
            <input type="password" name="password"><br>
            Contact No:<br>
            <input type="number" name="contact" min="1" max="5"><br>
            Gender:
            <input type="radio" name="sex" value="male" checked>Male<br>
            <input type="radio" name="sex" value="female">Female<br>
         
            <!--  Date Of Birth:<br>
            <input type="date" name="bday"><br>-->
             Current city:<br>
              <select name="city">
               <option value="bangalore">Bangalore</option>
               <option value="bhopal">Bhopal</option>
               <option value="chennai">Chennai</option>
               <option value="delhi" selected>Delhi</option>
               <option value="hyderabad">Hyderabad</option>
               <option value="kolkata">Kolkata</option>
               <option value="Lucknow">Lucknow</option>
               <option value="mumbai">Mumbai</option>
               <option value="pune">Pune</option>
             </select>
             <br><br>
             <input type="submit" value="Create Account">
          </form> 
          </div>
           <div id="footer">
            Copyright © SeVa.com
          </div>
      </body>
</html>