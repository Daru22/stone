<!DOCTYPE html>
<html>
    <head>
        <title>Polarizados</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <meta name="keywords" content="polarizados,Stickers,Accesorios">
        <link rel="stylesheet" href="estilos\estilo1.css" >
        <link rel="stylesheet" href="estilos\Intranet.css" >
    </head>
    <body>
        <div class="contenedor1">
        <header> 
            <div class="capalogo">
            <img class="logo" src="images\Roca.jpg" alt="logo">
            <h1>${usuariox.getNom()}</h1>  
            </div>         
            <label for="checkmenu">
                    <img class="logomenu" src="images\menu.png" alt="menu">
            </label>
            <input id="checkmenu" type="checkbox">  
            <nav class="menu" id="nav">
               <ul>
                    <li class="menu1">PRODUCTOS</li>
                    <ul class="submenu1">
                        <li><a href="controladorListas" id="smproductos" name="smproductos" target="nframe1">Productos Nuevos</a></li>
                        <li><a href="verProductos.jsp" id="" name="smproductos1" target="nframe1">Ver Productos</a></li>
                        <li><a href="cIngresoCompra?accion=ingresarC" id="" name="smproductos2" target="nframe1">Guardar Compra</a></li>
                    </ul>
               </ul>
               <ul>
                    <li class="menu1">COSTOS</li>
                    <ul class="submenu1">
                        <li><a href="registrarCosto.jsp" id="smcostos" name="smcostos" target="nframe1">Costos</a></li>
                    </ul>
               </ul>
                    <ul>
                    <li class="menu1">VENTAS</li>
                    <ul class="submenu1">
                        <li><a href="realizarVenta.jsp" id="smventas" name="smventas" target="nframe1">Guardar Venta</a></li>
                    </ul>
               </ul>
                 <ul>
                    <li class="menu1">OTROS</li>
                    <ul class="submenu1">
                        <li><a href="agregarOtros.jsp" id="smotros" name="smotros" target="nframe1">Otros</a></li>
                    </ul>
               </ul>
                <ul>
                       <li class="menu0"><a href="validar?accion=salir" id="aotros">SALIR</a></li>
               </ul>
            </nav>
        </header>
        <div class="barra"></div>
        <div class="contenido">
            <iframe id="nframe1" frameborder="0" name="nframe1"></iframe>
        </div>
        <div class="contenedorbrillo">
            <div class="brillo"></div>
        <footer class="piecito">
            Intranet Creada por DagaSoft
        </footer>            
        </div>
</div>
        <script type="text/javascript" src="JS\intranet.js"></script>
    </body>
</html>
