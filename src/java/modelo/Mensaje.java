/*
 * Esto es un ejemplo para GitHub
 */
package modelo;

/**
 *
 * @author Jimena
 */
public class Mensaje {
    private String asunto;
    private String contenido;

    public Mensaje() {
    }

    public Mensaje(String asunto, String contenido) {
        this.asunto = asunto;
        this.contenido = contenido;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
}
