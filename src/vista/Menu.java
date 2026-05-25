package vista;
import java.util.Scanner;

public class Menu {
    private final Scanner sc;

    public Menu(){
        this.sc = new Scanner(System.in);
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
