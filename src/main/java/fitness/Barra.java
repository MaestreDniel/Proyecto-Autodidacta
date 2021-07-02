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

    @Override
    public Barra solicitarDatos(Gimnasio gym) {
        //Barra barra = null;
        /*try {
            barra = new Barra();
            System.out.println("Escribe el id de la barra: ");
            Scanner datos = new Scanner(System.in);
            int id = datos.nextInt();
            barra.setIdobjeto(id);

            System.out.println("¿Cuántos kg pesa? ");
            double kg = datos.nextDouble();
            barra.setKg(kg);


        } catch (Exception e) {
            System.out.println("Error al introducir datos. ¡Asegúrate de introducirlos bien!");
        }*/
        return null;
    }
}
