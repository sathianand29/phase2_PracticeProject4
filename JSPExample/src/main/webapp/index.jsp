<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="ProductServlet">
Enter ID: <input type="text" name="id" required><br/>
Enter name: <input type="text" name="name" required><br/>
Enter price: <input type="text" name="price" required><br/>
<input type="submit" value="save">

</form>
</body>
</html>