<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ecommerce de ebooks</title>
    </head>
    <body>
        <h1>Livros</h1>
        <table>
            <tr>
                <th>Nome</th>
                <th>Autor(a)</th>
                <th>Descrição</th>
                <th>Categoria</th>
                <th>Preço</th>
                <th>Comprar</th>
            </tr>
            <c:forEach var="livro" items="${livros}">
            <c:url var="url" value="venda.htm">
                <c:param name="livro" value="${livro.getId()}" />
            </c:url>
            <tr>
                <td><c:out value="${livro.getNome()}"></c:out></td>
                <td><c:out value="${livro.getAutor()}"></c:out></td>
                <td><c:out value="${livro.getDescricao()}"></c:out></td>
                <td><c:out value="${livro.getCategoria()}"></c:out></td>
                <td><c:out value="${livro.getValor()}"></c:out></td>
                <td><a href="${url}">Comprar</a></td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
