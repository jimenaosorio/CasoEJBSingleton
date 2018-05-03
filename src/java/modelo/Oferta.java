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
public class Oferta {
    private int codigo;
    private String titulo;
    private String descripcion;
    private boolean estaActiva;
    private ArrayList<Postulante> misPostulantes=new ArrayList();

    public Oferta() {
    }

    public Oferta(int codigo, String titulo, String descripcion, boolean estaActiva, ArrayList<Postulante> misPostulantes) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estaActiva = estaActiva;
        this.misPostulantes = misPostulantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstaActiva() {
        return estaActiva;
    }

    public void setEstaActiva(boolean estaActiva) {
        this.estaActiva = estaActiva;
    }

    public ArrayList<Postulante> getMisPostulantes() {
        return misPostulantes;
    }

    public void setMisPostulantes(ArrayList<Postulante> misPostulantes) {
        this.misPostulantes = misPostulantes;
    }
    
    
}
