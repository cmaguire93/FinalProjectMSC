<?php  
// connection to the database
 include 'db.php';

$username = $_POST['username'];
$pass = $_POST['pass'];

//if statment to select row with corresponding password and username
$res = mysqli_query($connection, "SELECT userid from user_details where username = '$username' AND pass = $pass");

    if (mysqli_num_rows($res) == 1){

//selects the id from the database
$res2 = mysqli_query($connection, "SELECT userid from user_details");
    $row = mysqli_fetch_assoc($res2);
    $userid = $row['userid'];

//updates user achievement
mysqli_query($connection, "UPDATE user_achievement SET unlocked = 1 WHERE achievement_id=4 AND userid=$userid");


}else{
	echo "failure";
}