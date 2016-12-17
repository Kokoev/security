<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<body>

<form:form method="POST" commandName="student" action="editStudent" class="box Edit">



    <form:label path="login">Login:</form:label>
    <form:input path="login" />
    <%--<form:errors path="login" cssClass="error"/>--%>

<br>
    <form:label path="password">Password:</form:label>
    <form:password path="password" />
    <%--<form:errors path="password" cssClass="error"/>--%>
<br>
    <form:label path="age">Age:</form:label>
    <form:input path="age" />
<br>
    Пол:
    <br><input type="radio" name="gender" value="M">Мужчина</input><br>
    <input type="radio" name="gender" value="W">Женьщина</input>
<br>
    <form:label path="school">school:</form:label>
    <form:input path="school" />

    <footer>
        <input type="submit" class="btnEdit" value="Edit" tabindex="4">
    </footer>

</form:form>

</body>
</html>