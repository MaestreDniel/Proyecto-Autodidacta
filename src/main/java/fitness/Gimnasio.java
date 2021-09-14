package fitness;

import java.util.ArrayList;
import java.util.Scanner;

public class Gimnasio {
    private int idgym;
    private ArrayList<Persona> listaInscritos = new ArrayList<>();
    private ArrayList<Peso> listaPesas = new ArrayList<>();

    public int getIdgym() {
        return idgym;
    }

    public void setIdgym(int idgym) {
        this.idgym = idgym;
    }

    public ArrayList<Persona> getListaInscritos() {
        return listaInscritos;
    }

    public void setListaInscritos(ArrayList<Persona> listaInscritos) {
        this.listaInscritos = listaInscritos;
    }

    public ArrayList<Peso> getListaPesas() {
        return listaPesas;
    }

    public void setListaPesas(ArrayList<Peso> listaPesas) {
        this.listaPesas = listaPesas;
    }

    public Gimnasio() {

    }

    public Gimnasio(int idgym, ArrayList<Persona> listaInscritos, ArrayList<Peso> listaPesas) {
        this.idgym = idgym;
        this.listaInscritos = listaInscritos;
        this.listaPesas = listaPesas;
    }

    @Override
    public String toString() {
        return "\nGimnasio: {" +
                "idgym=" + idgym +
                ",\nlistaInscritos=" + listaInscritos +
                ",\nlistaPesas=" + listaPesas +
                '}';
    }

    public void anadirMaterial(Gimnasio gym) {
        System.out.print("¿Barra (1), disco (2) o mancuerna (3)? ");
        Scanner resp = new Scanner(System.in);
        int r = resp.nextInt();

        if (r == 1) {
            int id = listaPesas.size() + 1; // De esta manera cada objeto podrá tener su propio id automáticamente
            gym.getListaPesas().add(new Barra(id, 20, 0, 0, 0, true));
            System.out.println("El gimnasio queda así: " + gym);
        } else if (r == 2) {
            /* Los discos pueden tener unos pesos y colores determinados, así que guardo esos valores en
            arrays y después accedo a ellos según el tipo de disco que se quiera añadir al gimnasio. */
            double[] pesos = {25, 20, 15, 10, 5, 2.5, 2, 1.5, 1, 0.5};
            String[] colores = {"rojo", "azul", "amarillo", "verde", "blanco", "rojo", "azul", "amarillo", "verde", "blanco"};
            int id = listaPesas.size() + 1;
            System.out.print("""
                    Un disco de competición puede ser:\s
                                        
                    - 1.ROJO (25 kg) - 6.ROJO mini (2,5 kg)
                    - 2.AZUL (20 kg) - 7.AZUL mini (2 kg)
                    - 3.AMARILLO (15 kg) - 8.AMARILLO mini (1,5 kg)
                    - 4.VERDE (10 kg) - 9.VERDE mini (1 kg)
                    - 5.BLANCO (5 kg) - 10.BLANCO mini (0,5 kg)
                                        
                    """);

            System.out.print("Elige un número: ");

            Scanner dis = new Scanner(System.in);
            int p = dis.nextInt() - 1;
            gym.getListaPesas().add(new Disco(id, colores[p], pesos[p], true));
            System.out.println("El gimnasio queda así: " + gym);
        }
    }

    public Barra asignarBarra(Gimnasio gym) {
        Barra barra = null;
        for (int i = 0; i < gym.getListaPesas().size(); i++) {
            if (gym.getListaPesas().get(i) instanceof Barra) {
                barra = (Barra) gym.getListaPesas().get(i);
                System.out.println("Prueba. Esta es la barra: " + barra);
                break;
            }
        }
        if (barra == null) {
            System.out.println("No se ha podido encontrar la barra.\n" +
                    "Asegúrate de que tu gimnasio tiene este material disponible.");
        }
        return barra;
    }

    public Disco asignarDisco(Gimnasio gym) {
        Disco disco1 = null;
        Disco disco2 = null;
        double[] pesos = {25, 20, 15, 10, 5, 2.5, 2, 1.5, 1, 0.5};

        System.out.print("""
                    Estos son los distintos discos:\s
                                        
                    - 1.ROJO (25 kg) - 6.ROJO mini (2,5 kg)
                    - 2.AZUL (20 kg) - 7.AZUL mini (2 kg)
                    - 3.AMARILLO (15 kg) - 8.AMARILLO mini (1,5 kg)
                    - 4.VERDE (10 kg) - 9.VERDE mini (1 kg)
                    - 5.BLANCO (5 kg) - 10.BLANCO mini (0,5 kg)
                                        
                    """);

        System.out.print("Elige un número para escoger tu disco (los discos se cargarán en la barra por pares): ");

        Scanner dis = new Scanner(System.in);
        int p = dis.nextInt() - 1;

        boolean disc = false;

        /* Se va asignando un posible disco y luego se comprueba si ese disco es realmente el que
        el usuario ha pedido. Una vez se encuentra el correcto, el booleano auxiliar disc se vuelve verdadero. */
        for (int i = 0; i < gym.getListaPesas().size(); i++) {
            if (gym.getListaPesas().get(i) instanceof Disco) {
                disco1 = (Disco) gym.getListaPesas().get(i);
                if (disco1.getKg() == pesos[p] && disco1.isDisponible()) {
                    System.out.println("Prueba. Este es el disco: " + disco1);
                    disc = true;
                    disco1.setDisponible(false);
                    break;
                }
                disco1 = null;
            }
        }
        if (!disc) {
            System.out.println("No se ha podido encontrar el disco.\n" +
                    "Asegúrate de que tu gimnasio tiene este material disponible.");
        }
        return disco1;
    }

    public Levantador asignarLevantador(Gimnasio gym) {
        Levantador levantador = null;
        System.out.println("Esta es la lista de levantadores inscritos en este gimnasio: " + gym.getListaInscritos());
        System.out.println("Introduce el dni del levantador que quieres: ");
        Scanner quien = new Scanner(System.in);
        String nif = quien.nextLine();
        for (int i = 0; i < gym.getListaInscritos().size(); i++) {
            if (gym.getListaInscritos().get(i) instanceof Levantador && levantador.getDni().equals(nif)) {
                levantador = (Levantador) gym.getListaInscritos().get(i);
                System.out.println("Levantador escogido: " + levantador);
                break;
            }
        }
        return levantador;
    }

    public Barra cargarBarra(Gimnasio gym) {
        Barra barra = asignarBarra(gym);
        Disco disco = asignarDisco(gym);
        Disco disco2 = asignarDisco(gym);
        if (disco != null && disco2 != null) {
            barra.setLado1(disco.getKg());
            barra.setLado2(disco2.getKg());
            System.out.println("Se ha cargado la barra: " + barra);
        } else {
            System.out.println("Parece que no se han podido asignar los discos correctamente.");
        }
        System.out.println("¡Este método es un poco más complejo y sigue en desarrollo!");
        return barra;
    }

    public void levantamientoBarra(Gimnasio gym) {
        if (cargarBarra(gym) != null) {
            System.out.println("Estás a punto de hacer el levantamiento. Debes escoger al levantador.");
            asignarLevantador(gym);
        }
    }
}
