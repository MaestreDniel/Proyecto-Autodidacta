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

    public void pesasPorDefecto(Gimnasio gym) {
        int id = listaPesas.size() + 1;
        for (int i = 0; i < Menu.getListaGimnasios().size(); i++) {
            if (Menu.getListaGimnasios().get(i).equals(gym)) {
                gym.getListaPesas().add(new Barra(id, 20, 0));
                System.out.println("El gimnasio queda así: " + gym);
            } else {
                System.out.println("EPIC FAIL");
            }
        }

    }

    public void anadirMaterial(Gimnasio gym) {
        System.out.print("¿Barra (1), disco (2) o mancuerna (3)? ");
        Scanner resp = new Scanner(System.in);
        int r = resp.nextInt();

        if (r == 1) {
            Barra barra = new Barra();
            int id = listaPesas.size() + 1; // De esta manera cada objeto podrá tener su propio id automáticamente
            barra.setIdobjeto(id);
            barra.setKg(20);
            gym.getListaPesas().add(barra);
            System.out.println("El gimnasio queda así: " + gym);
        } else if (r == 2) {
            Disco disco = new Disco();
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
               
                    Elige un número: """);

            Scanner dis = new Scanner(System.in);
            int p = dis.nextInt()-1;
            disco.setIdobjeto(id);
            disco.setColor(colores[p]);
            disco.setKg(pesos[p]);
            gym.getListaPesas().add(disco);
            System.out.println("El gimnasio queda así: " + gym);
        }
    }
}
