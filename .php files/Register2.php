<?php

$connection = mysqli_connect('localhost','root','','guitar_tutor');

$first_name= $_POST["first_name"];
$last_name= $_POST["last_name"];
$username= $_POST["username"];
$password = $_POST["password"];

$statement = mysqli_prepare($con, "INSERT INTO user(first_name, last_name, username, password)VALUES(?,?,?,?)");
mysqli_stmt_bind_param($statement, "siss", $first_name, $last_name,$username,$password);
mysqli_stmt_execute($statement);

$responce = array();
$responce ["success"]=true;

echo json_encode($responce);