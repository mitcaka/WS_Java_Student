<%-- 
    Document   : sua
    Created on : Dec 2, 2023, 4:06:30 AM
    Author     : ADMIN
--%>

<%@page import="webservice.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sua thong tin sinh vien</h1>
        <form action="ConfirmEditCustomer" method="get">
            <%Student std = (Student) request.getAttribute("std"); %>
            <input type="hidden" name="txtRollNo" value="<%=std.getRollno()%>">
            <br/> Tên : <input type="text" name="txtName" placeholder="Nhập tên" value="<%=std.getName()%>"> <br/> <br/>            
            <br/> Email : <input type="text" name="txtEmail" placeholder="Nhập email" value="<%=std.getEmail()%>"> <br/> <br/>            
            <br/> Tuổi : <input type="text" name="txtAge" placeholder="Nhập tuổi" value="<%=std.getAge()%>"> <br/> <br/>
            <input type="submit" value="OK">
        </form> 
    </body>
</html>
