package com.sistemamundial.funcionalidades;

import com.sistemamundial.modelos.torneo.*;
import com.sistemamundial.modelos.personas.*;
import com.sistemamundial.modelos.partido.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudSedes {
    private List<Sede> sedes;
    private Scanner sc;

    public CrudSedes(){
        sedes = new ArrayList<>();
        sc = new Scanner(System.in);
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
        //variables auxiliares
        String nombrePais;
        Pais pais = null;
        boolean flag = false;
        //atributos
        String ciudad;
        float alturaNivelMar;
        String clima;
        String zonaHoraria;

        System.out.println("-- Creacion de sede --");
        while(!flag){
            System.out.println("Por favor, ingrese el nombre del pais de la sede a crear (0 para cancelar): ");
            nombrePais = sc.nextLine();
            if(nombrePais.equals("0")){
                System.out.println("Creacion cancelada. No se realizaron modificaciones.");
                return;
            }
            for(int i = 0; i < paises.size(); i++){
                if(paises.get(i).getNombre().equals(nombrePais)){
                  pais = paises.get(i);
                  flag = true;
                  break;
                }
            }
            if (!flag) {
                System.out.println("Pais no encontrado, vuelva a intentarlo.");
            }
        }

        System.out.print("Definir ciudad de la sede:");
        ciudad = sc.nextLine();

        System.out.print("Definir altura a nivel del mar (usar punto en los decimales): ");
        while(true){
            String aux = sc.nextLine();
            try{alturaNivelMar = Float.parseFloat(aux);
                break;
                }
            catch (NumberFormatException e){
                System.out.println("Error, vuelva a intentarlo.");
            }
        }

        System.out.print("Definir clima: ");
        clima = sc.nextLine();

        System.out.print("Definir zona horaria: ");
        zonaHoraria = sc.nextLine();

        sedes.add(new Sede(ciudad, alturaNivelMar, clima, zonaHoraria, pais));

    }

}
