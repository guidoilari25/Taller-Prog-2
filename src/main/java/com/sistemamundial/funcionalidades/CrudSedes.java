package com.sistemamundial.funcionalidades;

import com.sistemamundial.modelos.torneo.*;
import com.sistemamundial.modelos.personas.*;
import com.sistemamundial.modelos.partido.*;
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

    /**
     * Inicia el asistente interactivo por consola para registrar una nueva Sede del Mundial.
     * * El método solicita al usuario que vincule la sede a un País existente y luego
     * recopila los datos geográficos de la ciudad. Cuenta con un mecanismo de escape
     * (bailout) que permite cancelar la operación en el primer paso ingresando "0".
     * * @implNote Implementa validación segura de entradas continuas. En el campo de altura
     * sobre el nivel del mar, captura {@link NumberFormatException} y reemplaza
     * automáticamente las comas por puntos para evitar el colapso del escáner.
     * * @param paises Lista que contiene los objetos {@link Pais} registrados previamente en
     * la configuración inicial del sistema. Se utiliza para buscar y enlazar
     * por nombre (ignorando mayúsculas/minúsculas) el país anfitrión.
     */
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
