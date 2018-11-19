<?php

//establishes connection to database
return $queens_connection = mysqli_connect('cmaguire82.students.cs.qub.ac.uk','root','4v6fb2r8nk41gf4p','cmaguire82');

//error handler
if(!$queens_connection){
	die("Connection Failed: ".mysqli_connect_error());
}