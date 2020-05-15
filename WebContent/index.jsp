<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Accesses</title>
  </head>
  <body OnLoad="document.form.name.focus();">
    <div align="center">
      <h1>Request Servlet!</h1>            
    </div>

    <br>        
    <form name="form" action="LoginHandler" method="POST">
      <div>
        <p>Login:<p>
        <input type="text" name="name">                
      </div>

      <br>
      <div>
        <p>Senha:<p>
        <input type="text" name="password">                
      </div>                      

      <br>
      <div align="center">
        <input type="submit" value="OK">                
      </div>
      <br>            
    </form>            
  </body>
</html>
