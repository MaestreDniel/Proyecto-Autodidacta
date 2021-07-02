package fitness;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Proyecto Autodidacta
 *
 * @author Daniel Maestre Hermoso
 * @version 0.01
 * Fecha de inicio: 23/06/2021
 * Aplicación con POO para simular la trayectoria de los levantadores.
 */

public class Menu {

    private static ArrayList<Gimnasio> listaGimnasios = new ArrayList<>();

    public static ArrayList<Gimnasio> getListaGimnasios() {
        return listaGimnasios;
    }

    public static void setListaGimnasios(ArrayList<Gimnasio> listaGimnasios) {
        Menu.listaGimnasios = listaGimnasios;
    }

    public void primerGimnasio() {
        Gimnasio gimnasio = new Gimnasio();
        gimnasio.setIdgym(1);
        getListaGimnasios().add(gimnasio);
        System.out.println("Se ha creado un primer gimnasio vacío: " + gimnasio);
    }

    public static void main(String[] args) {
        System.out.println("Aplicación con POO para simular la trayectoria de los levantadores.");
        Gimnasio gimnasio;
        Menu menu = new Menu();
        menu.primerGimnasio();
        gimnasio = Menu.getListaGimnasios().get(0);
        menu.menu(gimnasio);
    }


    public void menu(Gimnasio gymAsign) {
        try {
            Scanner menu = new Scanner(System.in);
            boolean salir = false;
            int opcion;

            while (!salir) {
                System.out.println("\n--------MENU--------");
                System.out.println("1 - Inscribir a una persona. (Pendiente)");
                System.out.println("2 - Entrenamiento. (Pendiente)");
                System.out.println("3 - Salir.");
                System.out.println("4 - Crea un gimnasio. (Pendiente)");
                System.out.println("5 - Prueba de añadir pesas.");
                System.out.println("6 - INFO: Estado actual.");
                System.out.println("7 - Añade material manualmente");
                System.out.print("Escribe una de las opciones: ");
                opcion = menu.nextInt();

                //gimnasio.inscribirPersona();
                switch (opcion) {
                    case 1 -> System.out.println("Elegida opción 1. Aún no hago nada.");
                    case 2 -> System.out.println("Elegida opción 2. Aún no hago nada.");
                    case 3 -> {
                        System.out.println("Cerrando menú principal.");
                        salir = true;
                    }
                    case 4 -> {
                        System.out.println("Elegida opción 4. Aún no hago nada.");
                        //crearGimnasio();
                    }
                    case 5 -> {
                        gymAsign.pesasPorDefecto(gymAsign);
                    }

                    case 6 -> {
                        System.out.println("Hay " + getListaGimnasios().size() + " gimnasios.");
                        System.out.println("Estos son los gimnasios: " + getListaGimnasios());
                    }

                    case 7 -> {
                        gymAsign.anadirMaterial(gymAsign);
                    }

                    default -> {
                        System.out.println("No existe esa opción.");
                        System.out.println("¡Deberías entrenar en vez de poner opciones que no existen!");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al introducir opción.");
            menu(gymAsign);
        }

    }
}
