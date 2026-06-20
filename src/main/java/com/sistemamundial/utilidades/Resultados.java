package com.sistemamundial.utilidades;

import com.sistemamundial.modelos.torneo.Participacion;
import com.sistemamundial.modelos.torneo.Seleccion;

import java.util.List;

public class Resultados {

    public static char obtenerResultado(Participacion p ){
        List<Participacion> equipos = p.getPartido().getParticipaciones();
        Participacion rival;
        char resultado;

        if(equipos.getFirst().equals(p)){
            rival = equipos.getLast();
        } else {
            rival = equipos.getFirst();
        }

        if(p.cantidadGoles() > rival.cantidadGoles()){
            resultado = 'v';
        } else if(p.cantidadGoles() == rival.cantidadGoles()){
            resultado = 'e';
        } else{
            resultado = 'd';
        }
        return resultado;
    }
}
