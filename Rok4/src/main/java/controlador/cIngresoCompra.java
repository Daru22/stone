/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.ingresoCompra;
import modelo.ingresoCompraDao;
import modelo.producto;
import modelo.productoDao;

/**
 *
 * @author Master-D
 */
@WebServlet(name = "cIngresoCompra", urlPatterns = {"/cIngresoCompra"})
public class cIngresoCompra extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String accion=request.getParameter("accion");
                productoDao pdao2 = new productoDao();
                List listaProd=pdao2.buscar();
                request.setAttribute("listaProd", listaProd);
                 switch(accion){
         case"ingresarC":
                request.getRequestDispatcher("ingresarCompra.jsp").forward(request, response);
             break;
         case"verP":
                request.getRequestDispatcher("verProductos.jsp").forward(request, response);
             break;
         case"venta":
                request.getRequestDispatcher("realizarVenta.jsp").forward(request, response);
             break;    
         default:
             throw new AssertionError();
                 
     } 
                
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               String accion=request.getParameter("btnRegistrar");
        
        switch(accion){
            case "GUARDAR":
             ingresoCompra prod= new ingresoCompra();
             ingresoCompraDao pDao=new ingresoCompraDao();
             int rpta;             
             String fechaVence=request.getParameter("dteIngresoC");
             Date formatFecha=null;
             try{
             SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");    
             formatFecha=new java.sql.Date(sdf.parse(fechaVence).getTime());
             }catch(Exception e){
             e.printStackTrace();}
             prod.setIdProducto(Integer.parseInt(request.getParameter("hiddId")));
             prod.setCantidad(Integer.parseInt(request.getParameter("txtCantidad")));
             prod.setPrecio(Float.parseFloat(request.getParameter("txtPrecio")));
             prod.setFecha(formatFecha);
             prod.setDocumento(request.getParameter("txtDocumento"));
             prod.setComentario(request.getParameter("txtComentario"));
             rpta=pDao.guardar(prod);
             if(rpta==1){
             request.setAttribute("respuesta", "Insertado con Exito");
               productoDao pdao2 = new productoDao();
                List listaProd=pdao2.buscar();
                request.setAttribute("listaProd", listaProd);
                request.getRequestDispatcher("ingresarCompra.jsp").forward(request, response);
             request.getRequestDispatcher("ingresarCompra.jsp").forward(request, response); 
             }else{
             request.setAttribute("respuesta", "Hubo error");
               productoDao pdao2 = new productoDao();
                List listaProd=pdao2.buscar();
                request.setAttribute("listaProd", listaProd);
                request.getRequestDispatcher("ingresarCompra.jsp").forward(request, response);
             }
             break;
            case "VER":
                productoDao pdao2 = new productoDao();
                producto prod1 = new producto();
                prod1=pdao2.buscarPS(request.getParameter("hiddId"));
                request.setAttribute("prod1", prod1);

                List listaProd=pdao2.buscar();
                request.setAttribute("listaProd", listaProd);
                 request.getRequestDispatcher("verProductos.jsp").forward(request, response);
                break;
         default:
             throw new AssertionError();
                
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
