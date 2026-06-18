package com.sistemamundial.funcionalidades;
import com.sistemamundial.modelos.torneo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaMundial {
    private Scanner sc;
    private Mundial mundial;
    private List<Pais> paises;
    private String nombrePais;

    public SistemaMundial(){
        paises = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public int leerEntero(String m) {
        System.out.print(m);
        String aux;
        while (true) {
            aux = sc.nextLine();
            try {
                return Integer.parseInt(aux);
            } catch (NumberFormatException e) {
                System.out.println("Error de ingreso, vuelva a intentarlo.");
                System.out.print(m);
            }
        }
    }
    /**
     * Ejecuta la secuencia de arranque (Bootstrap) del sistema, estableciendo
     * el estado inicial del torneo y sus entidades principales.
     * * El proceso de configuración se divide en dos fases secuenciales:
     * <ul>
     * <li><b>Fase 1 (Datos del Mundial):</b> Captura la información global y
     * construye el objeto central {@link Mundial}.</li>
     * <li><b>Fase 2 (Países Participantes):</b> Realiza el sembrado de datos (Seeding)
     * registrando a las 32 selecciones que conformarán el torneo.</li>
     * </ul>
     * * @implNote Para la Fase 1, utiliza la herramienta de consola segura {@code leerEntero()}
     * para garantizar la integridad del flujo de entrada numérico. En la Fase 2,
     * implementa el patrón de Carga Diferida (Lazy Loading): los objetos {@link Pais}
     * se instancian únicamente con su nombre, reservando los atributos secundarios
     * (director técnico, plantel) como cadenas vacías o nulos para ser gestionados
     * posteriormente a través del menú principal.
     */
    public void configInicial() {

        System.out.println("Bienvenido/a a la configuracion inicial.");
        System.out.println("Primera fase: Datos del mundial");

        int anio = leerEntero("Definir año de celebración: ");
        System.out.print("Definir nombre de mascota: ");
        String mascota = sc.nextLine();
        int fechaDesde = leerEntero("Definir fecha de inicio: ");
        int fechaHasta = leerEntero("Definir fecha de finalización: ");

        mundial = new Mundial(anio, mascota, fechaDesde, fechaHasta);
        System.out.println("Sistema inicializado.");

        System.out.println("Segunda fase: paises participantes.");
        System.out.println("Ingrese los datos para los 32 paises participantes.");
        for(int i = 0; i < 32; i++){
            System.out.println("--- Pais "+(i+1)+" ---");
            System.out.print("Nombre: ");
            nombrePais = sc.nextLine();
            paises.add(new Pais(nombrePais, "", null));
        }
        System.out.println("Paises cargados. Configuracion inicial completada.");
    }

    public void menuPrincipal(){
        boolean salir = false;
        while(!salir){
            System.out.println("--Sistema de Gestion para Mundial--");
            System.out.println("1. Gestion de sedes/estadios");
            System.out.println("2. Gestion de selecciones");
            System.out.println("3. Gestion del torneo");
            System.out.println("4. Informes varios");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            String opcion = sc.nextLine();

            switch (opcion){
                case "1":
                    menuSedes();
                    break;
                case "2":
                    menuSeleccion();
                    break;
                case "3":
                    System.out.println("Mostrando menu torneo.");
                    break;
                case "4":
                    System.out.println("Mostrando menu informes.");
                    break;
                case "5":
                    salir = true;
                    System.out.println("Fin de sesion.");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        }
    }

    private void menuSedes(){
        boolean salir = false;
        while(!salir){
            System.out.println("--Menu sedes/estadios--");
            System.out.println("1. Administrar sedes.");
            System.out.println("2. Administrar estadios.");
            System.out.println("3. Volver al menu principal.");
            System.out.print("Opcion: ");
            String opcion = sc.nextLine();

            switch (opcion){
                case "1", "2":
                    System.out.println("A implementar.");
                    break;
                case "3":
                    salir = true;
                    break;
                default:
                    System.out.println("Ingresar opcion valida.");
            }
        }

    }

    private void menuSeleccion(){
        boolean salir = false;
        while(!salir){
            System.out.println("--Menu de Selecciones--");
            System.out.println("1. Registrar seleccion.");
            System.out.println("2. Gestionar seleccion.");
            System.out.println("3. Volver al menu principal");
            System.out.print("Opcion: ");
            String opcion = sc.nextLine();

            switch (opcion){
                case "1", "2":
                    System.out.println("A implementar");
                    break;
                case "3":
                    salir = true;
                    break;
                default:
                    System.out.println("Ingresar opcion valida.");
            }
        }
    }
}