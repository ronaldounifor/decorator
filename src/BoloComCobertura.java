public class BoloComCobertura extends Decoracao {

    public BoloComCobertura(Consumivel consumivel) {
        setConsumivel(consumivel);
    }

    @Override
    public double getPreco() {
        return super.getConsumivel().getPreco() + 10;
    }

    @Override
    public String getNome() {
        return super.getConsumivel().getNome() + " com Cobertura";
    }
}
