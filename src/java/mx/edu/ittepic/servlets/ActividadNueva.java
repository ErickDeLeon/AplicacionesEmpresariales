/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.ittepic.ejbs.ActividadesOperaciones;

/**
 *
 * @author Erick Everaldo
 */
@WebServlet(name = "ActividadNueva", urlPatterns = {"/ActividadNueva"})
public class ActividadNueva extends HttpServlet {

    @EJB private 
            ActividadesOperaciones ejb;

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
            out.println("<title>Servlet ActividadNueva</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ActividadNueva at " + request.getContextPath() + "</h1>");
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
        // processRequest(request, response);

        response.setContentType("application/json;charset=UTF-8");

        response.setHeader("Cache-Control", "no-store");

        //Crear el objeto necesario para devolver respuesta.
        PrintWriter p = response.getWriter();

        
        String nombreactividad = request.getParameter("nombreactividad");
        String imgactividad  = request.getParameter("imgactividad");
        String descriactividad  = request.getParameter("descriactividad");
        String tiempoactividad  = request.getParameter("tiempoactividad");
        String transporteactividad  = request.getParameter("transporteactividad");
        String entradaactividad  = request.getParameter("entradaactividad");
        String intinerarioactividad  = request.getParameter("intinerarioactividad");
        String audioguiaactividad  = request.getParameter("audioguiaactividad");
        String toursinentradaactividad  = request.getParameter("toursinentradaactividad");
        String importanteactividad  = request.getParameter("importanteactividad");
        String accesibilidadactividad = request.getParameter("accesibilidadactividad");
        String precioadutoactiviadad  = request.getParameter("precioadutoactiviadad");
        String precioninoactividad  = request.getParameter("precioninoactividad");
        String puntoactividad  = request.getParameter("puntoactividad");

        p.write(ejb.nuevaActividad(nombreactividad,imgactividad,descriactividad, tiempoactividad, transporteactividad, entradaactividad, intinerarioactividad, audioguiaactividad, toursinentradaactividad, importanteactividad, accesibilidadactividad, precioadutoactiviadad, precioninoactividad, puntoactividad  ));

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
