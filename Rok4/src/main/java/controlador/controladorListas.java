/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.listarDao;

/**
 *
 * @author Master-D
 */
@WebServlet(name = "controladorListas", urlPatterns = {"/controladorListas"})
public class controladorListas extends HttpServlet {

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
   listarDao listDao=new listarDao();
              
              List listaProv=listDao.listarProveedor();
              List listaSec=listDao.listarSeccion();
              List listaUniMedi=listDao.listarMedidas();
              List listaMarc=listDao.listarMarcas();
              List listaTipo=listDao.listarTipo();
              List listaTienda=listDao.listarTienda();
              List listaMarg=listDao.listarMargen();
              
              request.setAttribute("listaProv", listaProv);
              request.setAttribute("listaSec", listaSec);
              request.setAttribute("listaUniMedi", listaUniMedi);
              request.setAttribute("listaMarc", listaMarc);
              request.setAttribute("listaTipo", listaTipo);
              request.setAttribute("listaTienda", listaTienda);
              request.setAttribute("listaMarg", listaMarg);
              
              request.getRequestDispatcher("registrarProducto.jsp").forward(request, response); 
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
        processRequest(request, response);
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
