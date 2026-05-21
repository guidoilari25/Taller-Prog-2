package Torneo;

public class Pais {
    private String nombre;
    private String bandera;

    public Pais() {
        this("", "");
    }
    public Pais(String nombre, String bandera) {
        this.nombre = nombre;
        this.bandera = bandera;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getBandera() {
        return bandera;
    }
    public void setBandera(String bandera) {
        this.bandera = bandera;
    }
}
