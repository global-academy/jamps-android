package scom.p.m.a.j.jamps;

/**
 * Created by globalstudent on 13-08-15.
 */
public class ReporteNuevo {
    String titulo;
    String imagen;
    String comentario;


    public ReporteNuevo(String titulo, String imagen, String comentario) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.comentario = comentario;
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

    public String  getComentario(String comentario){
        return comentario;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }
}
