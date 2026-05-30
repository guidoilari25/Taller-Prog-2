package modelos.personas;
import modelos.torneo.*;
import modelos.partido.*;

import java.util.ArrayList;
import java.util.List;

public class Arbitro extends Persona{
    private int aniosExp;
    private Pais pais;
    private List<Arbitraje> arbitrajes;


    public Arbitro(String nombre, int fechaNac){
        super(nombre, fechaNac);
        this.arbitrajes = new ArrayList<Arbitraje>();
    }
    public Arbitro(String nombre, int fechaNac, int aniosExp, Pais pais){
        super(nombre, fechaNac);
        this.aniosExp = aniosExp;
        this.pais = pais;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setArbitrajes(List<Arbitraje> arbitrajes){
        this.arbitrajes = arbitrajes;
    }
    public void agregarArbitrajes(Arbitraje arbitraje){
        this.arbitrajes.add(arbitraje);
    }
    public List<Arbitraje> getArbitrajes(){
        return arbitrajes;
    }


}
