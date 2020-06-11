package modelo;

import java.sql.Date;

public class detVenta {
int idDetVenta;
int idProducto;
int cantidad;
float precioUnit;
float Importe;
float Descuento;

    public detVenta() {
    }

    public detVenta(int idDetVenta, int idProducto, int cantidad, float precioUnit, float Importe, float Descuento) {
        this.idDetVenta = idDetVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnit = precioUnit;
        this.Importe = Importe;
        this.Descuento = Descuento;
    }

    public int getIdDetVenta() {
        return idDetVenta;
    }

    public void setIdDetVenta(int idDetVenta) {
        this.idDetVenta = idDetVenta;
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

    public float getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(float precioUnit) {
        this.precioUnit = precioUnit;
    }

    public float getImporte() {
        return Importe;
    }

    public void setImporte(float Importe) {
        this.Importe = Importe;
    }

    public float getDescuento() {
        return Descuento;
    }

    public void setDescuento(float Descuento) {
        this.Descuento = Descuento;
    }

}
