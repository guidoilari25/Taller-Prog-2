package modelos.partido;
import modelos.personas.*;

public class Evento {
    private TipoEvento tipo;
    private float minuto;
    private Jugador jugador;

    public Evento() {
        this(null, 0, null);
    }

    public Evento(TipoEvento tipo, float minuto, Jugador jugador) {
        this.tipo = tipo;
        this.minuto = minuto;
        this.jugador = jugador;
    }
    
    public TipoEvento getTipo() {
        return tipo;
    }
    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }
    public float getMinuto() {
        return minuto;
    }
    public void setMinuto(float minuto) {
        this.minuto = minuto;
    }
}
