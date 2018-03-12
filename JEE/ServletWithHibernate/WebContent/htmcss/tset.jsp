<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Register here</title>
<link rel="stylesheet" type="text/css" href="test.css"/>
<style>
.center {
    text-align:left;
    color: red;
}
#para1 {
    text-align: left;
    color: red;
}
p.center {
    text-align: center;
    color: blue;
}
h1 {
    text-align: center;
    color: red;
}
h2 {
    text-align: center;
    color: red;
}
h3, h4 {
    text-align: left;
    color: fuchsia;
}


</style>
</head>
   <body >
  
        <h4 class="center">---------- Contact Info ----------</h4>  
          <form action="RegistrationServlet" method="post">
           
            <p class="center">First name:
            <input type="text" name="firstName"></p><br>
             
            <p id="para1"> Last name:</p>
            <input type="text" name="lastName"><br>
          
          <h3> E-mail:<br></h3>
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
         
            Copyright © SeVa.com
      </body>
</html>