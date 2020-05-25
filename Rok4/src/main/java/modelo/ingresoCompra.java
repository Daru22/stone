package modelo;

import java.sql.Date;

public class ingresoCompra {
int idIngresoCompra;
int idProducto;
int cantidad;
float precio;
Date fecha;
String documento;
String comentario;   

    public ingresoCompra() {
    }

    public ingresoCompra(int idIngresoCompra, int idProducto, int cantidad, float precio, Date fecha, String documento, String comentario) {
        this.idIngresoCompra = idIngresoCompra;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
        this.documento = documento;
        this.comentario = comentario;
    }

    public int getIdIngresoCompra() {
        return idIngresoCompra;
    }

    public void setIdIngresoCompra(int idIngresoCompra) {
        this.idIngresoCompra = idIngresoCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


}
