<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="DiscountServlet" method="post">
  <label>Product Description: </label><br/>
  <input type="text" name="ProductDescription" placeholder="Enter your word: "/><br/>

  <label>List Price: </label><br/>
  <input type="text" name="ListPrice" placeholder="Enter your number: "/><br/>

  <label>Discount Percent: </label><br/>
  <input type="text" name="DiscountPercent" placeholder="Enter your number: "/><br/>

  <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>