package com.sistemamundial.modelos.torneo;
import com.sistemamundial.modelos.personas.Arbitro;

import java.util.List;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private String bandera;

    //asociaciones
    private Seleccion seleccion;
    private List<Arbitro> arbitros;
    private List<Sede> sedes;

    public Pais() {
        this("", "", null);
    }

    public Pais(String nombre, String bandera, Seleccion seleccion) {
        this.nombre = nombre;
        this.bandera = bandera;
        this.seleccion = seleccion; // Asociacion 0..1 validar antes de usar.
        this.arbitros = new ArrayList<Arbitro>();
        this.sedes = new ArrayList<Sede>();
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

    public Seleccion getSeleccion(){ return seleccion;}
    public void setSeleccion(Seleccion seleccion){ this.seleccion = seleccion; }

    public void setArbitros(ArrayList<Arbitro> arbitros){ this.arbitros = arbitros;}
    public void agregarArbitro(Arbitro a){ this.arbitros.add(a);}
    public List<Arbitro> getArbitros() {
        return arbitros;
    }

    public List<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(List<Sede> sedes) {
        this.sedes = sedes;
    }
    public void agregarSede(Sede sede){
        this.sedes.add(sede);
    }
}
