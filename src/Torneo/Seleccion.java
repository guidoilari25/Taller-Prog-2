public class Seleccion {
    private String Federacion;
    private String camiseta_1ra;
    private String camiseta_2da;
    private boolean cabezaGrupo;
    private int rankingFIFA;

    public Seleccion() {
        this("", "", "", false, 0);
    }
    public Seleccion(String Federacion, String camiseta_1ra, String camiseta_2da, boolean cabezaGrupo, int rankingFIFA) {
        this.Federacion = Federacion;
        this.camiseta_1ra = camiseta_1ra;
        this.camiseta_2da = camiseta_2da;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
    }

    public String getFederacion() {
        return Federacion;
    }
    public void setFederacion(String Federacion) {
        this.Federacion = Federacion;
    }
    public String getCamiseta_1ra() {
        return camiseta_1ra;
    }
    public void setCamiseta_1ra(String camiseta_1ra) {
        this.camiseta_1ra = camiseta_1ra;
    }
    public String getCamiseta_2da() {
        return camiseta_2da;
    }
    public void setCamiseta_2da(String camiseta_2da) {
        this.camiseta_2da = camiseta_2da;
    }
    public boolean getCabezaGrupo() {
        return cabezaGrupo;
    }
    public void setCabezaGrupo(boolean cabezaGrupo) {
        this.cabezaGrupo = cabezaGrupo;
    }
    public int getRankingFIFA() {
        return rankingFIFA;
    }
    public void setRankingFIFA(int rankingFIFA) {
        this.rankingFIFA = rankingFIFA;
    }
}
