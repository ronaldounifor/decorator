public abstract class Decoracao implements Consumivel {
    private Consumivel consumivel;

    public Consumivel getConsumivel() {
        return consumivel;
    }

    public void setConsumivel(Consumivel consumivel) {
        this.consumivel = consumivel;
    }
}
