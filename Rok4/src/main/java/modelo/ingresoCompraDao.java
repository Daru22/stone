/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Master-D
 */
public class ingresoCompraDao {
    Conector cn = new Conector();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int rpta;    
    public int guardar(ingresoCompra prod){
        
    String sql="INSERT INTO ingresocompra (idProducto,cantidad,precio,fecha,documento,comentario) values (?,?,?,?,?,?)";
            try {
            con= cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, prod.getIdProducto());
            ps.setInt(2, prod.getCantidad());
            ps.setFloat(3, prod.getPrecio());
            ps.setDate(4,prod.getFecha());
            ps.setString(5, prod.getDocumento());
            ps.setString(6, prod.getComentario());
            ps.executeUpdate();
            rpta=1;
        } catch (SQLException e) {
            e.printStackTrace();
            rpta=0;
        }
    return rpta;
    }
    
}
