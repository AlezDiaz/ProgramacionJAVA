<%-- 
    Document   : UserCreate
    Created on : 06/10/2018, 09:25:38 AM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.jsp" %>

        <h1>Crear Usuario</h1>
        
        <form id="frmUserCreate" method="POST" action="UserCreate">
            
            <div class="row">
                <div class="col-md-4">
                    <label for="txtUsuario">Usuario:</label>
                    <input class="form-control" type="text" placeholder="Ingrese el nombre de usuario" 
                    id="txtUsuario" name="txtUsuario" /><!-- required: Valida que el campos sea requerido -->
                </div>
            </div>
               
            <div class="row">
                <div class="col-md-4">
                    <label>Password:</label>
                    <input class="form-control" type="password" placeholder="Ingrese el password de usuario" 
                    id="txtPassword" name="txtPassword" />
                </div>
            </div>

            <div class="row">
                <div class="col-md-12">
                    <input class="btn btn-primary" type="submit" value="Grabar" />
                    <input class="btn btn-success" type="button" id="btnGrabarAJAX" value="Grabar Ajax" />
                    <a class="btn btn-warning" href="UserList.jsp">Ir a Listado</a>
                </div>
            </div>
        </form>
        <script>

            $.validator.addMethod("pwcheck", function(value) {
               return /^[A-Za-z0-9\d=!\-@._*]*$/.test(value) // consists of only these
                   && /[a-z]/.test(value) // has a lowercase letter
                   && /\d/.test(value) // has a digit
            });

            $("#frmUserCreate").validate({
                rules: {
                    txtUsuario : {
                        required : true,
                        email : true
                    },
                    txtPassword :  {
                        required : true,
                        pwcheck : true
                    }
                },
                messages: {
                    txtUsuario : {
                        required : "Ingrese su usuario coorporativo"
                    },
                    txtPassword : {
                        pwcheck : "Ingrese un password considerando letras y números"
                    }
                }
            });
            
            $(document).ready(function(){
                //Esto se ejecuta cuando la pagina esta LISTA.
                $("#btnGrabarAJAX").click(function(){
  
                    var frm = $("#frmUserCreate");
                    if (!frm.valid()) {
                        return;
                    }
                    //Esto se ejecuta cuando alguien hace CLick en btnGrabarAJAX
                    if(confirm("¿Esta seguro que desea crear un Usuario?")){
                        var nombreUsuario = $("#txtUsuario").val();
                        var password = document.getElementById("txtPassword").value;
           
                        var url = "/WebApp03/UserCreateAjax?user=" + nombreUsuario + "&pass=" + password;
                        $.get(url, function(data) {
                            alert(data);
                        });
                    }
                });               
            });
        </script>
<%@include file="Footer.jsp" %>

