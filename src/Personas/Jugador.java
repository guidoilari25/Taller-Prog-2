package Personas;

public class Jugador extends Persona {
    private int dorsal;
    private Posicion posicion;
    private float peso;
    private float altura;

    public Jugador(String nombre, int fechaNac, int dorsal, float peso, float altura, Posicion posicion) {
        super(nombre, fechaNac); /*Correspondiente a la clase padre*/
        this.dorsal = dorsal;
        this.peso = peso;
        this.altura = altura;
        this.posicion = posicion;

    }

    public int getDorsal() {

        return dorsal;
    }

    public void setDorsal(int dorsal) {

        this.dorsal = dorsal;
    }

    public Posicion getPosicion() {

        return posicion;
    }

    public void setPosicion(Posicion posicion) {

        this.posicion = posicion;
    }

    public float getPeso() {

        return peso;
    }

    public void setPeso(float peso) {

        this.peso = peso;
    }

    public float getAltura() {

        return altura;
    }

    public void setAltura(float altura) {

        this.altura = altura;
    }
}
