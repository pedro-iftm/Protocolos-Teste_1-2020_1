<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Homescreen</title>
</head>
<body>
  <% String name = (String)(request.getAttribute("name")); %>

  <div align="center">
    <h1>Bom dia  <%= name %> !</h1>
    <br>
    <h3>Você está cadastrado em nosso sistema. </h3>
  </div>
  
  <form action="index.jsp" method="GET">
    <div align="center">
      <input type="submit" value="VOLTAR">
    </div>
  </form>
</body>
</html>
