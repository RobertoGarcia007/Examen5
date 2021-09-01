<%-- 
    Document   : listadoMotor
    Created on : 09-ago-2021, 23:58:32
    Author     : yo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado Motor</title>
               <!-- CSS only -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

                <!-- JavaScript Bundle with Popper -->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>

    </head>
    <body>
        <h1 align="center">MOTORLAND</h1>
        
        <div class="row">
            <div class="col-6 offset-3">
        <a href="formMotor.htm" class="btn btn-primary">Nueva Motor</a>        
        <table class="table table-striped">
            <thead class="thead-dark">
            <tr>
                <th>Modelo</th>
                <th>Fabricante</th>
                <th>Potencia</th>
                <th>Peso</th>
                <th>Cantidad</th>
                <th>Optimo</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${motores}" var="motores">
            <tr>
                <td><c:out value="${motores.modelo}"/></td>
                <td><c:out value="${motores.fabricante}"/></td>
                <td><c:out value="${motores.potencia}"/></td>
                <td><c:out value="${motores.peso}"/></td>
                <td><c:out value="${motores.cantidad}"/></td>
                <c:set var="potencia" value="${motores.potencia}"/>  
                <c:set var="peso" value="${motores.peso}"/> 
                <c:if test="${potencia/peso<10}">
                <td>si</td>
                </c:if>
                <c:if test="${potencia/peso>10}">
                <td>no</td>
                </c:if>
            </tr>
            </c:forEach>
            </tbody>
        </table>
                </div>
        </div>    
    </body>
</html>
