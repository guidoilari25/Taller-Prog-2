package modelos.torneo;

import modelos.partido.Estadio;

import java.util.ArrayList;
import java.util.List;

public class Sede {
    private String ciudad;
    private float alturaNivelMar;
    private String clima;
    private String zonaHoraria;

    //asociaciones
    private Pais pais;
    private List<Estadio> estadios;

    public Sede() {
        this("", 0, "", "", null);
    }

    public Sede(String ciudad, float alturaNivelMar, String clima, String zonaHoraria, Pais pais) {
        this.ciudad = ciudad;
        this.alturaNivelMar = alturaNivelMar;
        this.clima = clima;
        this.pais = pais;
        this.zonaHoraria = zonaHoraria;
        this.estadios = new ArrayList<Estadio>();
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getAlturaNivelMar() {
        return alturaNivelMar;
    }
    public void setAlturaNivelMar(float alturaNivelMar) {
        this.alturaNivelMar = alturaNivelMar;
    }

    public String getClima() {
        return clima;
    }
    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }
    public void setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public Pais getPais(){
        return this.pais;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }

    public void setEstadios(List<Estadio> estadios){
        this.estadios = estadios;
    }
    public void agregarEstadio(Estadio estadio){
        this.estadios.add(estadio);
    }
    public List<Estadio> getEstadios(){
        return this.estadios;
    }
}
