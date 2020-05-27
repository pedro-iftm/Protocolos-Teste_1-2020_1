/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Clarimundo
 */
@WebServlet(name = "Invalidos", urlPatterns = {"/Invalidos"})
public class Invalidos extends HttpServlet {
    
//    Map<String, Integer> acessos = new HashMap<>();
    
    List<Usuario> listaUsuarios = new ArrayList<>();
    
    String usuarios = "";
    
  
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
        
        Usuario user = new Usuario();
        request.setCharacterEncoding("UTF-8"); // resolve a acentuação dos parâmetros obtidos
        
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");
        
        user.setLogin(nome);
        user.setSenha(senha);
        
        
        
        
        if(user.getLogin().contentEquals("fulano") && user.getSenha().contentEquals("fulano")){
            request.setAttribute("nome", user.getLogin());
            request.getRequestDispatcher("Validado1.jsp").forward(request, response);  
        }
        else{
            
            for(Usuario u: listaUsuarios){
                System.out.println("pinto de borracha ################################################################# ROLA ROLA ROLA");
                if(u.getLogin() == user.getLogin()){
                    user.setQntAcessos(user.getQntAcessos() + 1);
                }
                else{
                    listaUsuarios.add(user);
                }
            }
            request.setAttribute("listaUsuario", listaUsuarios);
            request.getRequestDispatcher("Validado2.jsp").forward(request, response);    
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
