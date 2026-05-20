package Torneo;

public class Fase {
    private NombreFase nombre;

    public Fase() {
        this.fase = null;
    }
    public Fase(NombreFase fase) {
        this.fase = fase;
    }
    
    public NombreFase getNombre() {
        return nombre;
    }
    public void setNombre(NombreFase fase) {
        this.fase = fase;
    }
}
