package modelos.torneo;
import modelos.personas.*;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    private String federacion;
    private String camiseta_1ra;
    private String camiseta_2da;
    private boolean cabezaGrupo;
    private int rankingFIFA;
    private List<Jugador> plantel;
    private DirectorTecnico directorTecnico;
    private List<CuerpoTecnico> cuerpoTecnico;


    public Seleccion() {
        this("", "", "", false, 0, null);
        this.plantel = new ArrayList<Jugador>();
        this.cuerpoTecnico = new ArrayList<CuerpoTecnico>();
    }

    public Seleccion(String federacion, String camiseta_1ra, String camiseta_2da, boolean cabezaGrupo, int rankingFIFA, DirectorTecnico dt) {
        this.federacion = federacion;
        this.camiseta_1ra = camiseta_1ra;
        this.camiseta_2da = camiseta_2da;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
        this.plantel = new ArrayList<Jugador>();
        this.directorTecnico = dt;
        this.cuerpoTecnico = new ArrayList<CuerpoTecnico>();

    }

    public String getFederacion() {
        return federacion;
    }
    public void setFederacion(String Federacion) {
        this.federacion = Federacion;
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
    public void setJugadores(List<Jugador> jugadores){ this.plantel = jugadores;}
    public void agregarJugador(Jugador j){
        this.plantel.add(j);
    }
    public void asignarDt(DirectorTecnico dt){ this.directorTecnico = dt; }
    public void setCuerpoTecnico(List<CuerpoTecnico> cuerpoTecnico){
        this.cuerpoTecnico = cuerpoTecnico;
    }
    public void agregarCuerpoTecnico(CuerpoTecnico cp){
        this.cuerpoTecnico.add(cp);
    }
}
