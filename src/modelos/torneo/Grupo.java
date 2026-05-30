package modelos.torneo;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String identificacion;
    private String descripcion;

    //asociaciones
    private Fase fase; //asociaciones fase
    private List<Seleccion> selecciones; //asociacione seleccion

    public Grupo() {
        this("", "", null);
        this.selecciones = new ArrayList<Seleccion>();
    }
    public Grupo(String identificacion, String descripcion, Fase fase) {
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.fase = fase;
        this.selecciones = new ArrayList<Seleccion>();
    }

    public String getIdentificacion() {
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


    public void setFase(Fase fase){
        this.fase = fase;
    }
    public Fase getFase(){
        return this.fase;
    }

    public void setSelecciones(List<Seleccion> selecciones){ this.selecciones = selecciones;}
    public List<Seleccion> getSelecciones(){ return selecciones; }
    public void agregarSeleccion(Seleccion s){ this.selecciones.add(s); }


    //public int obtenerPuntos(Seleccion s) {}
}
