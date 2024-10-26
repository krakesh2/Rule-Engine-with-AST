<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Submission Failed</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            background-color: #ffe6e6;
            margin: 0;
        }
        h1 {
            color: #e60000;
        }
        p {
            color: #333;
            font-size: 1.2em;
        }
    </style>
</head>
<body>

    <h1>Submission Failed</h1>
    <p>There was an error with your submission. Please go back and check your data.</p>
    <a href="/api/rules/evaluateform"><button type="submit">Back</button></a>

</body>
</html>
