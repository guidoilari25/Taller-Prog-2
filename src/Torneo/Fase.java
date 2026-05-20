package Torneo;

public class Fase {
    private NombreFase fase;

    public Fase() {
        this.fase = null;
    }
    public Fase(NombreFase fase) {
        this.fase = fase;
    }
    
    public NombreFase getNombre() {
        return fase;
    }
    public void setNombre(NombreFase fase) {
        this.fase = fase;
    }
}
