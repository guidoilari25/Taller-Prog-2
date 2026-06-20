package com.sistemamundial.modelos.torneo;
import com.sistemamundial.modelos.partido.*;
import com.sistemamundial.modelos.personas.Jugador;

public class Participacion {
    private boolean esLocal;
    private Seleccion seleccion;
    private Partido partido;

    public Participacion() {
        this(false, null, null);
    }

    public Participacion(boolean esLocal, Seleccion seleccion, Partido partido) {
        this.esLocal = esLocal;
        this.seleccion = seleccion;
        this.partido = partido;
    }

    public boolean getEsLocal() {
        return esLocal;
    }
    public void setEsLocal(boolean esLocal) {
        this.esLocal = esLocal;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }
    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }


    public int cantidadGoles() {
        return contarEventosPropios(TipoEvento.GOL);
    }

    public int cantidadTarjetasAmarillas() {
        return contarEventosPropios(TipoEvento.TARJETA_AMARILLA);
    }

    public int cantidadTarjetasRojas() {
        return contarEventosPropios(TipoEvento.TARJETA_ROJA);
    }
    
    private int contarEventosPropios(TipoEvento tipoBuscado) {
        int contador = 0;
        for (Evento e : this.partido.getEventos()) {
            if (e.getTipo().equals(tipoBuscado)) {
                if (this.seleccion.getPlantel().contains(e.getJugador())) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
