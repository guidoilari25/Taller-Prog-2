package com.sistemamundial.funcionalidades.requerimientos;

import com.sistemamundial.modelos.torneo.*;
import com.sistemamundial.utilidades.Control;
import java.util.ArrayList;
import java.util.List;

public class CrudSedes {
    private List<Sede> sedes;
    Control control;

    public CrudSedes(){
        sedes = new ArrayList<>();
        control = new Control();
    }

    public void crearSede(ArrayList<Pais> paises){
        System.out.println("-- Creacion de sede --");

        Pais pais = control.buscarPais(paises);

        if(pais == null){
            System.out.println("Creacion cancelada. No se realizaron modificaciones.");
            return;
        }

        System.out.println("Pais seleccionado: "+pais.getNombre());

        String ciudad = control.leerString("Definir ciudad de la sede:");
        float alturaNivelMar = (float)control.validarDatoNumerico("Definir altura a nivel del mar (usar punto en los decimales): ", 'f');
        String clima = control.leerString("Definir clima: ");
        String zonaHoraria = control.leerString("Definir zona horaria: ");

        sedes.add(new Sede(ciudad, alturaNivelMar, clima, zonaHoraria, pais));
    }
}
