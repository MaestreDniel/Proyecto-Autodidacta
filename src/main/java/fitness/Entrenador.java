package fitness;

import java.util.ArrayList;

public class Entrenador extends Persona {
    private ArrayList<Levantador> levantadores = new ArrayList<>();
    private int relacion;

    public ArrayList<Levantador> getLevantadores() {
        return levantadores;
    }

    public void setLevantadores(ArrayList<Levantador> levantadores) {
        this.levantadores = levantadores;
    }

    public int getRelacion() {
        return relacion;
    }

    public void setRelacion(int relacion) {
        this.relacion = relacion;
    }

    public Entrenador(String dni, double altura, double peso, int edad, String nombre, String apellido, ArrayList<Levantador> levantadores, int relacion) {
        super(dni, altura, peso, edad, nombre, apellido);
        this.levantadores = levantadores;
        this.relacion = relacion;
    }

    @Override
    public String toString() {
        return "Entrenador: {" +
                "dni=" + getDni() +
                ", altura=" + getAltura() +
                ", peso=" + getPeso() +
                ", edad=" + getEdad() +
                ", nombre=" + getNombre() +
                ", apellido=" + getApellido() +
                ", levantadores=" + levantadores +
                ", relacion=" + relacion +
                '}';
    }
}
