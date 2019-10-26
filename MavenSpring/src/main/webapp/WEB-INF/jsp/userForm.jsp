<%-- 
    Document   : userForm
    Created on : Oct 23, 2019, 8:32:48 PM
    Author     : Danny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Registration Page</title>
</head>
<body>
<form:form method="POST" modelAttribute="user" commandName="user">
<table>
    <tr>
        <td>User Name :</td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:password path="password" /></td>
        <td colspan="2">
            <form:errors path="password" />
        </td>
    </tr>
    <tr>
        <td>Gender :</td>
        <td>
            <form:radiobutton path="gender" value="M" label="M" /> 
            <form:radiobutton path="gender" value="F" label="F" />
            <form:radiobutton path="gender" value="O" label="Other" />            
            <form:radiobutton path="gender" value="N" label="Prefer not to answer" />
        </td>
    </tr>
    <tr>
        <td>Country :</td>
        <td>
        <form:select path="country">
            <form:option value="0" label="Select" />
            <form:option value="1" label="India" />
            <form:option value="2" label="USA" />
            <form:option value="3" label="UK" />
        </form:select></td>
    </tr>
    <tr>
        <td>About you :</td>
        <td><form:textarea path="aboutYou" /></td>
    </tr>
    <tr>
        <td>Community :</td>
        <td>
            <form:checkbox path="community" value="Spring" label="Spring" /> 
            <form:checkbox path="community" value="Hibernate" label="Hibernate" /> 
            <form:checkbox path="community" value="Struts" label="Struts" />
        </td>
    </tr>
    <tr>
        <td></td>
        <td>
        <form:checkbox path="mailingList" label="Would you like to join our mailinglist?" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit"></td>
    </tr>
</table>
</form:form>

</body>
</html>