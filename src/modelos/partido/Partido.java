package modelos.partido;

import modelos.personas.Jugador;
import modelos.torneo.*;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Time;
import java.util.List;

public class Partido {
    //Atributos propios
    private Date fecha;
    private Time horario;
    private float duracion;
    private float tiempoAdicional;

    //Asociaciones
    private Fase fase;
    private Estadio estadio;
    private List<Evento> eventos; //asocioacion evento
    private List<Arbitraje> arbitrajes; //asociacion arbitraje
    private List<Participacion> participaciones; //asociacion participacion

    //constructores
    public Partido() {
        this(null, null, 0, 0, null, null);
        this.eventos = new ArrayList<Evento>();
        this.arbitrajes = new ArrayList<Arbitraje>();
        this.participaciones = new ArrayList<Participacion>();
    }
    public Partido(Date fecha, Time horario, float duracion, float tiempoAdicional, Fase fase,
                   Estadio estadio) {
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
        this.fase = fase;
        this.estadio = estadio;
        this.eventos = new ArrayList<Evento>();
        this.arbitrajes = new ArrayList<Arbitraje>();
        this.participaciones = new ArrayList<Participacion>();
    }

    //getters, setters
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHorario() {
        return horario;
    }
    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public float getDuracion() {
        return duracion;
    }
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public float getTiempoAdicional() {
        return tiempoAdicional;
    }
    public void setTiempoAdicional(float tiempoAdicional) {
        this.tiempoAdicional = tiempoAdicional;
    }

    public Fase getFase(){
        return this.fase;
    }
    public void setFase(Fase fase){
        this.fase = fase;
    }
    public void agregarEvento(TipoEvento tipoEvento, float minuto, Jugador j){
        this.eventos.add(new Evento(tipoEvento, minuto, j));
    }
    public List<Evento> getEventos(){ return eventos; }

    public void setArbitrajes(List<Arbitraje> arbitrajes){ this.arbitrajes = arbitrajes; }
    public void agregarArbitraje(Arbitraje arbitraje){ this.arbitrajes.add(arbitraje); }
    public List<Arbitraje> getArbitrajes(){ return arbitrajes; }

    public void setParticipaciones(List<Participacion> participaciones){
        this.participaciones = participaciones;
    }
    public void agregarParticipacion(Participacion participacion){
        this.participaciones.add(participacion);
    }
    public List<Participacion> getParticipaciones(){
        return participaciones;
    }
}
