<%-- 
    Document   : hienthi
    Created on : Dec 1, 2023, 8:08:28 PM
    Author     : ADMIN
--%>
<%@page import="java.util.List"%>
<%@page import="webservice.StudentWS_Service"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table, th, td {
                border: 1px solid;
                padding: 5px;
              }
              
              a:link, a:visited {
                background-color: #f44336;
                color: white;
                padding: 10px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                margin-right: 20px;
              }

              a:hover, a:active {
                background-color: red;
              }
        </style>
    </head>
    <body>
        <h1>ListStudent</h1>
        <c:set var="ls" value="${requestScope.lstStd}" />
        <a href="them.jsp">Thêm mới</a>
        <table>
            <tr style="font-weight: bold">
                <td>Rollno</td>               
                <td>Student Name</td>
                <td>Email</td>
                <td>Age</td>               
                <td>Action</td>
            </tr>  
            <c:forEach items="${ls}" var="n">
                <tr>
                    <td>${n.getRollno()}</td>                
                    <td>${n.getName()}</td>
                    <td>${n.getEmail()}</td>
                    <td>${n.getAge()}</td>                
                    <!--tạo url truyền id đến servlet--> 
                    <td><a href="EditStudent?id=${n.getRollno()}">Sửa</a><a href="DeleteStudent?id=${n.getRollno()}">Xóa</a></td> 
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
