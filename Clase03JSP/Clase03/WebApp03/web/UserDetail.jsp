<%-- 
    Document   : UserDetail
    Created on : 29/09/2018, 11:49:30 AM
    Author     : Administrador
--%>

<%@page import="Models.UserModel"%>
<%@page import="Repository.UserRepository"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuario Seleccionado</h1>
        <%
            int codigoUsuario = Integer.parseInt(request.getParameter("codigo"));
            UserRepository userRepo = new UserRepository(); 
            UserModel usuarioSeleccionado = userRepo.GetUserById(codigoUsuario);
        %>
        
        <label>Codigo:</label> 
        <input readonly="readonly" type="text" value="<%= usuarioSeleccionado.getUserId() %>"  />
        <label>Nombre usuario:</label> 
        <input type="text" value="<%= usuarioSeleccionado.getUserName()%>"  />
        <label>Password:</label> 
        <input type="password" value="<%= usuarioSeleccionado.getUserPassword()%>"  />        
        
        <button>Editar</button>
    </body>
</html>
