package modelos.partido;
import modelos.personas.Jugador;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Time;
import java.util.List;

public class Partido {
    private Date fecha;
    private Time horario;
    private float duracion;
    private float tiempoAdicional;
    private List<Evento> eventos;

    public Partido() {
        this(null, null, 0, 0);
        this.eventos = new ArrayList<Evento>();
    }
    public Partido(Date fecha, Time horario, float duracion, float tiempoAdicional) {
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
        this.eventos = new ArrayList<Evento>();
    }

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
    public void agregarEvento(TipoEvento tipoEvento, float minuto, Jugador j){
        this.eventos.add(new Evento(tipoEvento, minuto, j));
    }
}
