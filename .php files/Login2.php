<?php 
 
 if($_SERVER['REQUEST_METHOD']=='POST'){
 //Getting values 
 $username = $_POST['username'];
 $pass = $_POST['pass'];
 
 //Creating sql query
 $sql = "SELECT * FROM user_details WHERE username='$username' AND pass='$pass'";
 
 //importing dbConnect.php script 
 require_once('db.php');
 
 //executing query
 $result = mysqli_query($connection,$sql);
 
 //fetching result
 $check = mysqli_fetch_array($result);
 
 //if we got some result 
 if(isset($check)){
 //displaying success 
 echo "success";
 }else{
 //displaying failure
 echo "failure";
 }
 mysqli_close($connection);
 }