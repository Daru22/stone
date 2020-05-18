
package modelo;

import config.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class productoDao {
    
        Conector cn = new Conector();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
        int rpta;    
    public int guardar(producto prod){
        
    String sql="insert into productos(nombre,descripcion,codigoBarras,fechaVencimiento,idProveedor,idSeccion,idUniMedida,idMarcas,idTipo,idMargen) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            con= cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, prod.getNombre());
            ps.setString(2, prod.getDescripcion());
            ps.setString(3, prod.getCodigoBarras());
            ps.setDate(4,prod.getFechaVencimiento());
            ps.setInt(5, prod.getIdProveedor());
            ps.setInt(6, prod.getIdSeccion());
            ps.setInt(7, prod.getIdUniMedida());
            ps.setInt(8, prod.getIdMarcas());
            ps.setInt(9, prod.getIdTipo());
            ps.setInt(10, prod.getIdMargen());
            ps.executeUpdate();
            rpta=1;
        } catch (SQLException e) {
            e.printStackTrace();
            rpta=0;
        }
    return rpta;
    }

 public List buscar(String cadena){
        List<producto>listap=new ArrayList();
    String sql="select idProducto,nombre from bdcomercio.productos where nombre like '%?%';";
    producto produ=new producto();
        try {
            con= cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
        while(rs.next()){      
        produ.setId(rs.getInt(1));
        produ.setNombre(rs.getString(2));
        listap.add(produ);
        }  
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return listap;
    }       
}
