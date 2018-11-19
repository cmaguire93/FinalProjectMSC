<?php


return $connection = mysqli_connect('localhost','root','','guitar_tutor2');

if(!$connection){
	die("Connection Failed: ".mysqli_connect_error());
}