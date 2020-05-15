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
public class margen {
    int idMargen;
    String nombreMargen;
    float valor;
    String otros;

    public margen() {
    }

    public margen(int idMargen, String nombreMargen, float valor, String otros) {
        this.idMargen = idMargen;
        this.nombreMargen = nombreMargen;
        this.valor = valor;
        this.otros = otros;
    }

    public int getIdMargen() {
        return idMargen;
    }

    public void setIdMargen(int idMargen) {
        this.idMargen = idMargen;
    }

    public String getNombreMargen() {
        return nombreMargen;
    }

    public void setNombreMargen(String nombreMargen) {
        this.nombreMargen = nombreMargen;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }
    
    
    
}
