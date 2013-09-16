<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : lista
    Created on : 16/09/2013, 14:17:01
    Author     : Josafá
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Lista Tipos de Usuario</title>
    </head>
    <body>
        <h3>Lista de Tipos de Usuario</h3>
        
        <table border="1">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Nome</th>
                </tr>
            </thead>
            <tbody
                <tr>
                    <c:forEach var="tipoUusuario" items="${tiposUusuario}">
                        <td>${tipoUsuario.codigo}</td>
                        <td>${tipoUsuario.nomeTipoUsuario}</td>
                    </c:forEach>

                </tr>
            </tbody>
        </table>

    </body>
</html>
