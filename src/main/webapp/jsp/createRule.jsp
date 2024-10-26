<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rule Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        form {
            max-width: 400px;
            margin: 0 auto;
        }
        label {
            display: block;
            margin-top: 10px;
        }
        input[type="text"], input[type="number"], textarea {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            box-sizing: border-box;
        }
        button {
            margin-top: 15px;
            padding: 10px 15px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <h2>Rule Information Form</h2>
    <form action="/api/rules/create" method="post">
        <label for="id">ID:</label>
        <input type="number" id="id" name="id" placeholder="auto generate" readonly>

        <label for="ruleName">Rule Name:</label>
        <input type="text" id="ruleName" name="ruleName" required>

        <label for="ruleAst">Rule AST:</label>
        <textarea id="ruleAst" name="ruleAst" rows="6" required></textarea>

        <button type="submit">Submit</button>
    </form>

</body>
</html>
