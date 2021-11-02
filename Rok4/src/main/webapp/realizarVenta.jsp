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
        <strong>BUSCAR PRODUCTO</strong>
        <form action="cVenta" method="post"autocomplete="off">
        <div class="parForm">
          <label>PRODUCTO</label>
            <div class=" autocomplete">
            <input class="tbox22" type="text" name="txtNombre" id="tbox22">
            </div>         
        </div>            
            <input  type="hidden" name="hiddId" id="txtId">
            <div class="parForm">
                <label>PRECIO UNITARIO</label><input class="tboxro" type="text" id="txtPrecio" name="txtPrecio" readonly="readonly">
        </div>         
                <input type="submit" class="boton" value="AGREGAR" name="btnGuardar">    
        </form>
        <strong>DETALLE DE LA VENTA</strong>
        <form>
            <div class="tabla">
            <table>
                <tr>
                    <th>ITEM</th>
                    <th>DESCRIPCION</th>
                    <th>CANTIDAD</th>
                    <th>PRECIO U.</th>
                    <th>TOTAL</th>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>   
            </div>
            <div class="parForm">
                <input type="submit" class="boton" value="GUARDAR" name="btnGuardar">
                <input type="button" class="boton" value="DESCUENTO" name="btnDescuento">
            </div>
             <label>${respuesta}</label>
        </form>
        
        </div>
                <script type="text/javascript" src="JS\rVentas.js"></script>
    </body>
</html>
