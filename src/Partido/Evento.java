package Partido;

public class Evento {
    private TipoEvento tipo;
    private float minuto;

    public Evento() {
        this(null, 0);
    }
    public Evento(TipoEvento tipo, float minuto) {
        this.tipo = tipo;
        this.minuto = minuto;
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
