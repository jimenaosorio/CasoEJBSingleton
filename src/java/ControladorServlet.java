/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.ServicioLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Postulante;

/**
 *
 * @author Jimena
 */
@WebServlet(urlPatterns = {"/control.do"})
public class ControladorServlet extends HttpServlet {

    @EJB
    private ServicioLocal servicio;
    

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
        String btn=request.getParameter("btn");
        switch(btn){
            case "ingresar": iniciarSesion(request,response);
                break;
            case "registro": registrar(request,response);
                break;
        }
    }
    protected void registrar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String rut=request.getParameter("rut");
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String correo=request.getParameter("correo");
        String clave=request.getParameter("clave");
        String clave2=request.getParameter("clave2");
        String errores="";
        if(rut.equals("")){
            errores+="Debe ingresar el RUT<br/>";
        }
        if(nombre.equals("")){
            errores+="Debe ingresar su nombre<br/>";
        }
        if(!clave.equals(clave2)){
            errores+="Las claves no coinciden<br/>";
        }
        if(errores.equals("")){ //No hay errores
            Postulante postulante=new Postulante(rut,nombre,apellido,correo,clave,null,null,null);
            String msg=servicio.addPostulante(postulante);
            request.setAttribute("msg",msg);
            request.getRequestDispatcher("iniciarsesion.jsp").forward(request, response);
        }
        else{
            request.setAttribute("msg", errores);
            request.getRequestDispatcher("registro.jsp").forward(request,response);
        }
        
    }
    protected void iniciarSesion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String rut=request.getParameter("rut");
        String clave=request.getParameter("clave");
        String msg="";
        if(rut.isEmpty() || clave.isEmpty()){
            msg+="Faltan RUT y clave son obligatorios<br/>";
            request.getRequestDispatcher("iniciarsesion.jsp").forward(request, response);
        }
        else{
            if(servicio.iniciarSesion(rut,clave)){
                //ingreso ok
                if(servicio.buscarPostulante(rut).getNombre().equals("admin")){
                    request.getSession().setAttribute("admin","admin");
                }
                else{
                    request.getSession().setAttribute("rut",rut);
                }
                response.sendRedirect("ofertas.jsp");
            }
            else{
                //error
                msg+="El usuario no existe<br/>";
                request.setAttribute("msg", msg);
                request.getRequestDispatcher("iniciarsesion.jsp").forward(request, response);
            }
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
