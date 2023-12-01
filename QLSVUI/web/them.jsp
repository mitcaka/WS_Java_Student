<%-- 
    Document   : them
    Created on : Dec 2, 2023, 3:47:03 AM
    Author     : ADMIN
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Student Form</title>
    </head>
    <body>
        <h1>Form nhập thông tin</h1>
        <form action="InsertStudent" method="get">
            <br/> Tên : <input type="text" name="txtName" placeholder="Nhập tên"> <br/> <br/>            
            <br/> Email : <input type="text" name="txtEmail" placeholder="Nhập email"> <br/> <br/>            
            <br/> Age : <input type="text" name="txtAge" placeholder="Nhập tuổi"> <br/> <br/>
            <br/> Mã SV : <input type="text" name="txtRollNo" placeholder="Nhập mã SV"> <br/> <br/>
            <input type="submit" value="OK">
        </form> 
    
    </body>
</html>
