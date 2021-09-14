package fitness;

import java.util.Scanner;

public class Barra extends Peso {
    private int bending;
    private double lado1;
    private double lado2; // Los lados de la barra se cargan con los discos
    private boolean disponible;

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public int getBending() {
        return bending;
    }

    public void setBending(int bending) {
        this.bending = bending; // Controlar setter. El "bending" depende de cuánto peso se carga en la barra.
    }

    public Barra() {

    }

    public Barra(int idobjeto, double kg, double lado1, double lado2, int bending, boolean disponible) {
        super(idobjeto, kg);
        this.bending = bending;
    }

    @Override
    public String toString() {
        return "\nBarra: {" +
                "idobjeto=" + getIdobjeto() +
                ", kg=" + getKg() +
                ", lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", bending=" + bending +
                '}';

    }

    /*public boolean cargadaCorrecta() {
        if (lado1 == lado2) {
            return true;
        }
        System.out.println("Debes cargar ambos lados de la barra de forma simétrica antes de levantarla.");
        return false;
    }*/
}
