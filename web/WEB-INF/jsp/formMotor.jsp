<%-- 
    Document   : altaMotor
    Cron : 06-ago-2021, 13:22:33
    Author     : yo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>ALTA MOTOR</title>
        
        <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>


    </head>
    <body>
        <div class="row">
            <div class="col-6 offset-3"> 
        <form:form method="post" commandName="m">
            <form:errors path="*" element="div class='alert alert-danger'">
                
            </form:errors>
            <h1>Alta Motor</h1>
            <form:label path="modelo">Modelo</form:label>
            <form:input path="modelo" cssClass="form-control" /> 
            <form:label path="fabricante">Fabricante</form:label>
            <form:input path="fabricante" cssClass="form-control"/>
     
            <form:label path="potencia">Potencia</form:label>
            <form:input path="potencia" cssClass="form-control"/>
            <form:label path="peso">Peso</form:label>
            <form:input path="peso" cssClass="form-control"/>
            
            <form:label path="cantidad" >Cantidad</form:label>
            <form:input path="cantidad" cssClass="form-control"/>
  
            <form:button class="btn btn-primary">Alta Motor</form:button>
            <a href="listadoMotor.htm" class="btn btn-danger">Cancelar</a>
                
        </form:form>
            </div>
        </div>
    </body>
</html>
