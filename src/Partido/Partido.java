package Partido;

import java.util.Date;
import java.sql.Time;

public class Partido {
    private Date fecha;
    private Time horario;
    private float duracion;
    private float tiempoAdicional;

    public Partido() {
        this(null, null, 0, 0);
    }
    public Partido(Date fecha, Time horario, float duracion, float tiempoAdicional) {
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
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
}
