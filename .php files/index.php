<?php

session_start();

?>
<!DOCTYPE html>
<html>
<head>
  <title></title>
</head>
<body>


<br><br><br>


<form action="login.php" method="GET">
  
  <input type ="text" name="username" placeholder="username"><br>
   <input type ="password" name="pass" placeholder="password"><br>
   <button type = "submit">LOGIN</button>

</form>

<?php 


if(isset($_SESSION['id'])){
  echo $_SESSION['id'];
}else{
  echo "you are not logged in";
}

 ?>


<br><br>
<form action="register.php" method="POST">
  
  <input type ="text" name="first_name" placeholder="first name"><br>
 <input type ="text" name="last_name" placeholder="last name"><br>
  <input type ="text" name="username" placeholder="username"><br>
   <input type ="password" name="pass" placeholder="password"><br>
   <button type = "submit">SIGN UP</button>
</form>

<br><br>

<form action ="logout.php">
  <button>LOG OUT</button>

</form>

</body>
</html>