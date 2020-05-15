package modelo;

import config.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class usuariosDao {
    Conector cn = new Conector();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
            
    public usuarios validar(String user,String pass){
    usuarios usr = new usuarios();
    String sql="select * from usuarios where usuario=? and clave=?";
        try {
            try{
            con= cn.Conectar();
            }catch(Exception e){ e.printStackTrace();}
            ps=con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            while(rs.next()){
            usr.setUser(rs.getString("usuario"));
            usr.setPassword(rs.getString("clave"));
            usr.setNom(rs.getString("nombres"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return usr;
    }
}
