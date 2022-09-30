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
        <h1>titulo da pagina de criar conta usuario</h1>
        <form action="criarConta" method="post">
            <label>nome</label>
            <input type="text" name="nome" size="50" maxlength="50" value="${usuario.nome}" /> <br />
            <label>endereço</label>
            <input type="text" name="endereco" size="100" maxlength="100" value="${usuario.endereco}" /> <br />
            <label>telefone</label>
            <input type="number" name="telefone" size="20" maxlength="20" value="${usuario.telefone}" /> <br />
            <label>email</label>
            <input type="email" name="email" size="30" maxlength="30" value="${usuario.email}" /> <br />
            <label>senha</label>
            <input type="password" name="senha" size="32" maxlength="32" value="${usuario.senha}" /> <br />
            <label>cpf</label>
            <input type="text" name="cpf" size="11" maxlength="11" value="${usuario.cpf}" /> <br />
            <label>tipo da conta</label>
            <input type="radio" name="tipo" value="E" /> Empresa
            <input type="radio" name="tipo" value="C" /> Candidato <br />
            <label>razao social</label>
            <input type="text" name="razaosocial" size="50" maxlength="50" value="${usuario.razaosocial}" /> <br />
            <label>cnpj</label>
            <input type="text" name="cnpj" size="14" maxlength="14" value="${usuario.cnpj}" /> <br />
            <input type="submit" value="Criar Conta" />
        </form>
        <div style="color: red">
            <c:forEach var="erro" items="${erros}">
                <h3>${erro.defaultMessage}</h3>
            </c:forEach>
        </div>
    </body>    
</html>