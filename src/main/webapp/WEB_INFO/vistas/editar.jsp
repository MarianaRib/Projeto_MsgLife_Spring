<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar valores mortalidade</title>
</head>
<body><h1>Editar valores mortalidade</h1>  
       <form:form method="POST" action="/paginaprincipal/editar">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <tr>    
          <td>País : </td>   
          <td><form:input path="pais"  /></td>  
         </tr>    
         <tr>    
          <td>Taxa Feminina :</td>    
          <td><form:input path="txfeminino" /></td>  
         </tr>   
         <tr>    
          <td>Taxa Masculina :</td>    
          <td><form:input path="txmasculino" /></td>  
         </tr>   
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    