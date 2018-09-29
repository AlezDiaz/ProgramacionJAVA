<%-- 
    Document   : UserList
    Created on : 29/09/2018, 11:14:46 AM
    Author     : Administrador
--%>

<%@page import="Models.UserModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Repository.UserRepository"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            UserRepository userRepo = new UserRepository(); 
            ArrayList<UserModel> list = userRepo.GetListUsers();
        %>
        
        <table>
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Password</th>
                    <th>&nbsp;</th>
                </tr>
            </thead>
            <tbody>
                <% 
                for (int i = 0; i < list.size(); i++) {
                %>
                    <tr>
                        <td><%=list.get(i).getUserId()%></td>
                        <td><%=list.get(i).getUserName()%></td>
                        <td>******</td>
                        <td><a href="UserDetail.jsp?codigo=<%=list.get(i).getUserId()%>">Ver Detalle</a></td>
                    </tr>
                <%
                }
                %>
                
            </tbody>
        </table>
        
    </body>
</html>

