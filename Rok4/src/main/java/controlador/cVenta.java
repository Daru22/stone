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
import modelo.detVenta;
import modelo.detVentaDao;
import modelo.ingresoCompra;
import modelo.ingresoCompraDao;
import modelo.producto;
import modelo.productoDao;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "cVenta", urlPatterns = {"/cVenta"})
public class cVenta extends HttpServlet {

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
            out.println("<title>Servlet cVenta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cVenta at " + request.getContextPath() + "</h1>");
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
         String accion=request.getParameter("btnGuardar");
        
        switch(accion){
            case "GUARDAR":
                detVenta prod= new detVenta();
                detVentaDao pDao=new detVentaDao();
             int rpta;             
             prod.setIdProducto(Integer.parseInt(request.getParameter("hiddId")));
             prod.setCantidad(Integer.parseInt(request.getParameter("txtCantidad")));
             prod.setPrecioUnit(Float.parseFloat(request.getParameter("txtPrecio")));
             prod.setImporte(Float.parseFloat(request.getParameter("txtImporte")));
             prod.setDescuento(Float.parseFloat(request.getParameter("txtDescuento")));
             rpta=pDao.guardar(prod);
             if(rpta==1){
             request.setAttribute("respuesta", "Insertado con Exito");
                request.getRequestDispatcher("realizarVenta.jsp").forward(request, response);
             }else{
                  request.setAttribute("respuesta", "Hubo un Error");
                request.getRequestDispatcher("realizarVenta.jsp").forward(request, response);
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
