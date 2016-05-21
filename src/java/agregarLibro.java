/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.libro;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guillermo
 */
@WebServlet(urlPatterns = {"/agregarLibro"})
public class agregarLibro extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        libro Libro = new libro();
        
        Libro.titulo=request.getParameter("titulo");
        Libro.autor=request.getParameter("autor");
        Libro.año=Integer.parseInt(request.getParameter("anio"));
        Libro.editorial=request.getParameter("editorial");
                
        try {
            libro.agregar(Libro);
        } catch (SQLException ex) {
            Logger.getLogger(agregarLibro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(agregarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
      
    }  
  
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }
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
            out.println("<title>Servlet agregarLibro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet agregarLibro at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param req
     * @param resp
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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