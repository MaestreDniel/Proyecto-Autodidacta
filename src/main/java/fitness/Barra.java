package fitness;

import java.util.Scanner;

public class Barra extends Peso {
    private int bending;

    public int getBending() {
        return bending;
    }

    public void setBending(int bending) {
        this.bending = bending; // Controlar setter. El "bending" depende de cuánto peso se carga en la barra.
    }

    public Barra() {

    }

    public Barra(int idobjeto, double kg, int bending) {
        super(idobjeto, kg);
        this.bending = bending;
    }

    @Override
    public String toString() {
        return "\nBarra: {" +
                "idobjeto=" + getIdobjeto() +
                ", kg=" + getKg() +
                ", bending=" + bending +
                '}';
    }

}
