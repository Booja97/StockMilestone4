<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Login Page</title>
<style>

input[type=text], input[type=password] {
  width: 60%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
body
{
  background-image: url("dashboard.jpeg");
  height: 500px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}


button {
  background-color: #8c8c8c;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 20%;
  border-radius:50%;
  
}


button:hover {
  opacity: 0.8;
}



.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}




.un {
    width: 76%;
    color: black;
    font-weight: 700;
    font-size: 14px;
    letter-spacing: 1px;
    background: white;
    padding: 10px 20px;
    border: none;
    border-radius: 20px;
    outline: none;
    box-sizing: border-box;
    border: 2px solid rgba(0, 0, 0, 0.02);
    margin-bottom: 50px;
    margin-left: 46px;
    text-align: center;
    margin-bottom: 27px;
    font-family: 'Ubuntu', sans-serif;
     border-color:lightgray;
    }
   
    .submits {
        cursor: pointer;
        border-radius: 5em;
        color:white;
        background:#8c8c8c;
        border: 0;
        padding-left: 20px;
        padding-right: 20px;
        padding-bottom: 10px;
        padding-top: 10px;
        font-family: 'Ubuntu', sans-serif;
       
        font-size: 13px;
        box-shadow: 0 0 20px 1px rgba(0, 0, 0, 0.04);
    }
    .submits:hover
   {
   background-color:#333333;
   }
  p



.main {
        
        width: 700px;
        height: 400px;
        margin: 7em auto;
        border-radius: 1.5em;
        box-shadow: 0px 11px 35px 2px rgba(0, 0, 0, 0.14);
    }

/* The "Forgot password" text */
span.psw {
  float: center;
  padding-top: 40px;
  color:white;
  font-size: 25px;
}
a.psw {
  float: center;
  padding-top: 40px;
  color:#24d64b;
}
</style>
</head>
<div class="background">
<body >

<form action="/login" method="get" modelAttribute="user">
<div class="main">
<div class="imgcontainer"><br>
<h1><i><div class="colour">Stock Management</div></i></h1></div>
<div class="imgcontainer">
  <div class="container">
  <input class="un" type="text" placeholder="Enter Your username" name="userName" required><br> <br>
  <input class="un"type="password" placeholder="Enter Password" name="password" required><br><br>
  <button class="submits" type="submit">Login</button><br> </div>
  <div> <br><br>
  <span class="psw"><b>Click here to register...</b> <a class="psw" href="RegisterUser">Register</a></span>
  </div>
  </div>
  </div>
  </div>

</form>

</body>
</html>

