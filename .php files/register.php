<?php  

session_start();

// connection to the database
include 'db.php';
global $connection;

// variables posted from application 
$first_name = $_POST['first_name'];
$last_name = $_POST['last_name'];
$username = $_POST['username'];
$pass = $_POST['pass'];

//if statment to check username is already taken
$res = mysqli_query($connection, "SELECT * from user_details where username = '$username';");

    if (mysqli_num_rows($res) == 0){

//inserts user details into database
$sql= "INSERT INTO user_details (first_name,last_name,username,pass)VALUES ('$first_name','$last_name','$username','$pass')";
$result =  $connection->query($sql);

//selects the max id from the database
$res2 = mysqli_query($connection, "SELECT max(userid) from user_details");
    $row = mysqli_fetch_assoc($res2);
    $max_id = $row['max(userid)'];

    // will initalise the app achievments 
    //Register achievment set to true 
    mysqli_query($connection, "INSERT INTO user_achievement (userid, achievement_id,unlocked) VALUES ('$max_id', 1,TRUE)");
    mysqli_query($connection, "INSERT INTO user_achievement (userid, achievement_id) VALUES ('$max_id', 2)");
    mysqli_query($connection, "INSERT INTO user_achievement (userid, achievement_id) VALUES ('$max_id', 3)");
    mysqli_query($connection, "INSERT INTO user_achievement (userid, achievement_id) VALUES ('$max_id', 4)");
    mysqli_query($connection, "INSERT INTO user_achievement (userid, achievement_id) VALUES ('$max_id', 5)");
    mysqli_query($connection, "INSERT INTO user_achievement (userid, achievement_id) VALUES ('$max_id', 6)");
    mysqli_query($connection, "INSERT INTO user_achievement (userid, achievement_id) VALUES ('$max_id', 7)");
   
//$response = array();
//$response["success"] = true;
//echo json_encode($response);
echo "success";


}else{
 $response = array();
  $response["success"] = false;

    echo json_encode($response);
}




//header("Location: index.php");3