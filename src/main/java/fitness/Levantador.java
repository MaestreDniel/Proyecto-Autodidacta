package fitness;

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
        return "Levantador: {" +
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
}
