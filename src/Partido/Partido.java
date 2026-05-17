package Partido;

import java.util.Date;
import java.sql.Time;

public class Partido {
    private Date fecha;
    private Time horario;
    private int duracion;
    private int tiempoAdicional;

    public Date getFecha() {
        return fecha;
    }
    public Time getHorario() {
        return horario;
    }
    public int getDuracion() {
        return duracion;
    }
    public int getTiempoAdicional() {
        return tiempoAdicional;
    }

}
