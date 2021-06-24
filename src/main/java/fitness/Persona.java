package fitness;

public abstract class Persona {
    private String dni;
    private double altura;
    private double peso;
    private int edad;
    private String nombre;
    private String apellido;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona() {

    }

    public Persona(String dni, double altura, double peso, int edad, String nombre, String apellido) {
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
