import Singelton.MenuSingelton;
import core.tipos.Cantidad;
import factoryMethod.PlatoVegetal;

public class App {
    public static void main(String[] args) throws Exception {
        MenuSingelton menu = MenuSingelton.getInstance();
        System.out.println(menu);
        PlatoVegetal plato = new PlatoVegetal(Cantidad.ALTO, Cantidad.BAJO);
        System.out.println(plato.obtenerPlato());
    }
}
