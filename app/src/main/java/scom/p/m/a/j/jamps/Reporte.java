package scom.p.m.a.j.jamps;

/**
 * Created by Daniel on 8/8/2015.
 */
public class Reporte {
    String titulo;
    String imagen;
    private String tipo;

    public Reporte(String titulo, String imagen) {
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public Reporte(String titulo, String imagen, String tipo) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo1) {
        this.titulo = titulo1;
    }

    public String getImagen(){
        return imagen;
    }

    public  void setImagen(String imagen1){
        this.imagen = imagen1;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}