package Torneo;

public class Grupo {
    private String identificacion;
    private String descripcion;

    public Grupo() {
        this.identificacion = "";
        this.descripcion = "";
    }
    public Grupo(String identificacion, String descripcion) {
        this.identificacion = identificacion;
        this.descripcion = descripcion;
    }

    public String getIndentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public int obtenerPuntos(Seleccion s) {
        
    }
}
