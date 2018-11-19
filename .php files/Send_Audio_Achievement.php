<?php  
// connection to the database
 include 'db.php';

$username = $_POST['username'];
$pass = $_POST['pass'];

//if statment to select row with corresponding password and username
$res = mysqli_query($connection, "SELECT * from user_details where username = '$username' AND pass = $pass");

    if (mysqli_num_rows($res) == 1){

//selects the id from the database
$res2 = mysqli_query($connection, "SELECT userid from user_details where username = '$username' AND pass = $pass");
    $row = mysqli_fetch_assoc($res2);
    $userid = $row['userid'];

//updates user achievement
mysqli_query($connection, "UPDATE user_achievement SET unlocked = 1 WHERE achievement_id=7 AND userid=$userid");

//$result =  $connection->query($sql);


}


/*
  $user_id = $_POST["user_id"];

  	// updates the achievements table to unlock learn send audio achievement 
    $statement = mysqli_prepare($connect, "UPDATE user_achievement SET `unlocked` = 1 WHERE user_id = ? AND achievement_id = 9" );
   
    mysqli_stmt_bind_param($statement, "s", $user_id);
    mysqli_stmt_execute($statement);