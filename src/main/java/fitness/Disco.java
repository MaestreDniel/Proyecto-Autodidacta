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

    public Disco(int idobjeto, double kg) {
        super(idobjeto, kg);
    }

    @Override
    public String toString() {
        return "Disco: {" +
                "idobjeto=" + getIdobjeto() +
                ", kg=" + getKg() +
                ", color=" + color +
                '}';
    }
}
