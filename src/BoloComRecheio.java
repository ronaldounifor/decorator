public class BoloComRecheio extends Decoracao {

    public BoloComRecheio(Consumivel consumivel) {
        setConsumivel(consumivel);
    }

    @Override
    public double getPreco() {
        return super.getConsumivel().getPreco() + 13.5;
    }

    @Override
    public String getNome() {
        return super.getConsumivel().getNome() + " com Recheio";
    }
}
