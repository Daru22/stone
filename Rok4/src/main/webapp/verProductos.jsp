
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="estilos\registros.css" > 
    </head>
    <body>
        <div class="ContProd">
        <strong>VER PRODUCTOS</strong>       
        <form action="cIngresoCompra" method="post" autocomplete="off" >
              <div class="parForm">
                <label>Prod</label>
                <div class=" autocomplete"><input class="tbox" type="text" id="tbox22"></div>
                <input type="hidden" id="txtId">
        </div>
            <div class="parForm">
                <label>PRECIO</label><input class="tbox" type="text" id="txtPrecio" readonly>
        </div>
            <div class="parForm">
                <label>STOCK</label><input class="tbox" type="text" id="txtStock" readonly >
        </div>
            <div class="parForm">
                <input type="submit" class="boton" value="VER" name="btnRegistrar" id="btnf">
        </div>
        </form>
        <label></label>
        </div>
         <script type="text/javascript" src="JS\CargarProd.js"></script>
    </body>
</html>
