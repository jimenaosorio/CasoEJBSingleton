/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Jimena
 */
public class Postulante {
    private String rut;
    private String nombre;
    private String apellido;
    private String correo;
    private String pass;
    private Perfil miPerfil;
    private ArrayList<Oferta> misPostulaciones=new ArrayList();
    private ArrayList<Mensaje> misMensajes=new ArrayList();

    public Postulante() {
    }

    public Postulante(String rut, String nombre, String apellido, String correo, String pass, Perfil miPerfil, ArrayList<Oferta> misPostulaciones, ArrayList<Mensaje> misMensajes) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.pass = pass;
        this.miPerfil = miPerfil;
        this.misPostulaciones = misPostulaciones;
        this.misMensajes = misMensajes;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Perfil getMiPerfil() {
        return miPerfil;
    }

    public void setMiPerfil(Perfil miPerfil) {
        this.miPerfil = miPerfil;
    }

    public ArrayList<Oferta> getMisPostulaciones() {
        return misPostulaciones;
    }

    public void setMisPostulaciones(ArrayList<Oferta> misPostulaciones) {
        this.misPostulaciones = misPostulaciones;
    }

    public ArrayList<Mensaje> getMisMensajes() {
        return misMensajes;
    }

    public void setMisMensajes(ArrayList<Mensaje> misMensajes) {
        this.misMensajes = misMensajes;
    }
    
    
    
    
}
