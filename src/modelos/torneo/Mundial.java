package modelos.torneo;

public class Mundial {
    private int anno;
    private String mascota;
    private int fechaDesde;
    private int fechaHasta;

    public Mundial() {
        this(0, "", 0, 0);
    }
    public Mundial(int anno, String mascota, int fechaDesde, int fechaHasta) {
        this.anno = anno;
        this.mascota = mascota;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public String getMascota() {
        return mascota;
    }
    public void setMascota(String mascota) {
        this.mascota = mascota;
    }
    public int getFechaDesde() {
        return fechaDesde;
    }
    public void setFechaDesde(int fechaDesde) {
        this.fechaDesde = fechaDesde;
    }
    public int getFechaHasta() {
        return fechaHasta;
    }
    public void setFechaHasta(int fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
}
