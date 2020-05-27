<%-- 
    Document   : index
    Created on : 07/05/2020, 16:58:40
    Author     : Clarimundo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MOSTRA INVÁLIDOS</title>
    </head>
    <body OnLoad="document.form1.nome.focus();">
        
        <div align="center">
            <h1>MOSTRA USUÁRIOS INVÁLIDOS!</h1>            
        </div>
        <br>        
        <form name="form1" accept-charset="UTF-8" action="Invalidos" method="POST">
            <div>
                Usuário: <input type="text" name="nome">                
            </div>
            <br>
            <div>
                Senha: <input type="text" name="senha">                
            </div>                      
            <br>
            <div align="center">
                <input type="submit" value="OK">                
            </div>
            <br>            
        </form>            
    </body>
</html>
