<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width , initial-scale=1.0">
        <link rel="stylesheet" href="estilos\estilo1.css">       
        <link rel="stylesheet" href="estilos\iniSesion.css">
    </head>
    <body>
       <div class="contenedor1">
        <header> 
            <div class="capalogo">
            <img class="logo" src="images\Roca.jpg" alt="logo">
            <h1>La Roca Polarizados</h1>  
            </div> 
            <div>Bienvenido Señor:</div>
        </header>
        <div class="barra"></div>
        <div class="contlogin">
        <img src="images/login.png" alt="login">
        <form action="validar" method="post">
             <label for="usuario">USUARIO</label>
             <input type="text" id="usuario" placeholder="usuario" name="usuario">
             <label for="clave" >CONTRASEÑA</label>
             <input type="password" id="clave" placeholder="clave" name="clave">
             <input type="submit" value="INGRESAR" class="boton" name="accion">
        </form>
        </div>
       <div class="contenedorbrillo">
            <div class="brillo"></div>
        <footer class="piecito">
            Derechos reservedos by DagaSoft
        </footer>            
        </div>
        </div>
    </body>
</html>