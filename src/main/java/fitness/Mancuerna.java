package fitness;

public class Mancuerna extends Peso {
    private int efectoStamina;

    public int getEfectoStamina() {
        return efectoStamina;
    }

    public void setEfectoStamina(int efectoStamina) {
        this.efectoStamina = efectoStamina;
    }

    public Mancuerna() {

    }

    public Mancuerna(int idobjeto, double kg) {
        super(idobjeto, kg);
    }

    @Override
    public String toString() {
        return "Mancuerna: {" +
                "idobjeto=" + getIdobjeto() +
                ", kg=" + getKg() +
                ", efectoStamina=" + efectoStamina +
                '}';
    }
}
