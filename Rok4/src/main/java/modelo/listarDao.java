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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Master-D
 */
public class listarDao {
    Conector cn = new Conector();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
        int rpta;  
    public List listarProveedor(){
    List<proveedor>lista=new ArrayList();
    String sql="select * from proveedor";
    try {
        con= cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        proveedor prov=new proveedor();
        prov.setIdProveedor(rs.getInt(1));
        prov.setRuc(rs.getString(2));
        prov.setRazonSocial(rs.getString(3));
        prov.setOtros(rs.getString(4));
        lista.add(prov);
        }        
    } catch (Exception e){
        e.printStackTrace();
    }
    return lista;
}
    public List listarSeccion(){
    List<seccion>lista=new ArrayList();
    String sql="select * from seccion";
    try {
        con= cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        seccion sec=new seccion();
        sec.setIdSeccion(rs.getInt(1));
        sec.setNombreSeccion(rs.getString(2));
        sec.setOtros(rs.getString(3));
        lista.add(sec);
        }        
    } catch (Exception e){
        e.printStackTrace();
    }
    return lista;
}
    public List listarMedidas(){
    List<unidadMedida>lista=new ArrayList();
    String sql="select * from unidadmedida";
    try {
        con= cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        unidadMedida um=new unidadMedida();
        um.setIdUniMedida(rs.getInt(1));
        um.setNombrwMedida(rs.getString(2));
        um.setOtros(rs.getString(3));
        lista.add(um);
        }        
    } catch (Exception e){
        e.printStackTrace();
    }
    return lista;
}
    public List listarMarcas(){
    List<marcas>lista=new ArrayList();
    String sql="select * from marcas";
    try {
        con= cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        marcas marc=new marcas();
        marc.setIdMarcas(rs.getInt(1));
        marc.setNombreMarca(rs.getString(2));
        marc.setOtros(rs.getString(3));
        lista.add(marc);
        }        
    } catch (Exception e){
        e.printStackTrace();
    }
    return lista;
}
    
    public List listarTipo(){
    List<tipos>lista=new ArrayList();
    String sql="select * from tipo";
    try {
        con= cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        tipos tipo=new tipos();
        tipo.setIdTipo(rs.getInt(1));
        tipo.setNombreTipo(rs.getString(2));
        tipo.setOtros(rs.getString(3));
        lista.add(tipo);
        }        
    } catch (Exception e){
        e.printStackTrace();
    }
    return lista;
}
    
    public List listarTienda(){
    List<tienda>lista=new ArrayList();
    String sql="select * from tienda";
    try {
        con= cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        tienda tien=new tienda();
        tien.setIdTienda(rs.getInt(1));
        tien.setNombreTienda(rs.getString(2));
        tien.setRuc(rs.getString(3));
        tien.setRazonSocial(rs.getString(4));
        lista.add(tien);
        }        
    } catch (Exception e){
        e.printStackTrace();
    }
    return lista;
}
    
    public List listarMargen(){
    List<margen>lista=new ArrayList();
    String sql="select * from margen";
    try {
        con= cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        margen marg=new margen();
        marg.setIdMargen(rs.getInt(1));
        marg.setNombreMargen(rs.getString(2));
        marg.setValor(rs.getFloat(3));
        marg.setOtros(rs.getString(4));
        lista.add(marg);
        }        
    } catch (Exception e){
        e.printStackTrace();
    }
    return lista;
}
}
