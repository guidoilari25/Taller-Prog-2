package modelos.personas;
import modelos.partido.Evento;

import java.util.ArrayList;
import java.util.List;

public class Jugador extends Persona {
    private int dorsal;
    private Posicion posicion;
    private float peso;
    private float altura;
    private List<Evento> eventos;

    public Jugador(){
        this("", 0, 0, 0, 0, null);
        this.eventos = new ArrayList<Evento>();

    }

    public Jugador(String nombre, int fechaNac, int dorsal, float peso, float altura, Posicion posicion) {
        super(nombre, fechaNac); // Correspondiente a la clase padre
        this.dorsal = dorsal;
        this.peso = peso;
        this.altura = altura;
        this.posicion = posicion;
        this.eventos = new ArrayList<Evento>();
    }

    public int getDorsal() { return dorsal; }
    public void setDorsal(int dorsal) { this.dorsal = dorsal; }

    public Posicion getPosicion() { return posicion; }
    public void setPosicion(Posicion posicion) { this.posicion = posicion; }

    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }

    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }

    public void setEventos(List<Evento> eventos){
        this.eventos = eventos;
    }
    public void agregarEvento(Evento evento){
        this.eventos.add(evento);
    }
    public List<Evento> getEventos(){
        return eventos;
    }
}
