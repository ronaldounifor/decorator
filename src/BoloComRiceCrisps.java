public class BoloComRiceCrisps extends Decoracao {

    public BoloComRiceCrisps(Consumivel consumivel) {
        setConsumivel(consumivel);
    }

    @Override
    public double getPreco() {
        return super.getConsumivel().getPreco() + 5.55;
    }

    @Override
    public String getNome() {
        return super.getConsumivel().getNome() + " e uma deliciosa crocancia";
    }
}
