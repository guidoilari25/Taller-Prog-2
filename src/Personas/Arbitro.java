package Personas;

public class Arbitro extends Persona{
    private int aniosExp;

    public Arbitro(String nombre, int fechaNac, int aniosExp){
        super(nombre, fechaNac);
        this.aniosExp = aniosExp;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }
}
