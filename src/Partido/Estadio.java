package Partido;

public class Estadio {
    private String nombre;
    private int capacidad;

    public Estadio() {
        this.nombre = "";
        this.capacidad = 0;
    }
    public Estadio(String nombre, int capacidad) [
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }
    public int getCapacidad() {
        return capacidad;
    }
    
}
