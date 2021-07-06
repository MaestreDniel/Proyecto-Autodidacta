package fitness;

public abstract class Peso {
    private int idobjeto;
    private double kg;

    public int getIdobjeto() {
        return idobjeto;
    }

    public void setIdobjeto(int idobjeto) {
        this.idobjeto = idobjeto;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public Peso() {

    }

    public Peso(int idobjeto, double kg) {
        this.idobjeto = idobjeto;
        this.kg = kg;
    }

}
