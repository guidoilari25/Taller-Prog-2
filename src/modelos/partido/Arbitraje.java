public class Arbitraje {
    private Rol categoriaArbitro;
    private Arbitro arbitro;
    private Partido partido;

    public Arbitraje() {
        this(null, null, null);
    }
    public Arbitraje(Rol categoriaArbitro, Arbitro arbitro, Partido partido) {
        this.categoriaArbitro = categoriaArbitro;
        this.arbitro = arbitro;
        this.partido = partido;
    }

    public Rol getCategoriaArbitro () {
        return categoriaArbitro;
    }
    public void setCategoriaArbitro (Rol categoriaArbitro) {
        this.categoriaArbitro = categoriaArbitro;
    }
    public Arbitro getArbitro () {
        return arbitro;
    }
    public void setArbitro (Arbitro arbitro) {
        this.arbitro = arbitro;
    }
    public Partido getPartido () {
        return partido;
    }
    public void setPartido (Partido partido) {
        this.partido = partido;
    }
}
