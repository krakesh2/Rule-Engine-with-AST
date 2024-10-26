<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome</title>
<style>
body {
	font-family: Arial, sans-serif;
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	height: 100vh;
	background-color: #e6ffe6;
	margin: 0;
}

h1 {
	color: #4CAF50;
}

p {
	color: #333;
	font-size: 1.2em;
}
</style>
</head>
<body>

	<h1>Welcome!</h1>
	<p>Your data has been successfully submitted and validated.</p>
	<a href="/api/rules/create"><button type="submit">Create New Rule</button></a>


</body>
</html>
