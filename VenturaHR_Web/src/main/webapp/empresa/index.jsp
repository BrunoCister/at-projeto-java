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
        <h2>empresa ${usuario.nome}</h2>
        <div>
            <table>
                <thead>
                    <tr>
                        <th>cargo</th>
                        <th>cidade</th>
                        <th>forma de contratação</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="vaga" items="${publicadas}">
                        <tr>
                            <td>${vaga.cargo}</td>
                            <td>${vaga.cidade}</td>
                            <td>${vaga.formaContratacao}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
