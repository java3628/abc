<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>User Information</h2>
<form:form method="POST" action="/WebSpring/user/addUser">
   <table>
    <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td><form:label path="age">Age</form:label></td>
        <td><form:input path="age" /></td>
    </tr>
    <tr>
        <td><form:label path="address">Address</form:label></td>
        <td><form:input path="address" /></td>
    </tr>
     <tr>
        <td><form:label path="city">City</form:label></td>
        <td><form:input path="city" /></td>
    </tr>
    <tr>
        <td><form:label path="state">State</form:label></td>
        <td><form:input path="state" /></td>
    </tr>
    <tr>
        <td><form:label path="zip">Zip</form:label></td>
        <td><form:input path="zip" /></td>
    </tr>
    
    
    
    <tr>
       
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>