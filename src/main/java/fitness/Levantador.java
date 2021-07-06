package fitness;

import java.util.Scanner;

public class Levantador extends Persona {
    private int experiencia;
    private double sentadilla;
    private double banca;
    private double pmuerto;
    private int stamina;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public double getSentadilla() {
        return sentadilla;
    }

    public void setSentadilla(double sentadilla) {
        this.sentadilla = sentadilla;
    }

    public double getBanca() {
        return banca;
    }

    public void setBanca(double banca) {
        this.banca = banca;
    }

    public double getPmuerto() {
        return pmuerto;
    }

    public void setPmuerto(double pmuerto) {
        this.pmuerto = pmuerto;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Levantador() {

    }

    public Levantador(String dni, double altura, double peso, int edad, String nombre, String apellido, int experiencia, double sentadilla, double banca, double pmuerto, int stamina) {
        super(dni, altura, peso, edad, nombre, apellido);
        this.experiencia = experiencia;
        this.sentadilla = sentadilla;
        this.banca = banca;
        this.pmuerto = pmuerto;
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "\nLevantador: {" +
                "dni=" + getDni() +
                ", altura=" + getAltura() +
                ", peso=" + getPeso() +
                ", edad=" + getEdad() +
                ", nombre=" + getNombre() +
                ", apellido=" + getApellido() +
                ", experiencia=" + experiencia +
                ", sentadilla=" + sentadilla +
                ", banca=" + banca +
                ", pmuerto=" + pmuerto +
                ", stamina=" + stamina +
                '}';
    }

    @Override
    public void inscribirPersona(Gimnasio gym) {
        Levantador levantador = new Levantador();
        System.out.println("Introduce los datos del levantador: ");
        System.out.print("DNI: ");
        Scanner datos = new Scanner(System.in);
        String dni = datos.nextLine();
        System.out.print("Altura en metros (formato: 9,99): ");
        double altura = datos.nextDouble();
        System.out.print("Peso en kg (formato: 99,9): ");
        double peso = datos.nextDouble();
        System.out.print("Edad: ");
        int edad = datos.nextInt();
        Scanner datos2 = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = datos2.nextLine();
        System.out.print("Apellido: ");
        String apellido = datos2.nextLine();
        levantador.setDni(dni);
        levantador.setAltura(altura);
        levantador.setPeso(peso);
        levantador.setEdad(edad);
        levantador.setNombre(nombre);
        levantador.setApellido(apellido);

        System.out.print("""
                ¿Cuál es su nivel de experiencia?\s
                1. Nunca ha entrenado (aprox 0-3 meses)
                2. Principiante (hasta 1,5 años de entrenamiento efectivo)
                3. Intermedio (hasta 3-4 años)
                4. Avanzado (+4 años)
                """);

        System.out.print("Elige una opción: ");

        boolean datosverif = false;
        while (!datosverif) {
            Scanner resp = new Scanner(System.in);
            int xp = resp.nextInt() - 1;

            int[] xps = {0, 50, 150, 300};
            double[] bancas = {0.5, 0.75, 1.15, 1.5};
            double[] sentadillas = {0.7, 1, 1.4, 1.9};
            double[] pmuertos = {0.85, 1.25, 1.6, 2.2};
            int[] staminas = {10, 20, 30, 40};

            if (xp > -1 && xp < 4) {
                levantador.setExperiencia(xps[xp]);
                levantador.setBanca(peso * bancas[xp]);
                levantador.setSentadilla(peso * sentadillas[xp]);
                levantador.setPmuerto(peso * pmuertos[xp]);
                levantador.setStamina(staminas[xp]);
                gym.getListaInscritos().add(levantador);
                System.out.println("Levantador añadido con éxito. Estos son sus datos: " + levantador);
                datosverif = true;
            } else {
                System.out.print("Por favor, introduce bien tu opción: ");
            }
        }
        System.out.println("El gimnasio queda así: " + gym);
    }
}
