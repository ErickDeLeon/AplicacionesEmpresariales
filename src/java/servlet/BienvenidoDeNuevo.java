/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Erick Everaldo
 */
@WebServlet(name = "BienvenidoDeNuevo", urlPatterns = {"/BienvenidoDeNuevo"})
public class BienvenidoDeNuevo extends HttpServlet {

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
            out.println("<title>Servlet BienvenidoDeNuevo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BienvenidoDeNuevo at " + request.getContextPath() + "</h1>");
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
        // processRequest(request, response);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //obtener informacion de los headers
            String metodoHttp = request.getMethod();
            String ur = request.getRequestURI();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cabeceros HTPP (Metadatos) </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>METODOS DE HTTP</h1>");
            out.println("Metodo HTTP: " + metodoHttp);
            out.println("<br>");
            out.println("URI solicitado: " + ur);
            out.println("<br>");
            out.println("<br>");

            Enumeration cabeceros = request.getHeaderNames();
            while (cabeceros.hasMoreElements()) {
                String nombreCabecero = (String) cabeceros.nextElement();
                out.println("<b>" + nombreCabecero + ("</b>:"));
                out.println(request.getHeader(nombreCabecero));
                out.println("<br>");
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
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
        //processRequest(request, response);

        PrintWriter out = response.getWriter();

        //Simulando Valores
        String unusarioCorrecto = "erick@gmail.com";
        String passCorrecto = "12345678";

        String pUsuario = request.getParameter("usuario");
        String pPassword = request.getParameter("password");

        if (unusarioCorrecto.equals(pUsuario) && passCorrecto.equals(pPassword)) {

            // out.println("<h1>");
            // out.println("Datos Correctos");
            // out.println("<br> Usuario: "+pUsuario);
            // out.println("<br>Password: " + pPassword);
            // out.println("</h1>");
            out.println(
                    "<!doctype html>\n"
                    + "<html lang=\"en\">\n"
                    + "\n"
                    + "<head>\n"
                    + "    <!-- Required meta tags -->\n"
                    + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/> "
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"
                    + "    <title> England Travel || Home</title>\n"
                    + "    <link rel=\"icon\" href=\"img/favicon.png\">\n"
                    + "    <!-- Bootstrap CSS -->\n"
                    + "    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n"
                    + "    <!-- animate CSS -->\n"
                    + "    <link rel=\"stylesheet\" href=\"css/animate.css\">\n"
                    + "    <!-- owl carousel CSS -->\n"
                    + "    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n"
                    + "    <!-- themify CSS -->\n"
                    + "    <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n"
                    + "    <!-- flaticon CSS -->\n"
                    + "    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n"
                    + "    <!-- font awesome CSS -->\n"
                    + "    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n"
                    + "    <!-- swiper CSS -->\n"
                    + "    <link rel=\"stylesheet\" href=\"css/swiper.min.css\">\n"
                    + "    <!-- style CSS -->\n"
                    + "    <link rel=\"stylesheet\" href=\"css/style.css\">\n"
                    + "</head>\n"
                    + "\n"
                    + "<body>\n"
                    + "    <!--::header part start::-->\n"
                    + "    <header class=\"header_area\">\n"
                    + "        <div class=\"sub_header\">\n"
                    + "            <div class=\"container\">\n"
                    + "                <div class=\"row align-items-center\">\n"
                    + "                  <div class=\"col-md-4 col-xl-6\">\n"
                    + "                      <div id=\"logo\">\n"
                    + "                          <a href=\"index.html\"><img src=\"img/Logo.png\" alt=\"\" title=\"\" /></a>\n"
                    + "                      </div>\n"
                    + "                  </div>\n"
                    + "                  <div class=\"col-md-8 col-xl-6\">\n"
                    + "                      <div class=\"sub_header_social_icon float-right\">\n"
                    + "<h3>Bienvenido: </h3> " + pUsuario
                    + "                       <!-- <a href=\"1\"><i class=\"flaticon-phone\"></i> 311 - 230 - 9481</a> -->\n"
                    + "                       <!-- <a href=\"#\" class=\"register_icon\"><i class=\"ti-arrow-right\"></i>Registrar</a>-->\n"
                    + "                        <a href=\"/ProyectoMaquetado/index.html\" class=\"register_icon\"><i class=\"ti-arrow-right\"></i>Cerrar Sesi&oacute;n</a>\n"
                    + "                      </div>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "        </div>\n"
                    + "        <div class=\"main_menu\">\n"
                    + "            <div class=\"container\">\n"
                    + "                <div class=\"row\">\n"
                    + "                    <div class=\"col-lg-12\">\n"
                    + "                        <nav class=\"navbar navbar-expand-lg navbar-light\">\n"
                    + "                            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n"
                    + "                                <span class=\"navbar-toggler-icon\"></span>\n"
                    + "                            </button>\n"
                    + "\n"
                    + "                            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n"
                    + "                                <ul class=\"navbar-nav mr-auto\">\n"
                    + "                                    <li class=\"nav-item active\">\n"
                    + "                                        <a class=\"nav-link active\" href=\"index.html\">Home</a>\n"
                    + "                                    </li>\n"
                    + "                                    <li class=\"nav-item\">\n"
                    + "                                        <a href=\"about.html\" class=\"nav-link\"> Gu&iacute;a Tur&iacutestica </a>\n"
                    + "                                    </li>\n"
                    + "                                    <li class=\"nav-item\">\n"
                    + "                                        <a href=\"team.html\" class=\"nav-link\">Excurisones y Visitas Guiadas</a>\n"
                    + "                                    </li>\n"
                    + "                                    <li class=\"nav-item\">\n"
                    + "                                        <a href=\"gallery.html\" class=\"nav-link\"> Traslados aeropuertos</a>\n"
                    + "                                    </li>\n"
                    + "                                   <!-- <li class=\"nav-item dropdown\">\n"
                    + "                                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n"
                    + "                                            Pages\n"
                    + "                                        </a>\n"
                    + "                                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n"
                    + "                                            <a class=\"dropdown-item\" href=\"elements.html\">Elements</a>\n"
                    + "                                            <a class=\"dropdown-item\" href=\"single-blog.html\">Single blog</a>\n"
                    + "                                        </div>\n"
                    + "                                    </li> -->\n"
                    + "                                    <li class=\"nav-item\">\n"
                    + "                                        <a href=\"blog.html\" class=\"nav-link\">Alojamiento</a>\n"
                    + "                                    </li>\n"
                    + "                                    <li class=\"nav-item\">\n"
                    + "                                        <a href=\"contact.html\" class=\"nav-link\">About</a>\n"
                    + "                                    </li>\n"
                    + "                                </ul>\n"
                    + "                                <div class=\"header_social_icon d-none d-lg-block\">\n"
                    + "                                    <ul>\n"
                    + "                                        <li><a href=\"#\"><i class=\"ti-facebook\"></i></a></li>\n"
                    + "                                        <li>\n"
                    + "                                            <a href=\"#\"> <i class=\"ti-twitter\"></i></a>\n"
                    + "                                        </li>\n"
                    + "                                        <li><a href=\"#\"><i class=\"ti-instagram\"></i></a></li>\n"
                    + "                                        <li><a href=\"#\"><i class=\"ti-skype\"></i></a></li>\n"
                    + "                                    </ul>\n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "                        </nav>\n"
                    + "                        <div class=\"header_social_icon d-block d-lg-none\">\n"
                    + "                            <ul>\n"
                    + "                                <li><a href=\"#\"><i class=\"ti-facebook\"></i></a></li>\n"
                    + "                                <li>\n"
                    + "                                    <a href=\"#\"> <i class=\"ti-twitter\"></i></a>\n"
                    + "                                </li>\n"
                    + "                                <li><a href=\"#\"><i class=\"ti-instagram\"></i></a></li>\n"
                    + "                                <li><a href=\"#\"><i class=\"ti-skype\"></i></a></li>\n"
                    + "                            </ul>\n"
                    + "                        </div>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "        </div>\n"
                    + "    </header>"
                    + "</body>\n"
                    + "\n"
                    + "</html>");

            
                String titulo = null, mensaje1 = null;
                String tipoNavegador = request.getHeader("User-Agent");
                System.out.println("El tipo de navegador es: " + tipoNavegador);

                if (tipoNavegador != null && tipoNavegador.contains("Trident")) {
                    titulo = "Navegador Internet Explorer";
                    mensaje1 = "Estas navegando en Internet Explorer";
                }
                if (tipoNavegador != null && tipoNavegador.contains("Firefox")) {
                    titulo = "Navegador Firefox";
                    mensaje1 = "Estas navegando en Firefox";
                }
                if (tipoNavegador != null && tipoNavegador.contains("Chrome")) {
                    titulo = "Navegador Google Chrome";
                    mensaje1 = "Estas en Chrome";
                }

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>" + titulo + "</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>" + mensaje1 + "</h1>");
                out.println("</body>");
                out.println("</html>");

            

            try {
                //obtener informacion de los headers
                String metodoHttp = request.getMethod();
                String ur = request.getRequestURI();

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Cabeceros HTPP (Metadatos) </title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>METODOS DE HTTP</h1>");
                out.println("Metodo HTTP: " + metodoHttp);
                out.println("<br>");
                out.println("URI solicitado: " + ur);
                out.println("<br>");
                out.println("<br>");

                Enumeration cabeceros = request.getHeaderNames();
                while (cabeceros.hasMoreElements()) {
                    String nombreCabecero = (String) cabeceros.nextElement();
                    out.println("<b>" + nombreCabecero + ("</b>:"));
                    out.println(request.getHeader(nombreCabecero));
                    out.println("<br>");
                }
                
                 boolean nuevoUsuario = true;
        
        //Obtenemos todas las cookies
        Cookie[] cookies = request.getCookies();
        
        //Buscamos si ya existe una cookie creada con anterioridad
        //Llamada visitanteRecurrente
        
        if (cookies != null){
            for (Cookie c: cookies){
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                
                    //En caso de que ya exista una cookie indicando
                    //que ya existe un usuario registrado con anterioridad
                    //podemos la bandera en falso y salimos del ciclo
                    nuevoUsuario = false;
                    break;
            }
            }
        }
        
        String mensaje = null;
        if (nuevoUsuario) {
            //En caso de ser un usuario nuevo creamos el objeto Cookie
            Cookie vistanteCookie = new Cookie("visitanteRecurrente","si");
            //Agregamos la cookie en la respuesta
            response.addCookie(vistanteCookie);
            mensaje = "Gracias por visitar nuestro sitio";
            
        } else{
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }
               
        //Escribamos la salida
        response.setContentType("text/html");
        
        //Omitimos codigo HTML para simplificar el codigo.
        
        out.println("Mensaje: " + mensaje);

                out.println("</body>");
                out.println("</html>");
            } finally {
                out.close();
            }

        } else {
            //Respondemos al navegador con un codigo de estado de no autorizado.
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas.");
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
