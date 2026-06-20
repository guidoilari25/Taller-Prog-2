package com.sistemamundial.modelos.torneo;

import com.sistemamundial.modelos.partido.Partido;

import java.util.ArrayList;
import java.util.List;

public class Fase {
    private NombreFase fase;

    //asociaciones
    private List<Grupo> grupos;
    private List<Partido> partidos;

    //constructores

    public Fase() {
        this(null);
    }

    public Fase(NombreFase fase){
        this.fase = fase;
        this.grupos = new ArrayList<Grupo>();
        this.partidos = new ArrayList<Partido>();
    }

    //setters, getters
    public NombreFase getNombreFase() {
        return fase;
    }
    public void setNombreFase(NombreFase fase) {
        this.fase = fase;
    }

    public List<Grupo> getGrupos(){ return this.grupos; }
    public void setGrupo(List<Grupo> grupos){ this.grupos = grupos; }
    public void agregarGrupo(Grupo grupo){
        this.grupos.add(grupo);
    }

    public List<Partido> getPartidos(){ return this.partidos; }
    public void setPartidos(List<Partido> partidos){
        this.partidos = partidos;
    }
    public void agregarPartido(Partido partido){
        this.partidos.add(partido);
    }


}
