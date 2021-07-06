package fitness;

public class Disco extends Peso {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Disco() {

    }

    public Disco(int idobjeto, String color, double kg) {
        super(idobjeto, kg);
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nDisco: {" +
                "idobjeto=" + getIdobjeto() +
                ", kg=" + getKg() +
                ", color=" + color +
                '}';
    }
}
