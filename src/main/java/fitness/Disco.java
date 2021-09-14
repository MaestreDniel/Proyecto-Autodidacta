package fitness;

public class Disco extends Peso {
    private String color;
    private boolean disponible;

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Disco() {

    }

    public Disco(int idobjeto, String color, double kg, boolean disponible) {
        super(idobjeto, kg);
        this.color = color;
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "\nDisco: {" +
                "idobjeto=" + getIdobjeto() +
                ", kg=" + getKg() +
                ", color=" + color +
                ", disponible?=" + disponible +
                '}';
    }
}
