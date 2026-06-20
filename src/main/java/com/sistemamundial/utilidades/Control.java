package com.sistemamundial.utilidades;
import com.sistemamundial.modelos.torneo.Pais;
import java.util.ArrayList;
import java.util.Scanner;

public class Control {
    private static final Scanner sc = new Scanner(System.in);

    public static Pais buscarPais(ArrayList<Pais> paises) {
        String nombrePais;

        while (true) {
            System.out.println("Por favor, ingrese el nombre del pais:");
            nombrePais = sc.nextLine();

            if (nombrePais.equals("0")) {
                return null;
            }

            for (Pais p : paises) {
                if (p.getNombre().equalsIgnoreCase(nombrePais)) {
                    return p;
                }
            }
            System.out.println("Pais no encontrada, vuelva a intentarlo");
        }
    }

    public static double validarDatoNumerico(String m, char tipo) {
        System.out.print(m);
        while (true) {
            String aux = sc.nextLine();
            try {
                switch (tipo) {
                    case 'i':
                        return Integer.parseInt(aux);
                    case 'f':
                        return Float.parseFloat(aux);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error de ingreso, vuelva a intentarlo.");
                System.out.print(m);
            }
        }
    }

    public static String leerString(String m){
        System.out.print(m);
        return sc.nextLine();
    }
}
