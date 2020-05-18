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
        <strong>REGISTRAR PRODUCTO</strong>
        <form action="controladorProd" method="post">
            <div class="parForm">
            <label>NOMBRE</label><input class="tbox" type="text" name="txtNombre">
            </div>
            <div class="parForm">
            <label>DESCRIPCION</label><input class="tbox" type="text" name="txtDescripcion">
            </div>
            <div class="parForm">
            <label>CODIGO</label><input class="tbox" type="text" name="txtCodigoBarras">
            </div>
            <div class="parForm">
            <label>VENCIMIENTO</label><input class="tbox" type="date" min="2020-01-01" name="dteFechaVenc">
            </div>
            <div class="parForm">
            <label>PROVEEDOR</label><select class="tbox"  name="cboProveedor">
            <c:forEach var="prov" items="${listaProv}">
                <option value="${prov.getIdProveedor()}">${prov.getRazonSocial()}</option>
            </c:forEach>
            </select>
            </div>
            <div class="parForm">
            <label>SECCION</label><select class="tbox" name="cboSeccion">
                 <c:forEach var="prov" items="${listaSec}">
                <option value="${prov.getIdSeccion()}">${prov.getNombreSeccion()}</option>
            </c:forEach>
            </select>
            </div>
            <div class="parForm">
            <label>MEDIDA</label><select class="tbox"  name="cboUnidadMedida">
                 <c:forEach var="prov" items="${listaUniMedi}">
                <option value="${prov.getIdUniMedida()}">${prov.getNombrwMedida()}</option>
            </c:forEach>
            </select>
            </div>
            <div class="parForm">
            <label>MARCAS</label><select class="tbox"  name="cboMarcas">
                 <c:forEach var="prov" items="${listaMarc}">
                <option value="${prov.getIdMarcas()}">${prov.getNombreMarca()}</option>
            </c:forEach>
            </select>
            </div>
            <div class="parForm">
            <label>TIPO</label><select class="tbox"  name="cboTipo">
                 <c:forEach var="prov" items="${listaTipo}">
                <option value="${prov.getIdTipo()}">${prov.getNombreTipo()}</option>
            </c:forEach>
            </select>
            </div>
            <div class="parForm">
            <label>MARGEN</label><select class="tbox"  name="cboMargen">
                 <c:forEach var="prov" items="${listaMarg}">
                <option value="${prov.getIdMargen()}">${prov.getNombreMargen()}</option>
            </c:forEach>
            </select>
            </div>
            <div class="parForm">
                </div>
            <div class="parForm">
            <input type="submit" class="boton" value="GUARDAR" name="guardarProducto">
            </div>
            <div class="parForm">
        </form>
        <label>${respuesta}</label>
        </div>
    </body>
</html>
