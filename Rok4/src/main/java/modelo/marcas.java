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
public class marcas {
    int idMarcas;
    String nombreMarca;
    String otros;

    public marcas() {
    }

    public marcas(int idMarcas, String nombreMarca, String otros) {
        this.idMarcas = idMarcas;
        this.nombreMarca = nombreMarca;
        this.otros = otros;
    }

    public int getIdMarcas() {
        return idMarcas;
    }

    public void setIdMarcas(int idMarcas) {
        this.idMarcas = idMarcas;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }
    
    
}
