<?php  

session_start();

//includes database connection
include_once('db.php');


// handles user login
  if( isset($_POST['username']) && isset($_POST['pass']) ) { 
      
      // variables
        $username = $_POST['username'];
        $pass = $_POST['pass'];
        
        // sql stament to log in 
        $query = "SELECT username, pass FROM user_details". 
        " WHERE username = '$username' AND pass = '$pass'"; 
        
        $result = mysqli_query($connection, $query);
        
        // relates to android app 
        if($result->num_rows > 0){
          if (isset($_POST['mobile']) && $_POST['mobile']=="android"){
          	echo "success";




          	// establishes session id
          	//$_SESSION['id']=$num_rows['id'];


          	exit;
}
echo " Login successful";

      } 

      else{
      	echo "Login failed";
      }
  }

//if(isset($_SESSION['id'])){
 // echo $_SESSION['id'];
//}else{
  //echo "you are not logged in";
//}

?>


<html>
<head><title>Login|</title></head>
    <body>
     
        <form action="<?PHP $_PHP_SELF ?>" method="post">
            username <input type="text" name="username" value="" /><br/>
            pass <input type="password" name="pass" value="" /><br/>
            <input type="submit" name="btnSubmit" value="Login"/>
        </form>
    </body>
</html>
