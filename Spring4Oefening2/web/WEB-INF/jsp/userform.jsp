<%-- 
    Document   : userform
    Created on : Oct 24, 2019, 11:29:52 AM
    Author     : Danny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration page</title>
    </head>
    <body>
        <form:form method="POST" commandName="user">
        <table>
            <tr>
                <td>User Name: </td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><form:password path="password" /></td>
            </tr>
            <tr>
                <td>Confirm password: </td>
                <td><form:password path="confirmpassword" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit"></td>
            </tr>
        </table>
        </form:form>        
    </body>
</html>
