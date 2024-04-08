package factoryMethod;

import Singelton.MenuSingelton;
import core.Alimento;
import core.tipos.Cantidad;
import core.tipos.Origen;

import java.util.List;

public class PlatoAnimal extends PlatoFactory{

    public PlatoAnimal(Cantidad macro, Cantidad micro) {
        super();
        this.crearPlato(macro, micro);
    }

    @Override
    protected void seleccionarProteina(Cantidad cantidad){
        Alimento alimento = this.selectRandomAlimento("PROTEINA", Origen.ANIMAL);
        alimento.calcGramos(cantidad);

        this.addMacronutriente(alimento);
        System.out.println("Se ha agregado un nuevo macronutriente al plato: " + alimento);
    }

    @Override
    protected void seleccionarVerdura(Cantidad cantidad){
        Alimento alimento = this.selectRandomAlimento("VERDURA", Origen.VEGETAL);
        alimento.calcGramos(cantidad);

        this.addCarbohidrato(alimento);
        System.out.println("Se ha agregado un nuevo macronutriente al plato: " + alimento);
    }

    @Override
    protected void seleccionarGrasaVegetal(Cantidad cantidad){
        Alimento alimento = this.selectRandomAlimento("GRASAVEGETAL", Origen.VEGETAL);
        alimento.calcGramos(cantidad);

        this.addMacronutriente(alimento);
        System.out.println("Se ha agregado un nuevo macronutriente al plato: " + alimento);
    }

}
