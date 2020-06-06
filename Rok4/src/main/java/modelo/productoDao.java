
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

 public List buscar(){
   List<producto>lista=new ArrayList();
    String sql="select idProducto,nombre from productos";
    try {
        con= cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        producto prod=new producto();
        prod.setId(rs.getInt(1));
        prod.setNombre(rs.getString(2));
        lista.add(prod);
        }        
    } catch (Exception e){
        e.printStackTrace();
    }
    return lista;   
}
 
  public producto buscarPS(String idProd){
      producto prod=new producto();
    String sql="select precio,stock,nombre from productos where idProducto=?";
    try {
        con= cn.Conectar();
        ps=con.prepareStatement(sql);
        ps.setString(1,idProd);
        rs=ps.executeQuery();
        while(rs.next()){
        prod.setPrecio(rs.getFloat(1));
        prod.setStock(rs.getInt(2));
        prod.setNombre(rs.getString(3));
        }        
    } catch (Exception e){
        e.printStackTrace();
    }
    return prod;   
}
  
  public List buscarPS2(){
      List<producto>lista=new ArrayList();
      String sql="select idProducto,nombre,precio,stock from productos";
    try {
        con= cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        producto prod=new producto();
        prod.setId(rs.getInt(1));
        prod.setNombre(rs.getString(2));
        prod.setPrecio(rs.getFloat(3));
        prod.setStock(rs.getInt(4));
        lista.add(prod);
        }        
    } catch (Exception e){
        e.printStackTrace();
    }
    return lista;   
}
  
}
