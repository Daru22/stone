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
        <form action="cVenta" method="post"autocomplete="off">
            <div class="parForm">
        <label>PRODUCTO</label>
           <div class=" autocomplete"><input class="tbox22" type="text" name="txtNombre" id="tbox22"></div>
                <input  type="hidden" name="hiddId" id="txtId">  
        </div>            
            <div class="parForm">
                <label>PRECIO UNITARIO</label><input class="tbox" type="text" id="txtPrecio" name="txtPrecio">
        </div>
                <div class="parForm">
                    <label>CANTIDAD</label><input class="tbox" type="text" id="txtCantidad" name="txtCantidad">
        </div>
            <div class="parForm">
                <label>IMPORTE</label><input class="tbox" type="text" id="txtImporte" name="txtImporte" readonly>
        </div>
            <div class="parForm">
                <label>DESCUENTO</label><input class="tbox" type="text" id="txtDescuento" name="txtDescuento">
        </div> 
            <div class="parForm">
                <input type="submit" class="boton" value="GUARDAR" name="btnGuardar">
        </div>
        </form>
         <label>${respuesta}</label>
        </div>
                <script type="text/javascript" src="JS\rVentas.js"></script>
    </body>
</html>
