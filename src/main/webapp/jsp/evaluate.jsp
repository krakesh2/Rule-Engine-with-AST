<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        form {
            max-width: 300px;
            margin: 0 auto;
        }
        label {
            display: block;
            margin-top: 10px;
        }
        input[type="text"], input[type="number"] {
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

    <h2>Employee Information Form For Evaluate The Criteria</h2>
    <form action="/api/rules/evaluate" method="post">
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" min="18" max="100" required>

        <label for="department">Department:</label>
        <input type="text" id="department" name="department" required>

        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" min="0" step="0.01" required>

        <label for="experience">Experience (years):</label>
        <input type="number" id="experience" name="experience" min="0" max="50" required>

        <button type="submit">Submit</button>
    </form>

</body>
</html>

