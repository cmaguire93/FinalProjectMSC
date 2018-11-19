<?php

// connection to the database
include 'db.php';
global $connection;

$db = new db();

$response = array('error' => false);

 if($_SERVER['REQUEST_METHOD']=='POST'){

 //Getting values 
 $username = $_POST['username'];
 $pass = $_POST['pass'];



 // get the user by email and password
    $user = $db->getUser($username, $pass);

if($user !=false){

 $response["error"] = FALSE;
 $response["userid"] = $user["userid"]

echo json_encode($response);

}else{
	// user is not found with the credentials
        $response["error"] = TRUE;
        $response["error_msg"] = "Login credentials are wrong. Please try again!";

        echo json_encode($response); //encode this to JSON,so later on can be use in Android code
    } else {
    // required post params is missing
    $response["error"] = TRUE;
    $response["error_msg"] = "Required parameters email or password is missing!";
    echo json_encode($response);
}
}



/*
 $username = $_POST["username"];
 $pass = $_POST["pass"];

// sql query to select data from databse
    $sql = mysqli_prepare($connection, "SELECT * FROM users WHERE username = ? AND pass = ?");
    mysqli_stmt_bind_param($sql, "ss", $username, $pass);
    mysqli_stmt_execute($sql);

    mysqli_stmt_store_result($sql);
    mysqli_stmt_bind_result($sql, $userid, $username, $pass, $first_name, $last_name);

// array to store results of query
    $response = array();
    $response["success"] = false;

// loop to return data from the rows
    while(mysqli_stmt_fetch($sql)){
        $response["success"] = true;
        $response["userid"] = $userid;
        $response["username"] = $username;
        $response["pass"] = $pass;
        $response["first_name"] = $first_name;  
        $response["last_name"] = $last_name;          
        }

// responce recieved by android 
    echo json_encode($response);
    ?>