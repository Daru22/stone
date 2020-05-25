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
        <strong>INGRESAR COMPRA</strong>       
        <form action="cIngresoCompra" method="post" autocomplete="off" >
            <div class="autocomplete">
                <label>NOMBRE</label><input class="tbox" type="text" name="txtNombre" id="tbox22">
                <input  type="hidden" name="hiddId" id="hid22">
                <c:forEach var="produs" items="${listaProd}">
                        <input type="hidden" class="item"id="${produs.getId()}" value="${produs.getNombre()}">
                </c:forEach>              
            </div>
            <div class="parForm">
                <label>CANTIDAD</label><input class="tbox" type="text" name="txtCantidad">
        </div>
            <div class="parForm">
                <label>PRECIO COMPRA</label><input class="tbox" type="text" name="txtPrecio">
        </div>
            <div class="parForm">
        <label>FECHA</label><input class="tbox" type="date" min="2020-01-01" name="dteIngresoC">
        </div>
             <div class="parForm">
                 <label>DOCUMENTO</label><input class="tbox" type="text" name="txtDocumento">
            </div>
            <div class="parForm">
                <label>COMENTARIO</label><input class="tbox" type="text" name="txtComentario">
        </div>
            <div class="parForm">
                <input type="submit" class="boton" value="GUARDAR" name="btnRegistrar">
        </div>
        </form>
        <label>${respuesta}</label>
        </div>
         <script type="text/javascript" src="JS\Autocompletar.js"></script>
    </body
</html>

