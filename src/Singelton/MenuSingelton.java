package Singelton;

import core.Alimento;
import core.GrasaVegetal;
import core.Proteina;
import core.Verdura;
import core.tipos.Origen;
import core.tipos.TipoNutriente;
import core.tipos.TipoProteina;

import java.util.ArrayList;
import java.util.List;

public class MenuSingelton {
    public List<Proteina> proteinas;
    public List<Verdura> verduras;
    public List<GrasaVegetal> grasasVegetales;
    private static MenuSingelton menu;

    private MenuSingelton(){
        this.proteinas = new ArrayList<>();
        this.verduras = new ArrayList<>();
        this.grasasVegetales = new ArrayList<>();

        proteinas.add(new Proteina("Tofu",  50.0, 100.0, 150.0, Origen.VEGETAL, TipoNutriente.MACRONUTRIENTE));
        proteinas.add(new Proteina("Lentejas",  50.0, 100.0, 150.0, Origen.VEGETAL, TipoNutriente.MACRONUTRIENTE));
        proteinas.add(new Proteina("Pollo",  100.0, 150.0, 200.0, Origen.ANIMAL, TipoNutriente.MACRONUTRIENTE));
        proteinas.add(new Proteina("Salmón",  80.0, 120.0, 180.0, Origen.ANIMAL, TipoNutriente.MACRONUTRIENTE));
        proteinas.add(new Proteina("Carne de res magra",  50.0, 100.0, 150.0, Origen.ANIMAL, TipoNutriente.MACRONUTRIENTE));

        grasasVegetales.add(new GrasaVegetal("Aceite de oliva",  5.0, 15.0, 25.0, TipoNutriente.MACRONUTRIENTE));
        grasasVegetales.add(new GrasaVegetal("Aguacate",  25.0, 50.0, 75.0, TipoNutriente.MACRONUTRIENTE));
        grasasVegetales.add(new GrasaVegetal("Aceite de coco",  5.0, 15.0, 25.0, TipoNutriente.MACRONUTRIENTE));
        grasasVegetales.add(new GrasaVegetal("Aceitunas",  10.0, 30.0, 50.0, TipoNutriente.MACRONUTRIENTE));

        verduras.add(new Verdura("Espárragos",  50.0, 100.0, 150.0, TipoNutriente.CARBOHIDRATO));
        verduras.add(new Verdura("Espinaca",  50.0, 100.0, 150.0, TipoNutriente.CARBOHIDRATO));
        verduras.add(new Verdura("Zanahoria",  40.0, 80.0, 120.0, TipoNutriente.CARBOHIDRATO));
        verduras.add(new Verdura("Brócoli",  50.0, 100.0, 150.0, TipoNutriente.CARBOHIDRATO));

    }

    public static MenuSingelton getInstance(){
        if(menu == null)
            menu = new MenuSingelton();
        return menu;
    }



    @Override
    public String toString() {
        return "MenuSingelton{" +
                "proteinas=" + proteinas +
                ", verduras=" + verduras +
                ", grasasVegetales=" + grasasVegetales +
                '}';
    }
}
