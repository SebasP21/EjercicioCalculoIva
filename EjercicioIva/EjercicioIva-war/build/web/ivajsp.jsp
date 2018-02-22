<%-- 
    Document   : ivajsp
    Created on : 19/02/2018, 01:11:16 PM
    Author     : super
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <form action="ivaServlet" method="POST">
            <input type="text" name="t1">
            <input type="text" name="t2">
            <input type="submit" value="Calcular iva">
        </form>  
    </body>
</html>
