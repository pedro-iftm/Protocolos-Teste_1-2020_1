<%-- 
    Document   : Validado2
    Created on : 07/05/2020, 17:22:41
    Author     : Clarimundo
--%>

<%@page import="Controller.Usuario"%>
<%@page isELIgnored ="false" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <table>
             
             <tr>
                 <th>Acessos Errados</th>
             </tr>
             <c:forEach var="item" items="${listaUsuario}">
                <tr>	
                    <td>
                       <c:out value="${item.login}"/>
                    </td>
                    <td>
                        <!--${item.qntAcessos}-->
                    </td>
		</tr>
            </c:forEach>
             
         </table>
             
             
         <form action="index.jsp" method="GET">
            <div align="center">
                <input type="submit" value="VOLTAR">
            </div>
         </form>
     </body> 
</html>
