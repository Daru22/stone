
package modelo;

import java.sql.Date;

public class producto {
int id;
String nombre;
String descripcion;
String codigoBarras;
Date fechaVencimiento;
int idProveedor;
int idSeccion;
int idUniMedida;
int idMarcas;
int idTipo;
int idTienda;
int idMargen;
int stock;
float precio;

    public producto() {
    }

    public producto(int id, String nombre, String descripcion, String codigoBarras, Date fechaVencimiento, int idProveedor, int idSeccion, int idUniMedida, int idMarcas, int idTipo, int idTienda, int idMargen, int stock, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigoBarras = codigoBarras;
        this.fechaVencimiento = fechaVencimiento;
        this.idProveedor = idProveedor;
        this.idSeccion = idSeccion;
        this.idUniMedida = idUniMedida;
        this.idMarcas = idMarcas;
        this.idTipo = idTipo;
        this.idTienda = idTienda;
        this.idMargen = idMargen;
        this.stock = stock;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(int idSeccion) {
        this.idSeccion = idSeccion;
    }

    public int getIdUniMedida() {
        return idUniMedida;
    }

    public void setIdUniMedida(int idUniMedida) {
        this.idUniMedida = idUniMedida;
    }

    public int getIdMarcas() {
        return idMarcas;
    }

    public void setIdMarcas(int idMarcas) {
        this.idMarcas = idMarcas;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public int getIdMargen() {
        return idMargen;
    }

    public void setIdMargen(int idMargen) {
        this.idMargen = idMargen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
}