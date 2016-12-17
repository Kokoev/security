<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<html>
<head>

</head>

<body>
<c:if test="${not empty error}">
    ${error}
</c:if>
    <form name="form_login" action="/login" method="POST">
        <table>
            <tr>
                <td>User:</td>
                <td><input type="text" name="login_login" value=" "></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="text" name="password_login" value=" "></td>
            </tr>
            <tr>
                <td><input type="submit" name="submit" value="submit"></td>
            </tr>

        </table>
    </form>

</body>
</html>







<%--<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>--%>

<%--<html>--%>

<%--<body>--%>

<%--<form:form method="POST" commandName="user" action="check-user" class="box login">--%>



        <%--<form:label path="login">Login:</form:label>--%>
        <%--<form:input path="login" />--%>
        <%--&lt;%&ndash;<form:errors path="login" cssClass="error"/>&ndash;%&gt;--%>


        <%--<form:label path="password">Password:</form:label>--%>
        <%--<form:password path="password" />--%>
        <%--&lt;%&ndash;<form:errors path="password" cssClass="error"/>&ndash;%&gt;--%>

    <%--<footer>--%>
        <%--<br>--%>
        <%--<input type="submit" class="btnLogin" value="Login" tabindex="4">--%>
    <%--</footer>--%>

<%--</form:form>--%>

<%--<form:form method="get" commandName="user" action="student" class="box reg">--%>

    <%--<footer>--%>
        <%--<input type="submit" class="btnReg" value="Registration" tabindex="4">--%>
    <%--</footer>--%>

<%--</form:form>--%>
<%--</body>--%>
<%--</html>--%>