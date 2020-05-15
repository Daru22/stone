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
public class unidadMedida {
    int idUniMedida;
    String nombrwMedida;
    String otros;

    public unidadMedida() {
    }

    public unidadMedida(int idUniMedida, String nombrwMedida, String otros) {
        this.idUniMedida = idUniMedida;
        this.nombrwMedida = nombrwMedida;
        this.otros = otros;
    }

    public int getIdUniMedida() {
        return idUniMedida;
    }

    public void setIdUniMedida(int idUniMedida) {
        this.idUniMedida = idUniMedida;
    }

    public String getNombrwMedida() {
        return nombrwMedida;
    }

    public void setNombrwMedida(String nombrwMedida) {
        this.nombrwMedida = nombrwMedida;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }
    
    
}
