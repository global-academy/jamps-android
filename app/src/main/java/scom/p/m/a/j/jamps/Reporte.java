package scom.p.m.a.j.jamps;

/**
 * Created by Daniel on 8/8/2015.
 */
public class Reporte {
    String titulo;
    String imagen;


    public Reporte(String titulo, String imagen) {
        this.titulo = titulo;
        this.imagen = imagen;
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
}