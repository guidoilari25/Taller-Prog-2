package com.sistemamundial.modelos.torneo;
import com.sistemamundial.modelos.personas.*;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    //atributos propios
    private String federacion;
    private String camiseta_1ra;
    private String camiseta_2da;
    private boolean cabezaGrupo;
    private int rankingFIFA;
    //Asociaciones
    private Pais pais;//asociacion pais
    private Grupo grupo; //asociacion grupo
    private List<Jugador> plantel; // asociacion jugador
    private List<DirectorTecnico> directorTecnico; //asociacion dt
    private List<CuerpoTecnico> cuerpoTecnico; //asociacion cuerpotecnico
    private List<Participacion> participaciones; //asociacion participacion

    //constructores
    public Seleccion() {
        this("", "", "", false, 0, null, null);
    }

    public Seleccion(String federacion, String camiseta_1ra, String camiseta_2da, boolean cabezaGrupo, int rankingFIFA,
                     Pais pais, Grupo grupo) {
        this.federacion = federacion;
        this.camiseta_1ra = camiseta_1ra;
        this.camiseta_2da = camiseta_2da;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
        this.pais = pais;
        this.grupo = grupo;
        this.plantel = new ArrayList<Jugador>();
        this.directorTecnico = new ArrayList<DirectorTecnico>();
        this.cuerpoTecnico = new ArrayList<CuerpoTecnico>();
        this.participaciones = new ArrayList<Participacion>();

    }

    //getters, setters
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

    public Pais getPais(){ return this.pais; }
    public void setPais(Pais pais){ this.pais = pais; }

    public Grupo getGrupo(){ return this.grupo; }
    public void setGrupo(Grupo grupo){ this.grupo = grupo; }

    public void setJugadores(List<Jugador> jugadores){ this.plantel = jugadores;}
    public void agregarJugador(Jugador j){
        this.plantel.add(j);
    }
    public List<Jugador> getPlantel() {return plantel;}

    public void SetDirectorTecnico(List<DirectorTecnico> directorTecnico){ this.directorTecnico = directorTecnico; }
    public void agregarDirectorTecnico(DirectorTecnico directorTecnico){
        this.directorTecnico.add(directorTecnico);
    }
    public List<DirectorTecnico> getDirectorTecnico(){
        return directorTecnico;
    }

    public void setCuerpoTecnico(List<CuerpoTecnico> cuerpoTecnico){
        this.cuerpoTecnico = cuerpoTecnico;
    }
    public void agregarCuerpoTecnico(CuerpoTecnico cp){
        this.cuerpoTecnico.add(cp);
    }
    public List<CuerpoTecnico> getCuerpoTecnico(){
        return cuerpoTecnico;
    }

    public void setParticipaciones(List<Participacion> participaciones){
        this.participaciones = participaciones;
    }
    public void agregarParticipacion(Participacion participacion){
        this.participaciones.add(participacion);
    }
    public List<Participacion> getParticipaciones(){
        return participaciones;
    }
}
