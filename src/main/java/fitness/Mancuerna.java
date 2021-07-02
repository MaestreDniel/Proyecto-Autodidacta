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
    public Peso solicitarDatos(Gimnasio gym) {
        return null;
    }

    @Override
    public String toString() {
        return "\nMancuerna: {" +
                "idobjeto=" + getIdobjeto() +
                ", kg=" + getKg() +
                ", efectoStamina=" + efectoStamina +
                '}';
    }
}
