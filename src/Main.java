import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Consumivel bolo =
                new BoloComRiceCrisps(
                new BoloComCobertura(
                new BoloComRecheio(
                new Bolo(37.95, 2000, "Ele é um bolo", "Bolo de Fubá", 20000))));

        System.out.println(bolo.getNome());
        System.out.println(bolo.getPreco());

    }
}
