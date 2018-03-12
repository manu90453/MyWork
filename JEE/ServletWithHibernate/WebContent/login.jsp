<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
 <link rel="stylesheet" type="text/css" href="css/style.css" />
  <style type="text/css">
#nav {
    line-height:30px;
    height:450px;
    width:640px;
    float:left;
    padding:5px;	
    font-size: large;      
}
#section {
    width:350px;
    float:left;
    padding:10px;	 	 
}
#p
{
   font-size: medium;
   color: blue;
   text-align:left;
 }
h1 {
    color:white;
    font-family:verdana;
    font-size:150%;
}
p  {
    color:blue;
    font-family:courier;
    font-size:120%;
}
table {
    font-style: b;
}
  </style>
  
  <style >
  .manish{
  	align:right;
  	size:5;
  	color:green;
  }
  </style>
</head>
  <body>
     <div id="whole">
         <div id="header">
            <h1 align="left">SAVA</h1>   	       
         </div>
       
         <div id="nav">
            <br>
            <p title="about SAVA" > <q>We Provide the best services</q></p><br><br>
            <p title="about SAVA">User can access the service 24*7*365</p><br><br>
            <p title="about SAVA"> We will try to add new feature in future</p><br><br>
         </div>
         <div id="section"><br>
             <pre width="10" style="background-color:silver;">
             <form action="LoginServlet" method="post">
             <fieldset>
                 <legend style="font-style: inherit; color: red">Sign In</legend>
                 <table>
                   <tr>
                     <td>UserName: </td>
                   </tr> 
                   <tr>
                     <td><input type="text" name="userName" ></tr>
                   <tr>
                     <td>Password: </td>
                   </tr>
                   <tr>
                     <td><input type="password" name="password">
                   </tr>
                   <tr>
                    <td> <input type="submit" value="Submit">
                  </tr>
                </table>
           </fieldset>
           </form>
              </pre>
                   Are you new user:<a href="registration.jsp">Sign-Up</a>
           </div>
           <div id="footer">
               Copyright © SeVa.com<br> <img src="images/seva.jpg" alt="Seva View">
           </div>
         </div>
  </body>
</html>