/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Repository.UserRepository;
import Models.UserModel;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "UserCreateController", urlPatterns = {"/UserCreate"})
public class UserCreateController extends HttpServlet {

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
            out.println("<title>Servlet UserCreateController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error!!!</h1>");
            out.println("<p>El usuario ingresado no puede utilizarlo por segunda vez.</p>");
            out.println("<a href='UserCreate.jsp'>Intentar denuevo!</a>");
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
      
      //Capturar valores de la pagina HTML => Nombre usuario y el password
      String nombreUsuario = request.getParameter("txtUsuario");
      String passwordUsuario = request.getParameter("txtPassword");
      
      //Crear un objeto de la clase repository para manipular informacion de la BD
      UserRepository userRepository = new UserRepository();
      
      //Crear un modelo que es requisito para el Repository
      UserModel userModel = new UserModel();
      userModel.setUserName(nombreUsuario);
      userModel.setUserPassword(passwordUsuario);
      
      //Invocar a la funcion Crear usuario de la clase Repository
      boolean usuarioGrabado = userRepository.CreateUser(userModel);     
      //Evaluar resultado
      //Si grabo bien => Redireccionar a la lista de usuarios.
      //Si hay error => Redireccionar a una pagina de error.
      
      //if (usuarioGrabado == false)  => if (!usuarioGrabado)
      if (usuarioGrabado) // if (usuarioGrabado == true)
        request.getRequestDispatcher("UserList.jsp").forward(request, response);
      else 
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
