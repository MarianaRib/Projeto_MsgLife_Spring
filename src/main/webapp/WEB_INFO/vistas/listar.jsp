  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Lista Mortalidade por ano</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Pais</th><th>TaxaFeminino</th><th>TaxaMasculino</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="m2016" items="${list}">   
   <tr>  
   <td>${m2016.id}</td>  
   <td>${m2016.pais}</td>  
   <td>${m2016.txfeminino}</td>  
   <td>${m2016.txmasculino}</td>  
   <td><a href="editm2016/${m2016.id}">Edit</a></td>  
   <td><a href="deletem2016/${m2016.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="empform">Adicionar nova taxa</a>  