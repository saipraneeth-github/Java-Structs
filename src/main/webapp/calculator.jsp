<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body style="text-align:center;">
    <form action="calculator.do" method="post">
    <h1>Calculator</h1>
        <div> Enter value1: <input type="number" name="val1" placeholder="0" required></div><br>
        <div>Enter value2: <input type="number" name="val2" placeholder="0" required></div><br>
        <button type="submit" name="method" value="add">Add</button>
        <button type="submit" name="method" value="sub">Subtract</button>
        <button type="submit" name="method" value="mul">Multiply</button>
        <button type="submit" name="method" value="div">Divide</button>
    </form>
</body>
</html>
