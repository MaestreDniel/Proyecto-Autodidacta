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
        return "Gimnasio: {" +
                "idgym=" + idgym +
                ", listaInscritos=" + listaInscritos +
                ", listaPesas=" + listaPesas +
                '}';
    }

    public void pesasPorDefecto(Gimnasio gym) {
        for (int i = 0; i < Menu.getListaGimnasios().size(); i++) {
            if (Menu.getListaGimnasios().get(i).equals(gym)) {
                gym.getListaPesas().add(new Barra(1, 20, 0));
                System.out.println("El gimnasio queda así: " + gym);
            } else {
                System.out.println("EPIC FAIL");
            }
        }

    }
}
