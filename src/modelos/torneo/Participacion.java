public class Participacion {
    private boolean esLocal;
    private Seleccion seleccion;
    private Partido partido;

    public Participacion() {
        this(false, null, null);
    }
    public Participacion(boolean esLocal, Seleccion seleccion, Partido partido) {
        this.esLocal = esLocal;
        this.seleccion = seleccion;
        this.partido = partido;
    }

    public boolean getEsLocal() {
        return esLocal;
    }
    public void setEsLocal(boolean esLocal) {
        this.esLocal = esLocal;
    }
    public Seleccion getSeleccion() {
        return seleccion;
    }
    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }
    public Partido gePartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public int cantidadGoles() {

    }
    public int cantidadTarjAmarillas() {
        
    }
    public int cantidadTarjRojas() {
        
    }
}
