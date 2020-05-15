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
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.producto;
import modelo.productoDao;

/**
 *
 * @author Master-D
 */
@WebServlet(name = "controladorProd", urlPatterns = {"/controladorProd"})
public class controladorProd extends HttpServlet {

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
        
 response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet c3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>DEDEDE c3 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String accion=request.getParameter("guardarProducto");
        switch(accion){
            case "GUARDAR":
             producto prod= new producto();
             productoDao pDao=new productoDao();
             int rpta;             
             String fechaVence=request.getParameter("dteFechaVenc");
             Date formatFecha=null;
             try{
             SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");    
             formatFecha=new java.sql.Date(sdf.parse(fechaVence).getTime());
             }catch(Exception e){
             e.printStackTrace();}
             prod.setNombre(request.getParameter("txtNombre"));
             prod.setDescripcion(request.getParameter("txtDescripcion"));
             prod.setCodigoBarras(request.getParameter("txtCodigoBarras"));
             prod.setFechaVencimiento(formatFecha);
             prod.setIdProveedor(Integer.parseInt(request.getParameter("cboProveedor")));
             prod.setIdSeccion(Integer.parseInt(request.getParameter("cboSeccion")));
             prod.setIdUniMedida(Integer.parseInt(request.getParameter("cboUnidadMedida")));
             prod.setIdMarcas(Integer.parseInt(request.getParameter("cboMarcas")));
             prod.setIdTipo(Integer.parseInt(request.getParameter("cboTipo")));
             prod.setIdTienda(Integer.parseInt(request.getParameter("cboTienda")));
             prod.setIdMargen(Integer.parseInt(request.getParameter("cboMargen")));
             rpta=pDao.guardar(prod);
             if(rpta==1){
             request.setAttribute("respuesta", "Insertado con Exito");
             request.getRequestDispatcher("controladorListas").forward(request, response); 
             }else{
             request.setAttribute("respuesta", "Hubo error");
             request.getRequestDispatcher("registrarProducto.jsp").forward(request, response); 
             }
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
