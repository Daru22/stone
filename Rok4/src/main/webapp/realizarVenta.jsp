<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Intranet</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="estilos\registros.css" >    
    </head>
    <body>
        <div class="ContProd">
        <strong>REALIZAR VENTA</strong>
        <form autocomplete="off">
            <div class="parForm">
        <label>PRODUCTO</label>
           <div class=" autocomplete"><input class="tbox22" type="text" name="txtNombre" id="tbox22"></div>
                <input  type="hidden" name="hiddId" id="hid22">
                <c:forEach var="produs" items="${listaProd}">
                        <input type="hidden" class="item"id="${produs.getId()}" value="${produs.getNombre()}">
                </c:forEach>   
        </div>
            
            <div class="parForm">
        <label>PRECIO UNITARIO</label><input class="tbox" type="text">
        </div>
                <div class="parForm">
        <label>CANTIDAD</label><input class="tbox" type="text">
        </div>
            <div class="parForm">
        <label>IMPORTE</label><input class="tbox" type="text">
        </div>
            <div class="parForm">
        <label>DESCUENTO</label><input class="tbox" type="text">
        </div>
            <div class="parForm">
        <input type="button" class="boton" value="ENVIAR">
        </div>
        </form>
        </div>
                <script type="text/javascript" src="JS\Autocompletar.js"></script>
    </body>
</html>
