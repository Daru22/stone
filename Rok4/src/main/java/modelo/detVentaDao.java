
package modelo;

import config.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class detVentaDao {
    Conector cn = new Conector();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int rpta;    
    public int guardar(detVenta prod){
        
    String sql="INSERT INTO detalleventa (idProducto,cantidad,precioUnitario,importe,descuento) values (?,?,?,?,?)";
            try {
            con= cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, prod.getIdProducto());
            ps.setInt(2, prod.getCantidad());
            ps.setFloat(3, prod.getPrecioUnit());
            ps.setFloat(4, prod.getImporte());
            ps.setFloat(5, prod.getDescuento());
            ps.executeUpdate();
            rpta=1;
        } catch (SQLException e) {
            e.printStackTrace();
            rpta=0;
        }
    return rpta;
    }
}
