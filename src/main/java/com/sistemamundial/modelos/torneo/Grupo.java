package com.sistemamundial.modelos.torneo;
import com.sistemamundial.utilidades.Resultados;
import com.sistemamundial.modelos.partido.Partido;

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


    /**
     * Calcula los puntos totales obtenidos por una selección en la fase de grupos.
     * El metodo itera sobre el historial de participaciones de la selección,
     * comparando la cantidad de goles propios contra los del rival en cada partido.
     * Aplica el reglamento estándar sumando 3 puntos por victoria y 1 por empate.
     * * @param s La {@link Seleccion} a la cual se le calcularán los puntos.
     * @return El puntaje total acumulado por la selección en sus partidos disputados.
     */
    public int obtenerPuntos(Seleccion s) {
        int puntosTotales = 0;

        for (Participacion participacion : s.getParticipaciones()) {
            switch (Resultados.obtenerResultado(participacion)){
                case 'v':
                    puntosTotales += 3;
                    break;
                case 'e':
                    puntosTotales++;
                    break;
            }
        }
        return puntosTotales;
    }
}
