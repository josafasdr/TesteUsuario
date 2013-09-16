<%-- 
    Document   : form-tipo-usuario
    Created on : 16/09/2013, 14:10:27
    Author     : Josafá
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Formulário Tipo de Usuario</title>
    </head>
    <body>
        <h3>Cadastrar Tipo de Usuario</h3>
        <form action="insereTipoUsuario" method="GET">
            Nome: <input type="text" name="nomeTipoUsuario" />
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
