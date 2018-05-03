/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import javax.ejb.Local;
import modelo.Mensaje;
import modelo.Oferta;
import modelo.Postulante;

/**
 *
 * @author Jimena
 */
@Local
public interface ServicioLocal {

    Oferta buscarOferta(int codigoOferta);

    Postulante buscarPostulante(String rut);

    boolean cerrarOferta(int codigo);

    boolean crearOferta(Oferta oferta);

    String enviarMensaje(String rut, Mensaje msg);

    ArrayList<Oferta> getOfertas();

    ArrayList<Postulante> getPostulantes();

    boolean iniciarSesion(String rut, String pass);

    String postular(String rut, int codigoOferta);

    String addPostulante(Postulante postulante);
    
}
