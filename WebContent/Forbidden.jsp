<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Forbidden</title>
</head>
<body>
    <% 
      String names = (String)(request.getAttribute("names"));
      int counter = (Integer)(request.getAttribute("counter"));
   	  int[] accesses = new int[20];

   	  if(request.getAttribute("accesses") != null){
       	for(int iterator = 0; iterator < counter; iterator++){
     		  accesses[iterator] = (int)(request.getAttribute("accesses"));
       	}
   	  }
   	  
      String attempts[];

      for(int iterator = 0; iterator < names.lenght(); iterator++) {
        if(names.charAt(i) == ';') {
          break;
        }
      }

      if(i!=names.length()) {
        attempts = names.split(";");
      } else {
        attempts = new String[1];
        attempts[0] = names;
      }
    %>
    <table border="1" cellpadding="10" align="center">
      <tr>
        <th>Usuários Inválidos</th>
        <th>ACESSOS</th>               
      </tr>           
    </table> 
            
    <form action="index.jsp" method="GET">
      <div align="center">
        <input type="submit" value="VOLTAR">
      </div>
    </form>
</body>
</html>
