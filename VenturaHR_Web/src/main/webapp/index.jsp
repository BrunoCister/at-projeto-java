<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>titulo da aba</title>
    </head>
    <body>
        <h1>titulo da pagina</h1>
        <form action="login" method="post">
            <label>email</label>
            <input type="text" name="email" size="30" maxlength="30" />
            <label>senha</label>
            <input type="password" name="senha" size="32" maxlength="32" />
            <input type="submit" value="login" />
            <input type="button" value="criar conta" onclick="location.href='usuario/manter.jsp'" />
        </form>
        <h4 style="color: red">${erro}</h4>
    </body>
</html>