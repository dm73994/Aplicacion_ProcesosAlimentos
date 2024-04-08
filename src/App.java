import Singelton.MenuSingelton;
import core.tipos.Cantidad;
import factoryMethod.Plato;
import factoryMethod.PlatoAnimal;
import factoryMethod.PlatoVegetal;

public class App {
    public static void main(String[] args) throws Exception {

        NecesidadesNutricionales necesidad = NecesidadesNutricionales.PERDER_MEDIANAMENTE_PESO;
        PreferenciaAlimentos preferencia = PreferenciaAlimentos.VEGETARIANO;
        Plato plato = null;

        if(necesidad.equals(NecesidadesNutricionales.PERDER_MEDIANAMENTE_PESO)){
            switch (preferencia){
                case ANIMALES -> plato = new PlatoAnimal(Cantidad.ALTO, Cantidad.ALTO);
                case VEGETARIANO -> plato = new PlatoVegetal(Cantidad.ALTO, Cantidad.ALTO);
            }
        }
        else if(necesidad.equals(NecesidadesNutricionales.PERDER_MUCHO_PESO)){
            switch (preferencia){
                case ANIMALES -> plato = new PlatoAnimal(Cantidad.ALTO, Cantidad.ALTO);
                case VEGETARIANO -> plato = new PlatoVegetal(Cantidad.ALTO, Cantidad.MEDIO);
            }
        }
        else if(necesidad.equals(NecesidadesNutricionales.PERDER_POCO_PESO)){
            switch (preferencia){
                case ANIMALES -> plato = new PlatoAnimal(Cantidad.ALTO, Cantidad.ALTO);
                case VEGETARIANO -> plato = new PlatoVegetal(Cantidad.ALTO, Cantidad.MEDIO);
            }
        }
        else if(necesidad.equals(NecesidadesNutricionales.GANAR_MUCHO_MUSCULO)){
            switch (preferencia){
                case ANIMALES -> plato = new PlatoAnimal(Cantidad.ALTO, Cantidad.ALTO);
                case VEGETARIANO -> plato = new PlatoVegetal(Cantidad.ALTO, Cantidad.ALTO);
            }
        }
        else if(necesidad.equals(NecesidadesNutricionales.GANAR_MEDIANAMENTE_MUSCULO)){
            switch (preferencia){
                case ANIMALES -> plato = new PlatoAnimal(Cantidad.ALTO, Cantidad.ALTO);
                case VEGETARIANO -> plato = new PlatoVegetal(Cantidad.ALTO, Cantidad.MEDIO);
            }
        }
        else if(necesidad.equals(NecesidadesNutricionales.GANAR_POCO_MUSCULO)){
            switch (preferencia){
                case ANIMALES -> plato = new PlatoAnimal(Cantidad.ALTO, Cantidad.ALTO);
                case VEGETARIANO -> plato = new PlatoVegetal(Cantidad.ALTO, Cantidad.MEDIO);
            }
        }

        System.out.println(plato.obtenerPlato());
    }
}
