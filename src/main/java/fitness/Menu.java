package fitness;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Proyecto Autodidacta
 *
 * @author Daniel Maestre Hermoso
 * @version 0.1
 * Fecha de inicio: 23/06/2021
 * Aplicación con POO para simular la trayectoria de los levantadores.
 */

public class Menu {

    private static final ArrayList<Gimnasio> listaGimnasios = new ArrayList<>();

    public static ArrayList<Gimnasio> getListaGimnasios() {
        return listaGimnasios;
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
                System.out.print("""
                                            
                        ------------MENU------------\s
                                            
                        1 - Inscribir a una persona.
                        2 - Entrenamiento. (Pendiente)
                        3 - LMAO.
                        4 - Crea un gimnasio. (Pendiente)
                        5 - INFO: Estado actual.
                        6 - Añade material.
                        0 - Salir.
                                            
                        """);

                System.out.print("Escribe una de las opciones: ");
                opcion = menu.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("""
                                            
                        ------------INSCRIPCIONES------------\s
                                            
                        1. Inscribe a un levantador.
                        2. Inscribe a un entrenador. (Pendiente)
                        3. Salir de inscripciones.
                                            
                        """);

                        System.out.print("Escribe una de las opciones: ");
                        Scanner sc = new Scanner(System.in);
                        int inscripcion = sc.nextInt();
                        if (inscripcion == 1) {
                            Levantador l = new Levantador();
                            l.inscribirPersona(gymAsign);
                        } else if (inscripcion == 2) {
                            Entrenador e = new Entrenador();
                            e.inscribirPersona(gymAsign);
                        } else {
                            System.out.println("Volviendo al menú principal.");
                        }
                    }

                    case 2 -> {
                        System.out.println("En construcción. Vamos a cargar una barra: ");
                        gymAsign.levantamientoBarra(gymAsign);
                    }

                    case 3 -> System.out.println("LMAO, soy horrible y aún no hago nada.");

                    case 4 -> System.out.println("Elegida opción 4. Aún no hago nada.");
                    //crearGimnasio();

                    case 5 -> {
                        System.out.println("Hay " + getListaGimnasios().size() + " gimnasio/s.");
                        System.out.println("Estos son los gimnasios: " + getListaGimnasios());
                    }

                    case 6 -> gymAsign.anadirMaterial(gymAsign);

                    case 0 -> {
                        System.out.println("Cerrando menú principal.");
                        salir = true;
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
