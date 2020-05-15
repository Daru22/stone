/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Master-D
 */
public class tienda {
    int idTienda;
    String nombreTienda;
    String ruc;
    String razonSocial;

    public tienda() {
    }

    public tienda(int idTienda, String nombreTienda, String ruc, String razonSocial) {
        this.idTienda = idTienda;
        this.nombreTienda = nombreTienda;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
}
