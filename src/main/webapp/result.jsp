<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator Result</title>
</head>
<body style="text-align:center;">
    <h1>Calculator Result:</h1>
    <h2>${CalForm.val1} ${CalForm.parameter} ${CalForm.val2} = ${CalForm.result}</h2>
    <p>Result: ${CalForm.result}</p>
    
    <p><a href="calculator.jsp">Go Back</a></p>
</body>
</html>
