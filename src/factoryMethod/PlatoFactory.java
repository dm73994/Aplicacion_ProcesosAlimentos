package factoryMethod;

import Singelton.MenuSingelton;
import core.Alimento;
import core.Proteina;
import core.tipos.Cantidad;
import core.tipos.Origen;
import core.tipos.TipoNutriente;

import java.util.*;
import java.util.stream.Collectors;

public class PlatoFactory implements Plato{
    protected List<Alimento> macronutrientes;
    protected List<Alimento> carbohidratos;


    public PlatoFactory() {
        this.macronutrientes = new ArrayList<Alimento>();
        this.carbohidratos = new ArrayList<Alimento>();
    }

    protected void seleccionarProteina(Cantidad cantidad){
    }

    protected void seleccionarVerdura(Cantidad cantidad){;
    }

    protected void seleccionarGrasaVegetal(Cantidad cantidad){;
    }

    void crearPlato(Cantidad cantidadMacro, Cantidad cantidadMicro){
        seleccionarProteina(cantidadMacro);
        seleccionarVerdura(cantidadMicro);
        seleccionarGrasaVegetal(cantidadMacro);
    }

    protected void addMacronutriente(Alimento macroAlimento){
        this.macronutrientes.add(macroAlimento);
    }

    protected void addCarbohidrato(Alimento carbohidrato){
        this.carbohidratos.add(carbohidrato);
    }

    /**
     *
     * @param tipoAlimento (proteina, verdura, grasa vegetal)
     * @param origen
     * @return
     */
    protected Alimento selectRandomAlimento(String tipoAlimento, Origen origen){
        MenuSingelton menu = MenuSingelton.getInstance();
        List<Alimento> alimentos = new ArrayList<>();

        switch (tipoAlimento){
            case "PROTEINA" ->
                    alimentos.addAll(
                        menu.proteinas
                                .stream()
                                .filter(a -> a.getOrigen() == origen)
                                .map(Proteina::new)
                                .toList()
                    );
            case "VERDURA" -> alimentos.addAll(menu.verduras);
            case "GRASAVEGETAL" -> alimentos.addAll(menu.grasasVegetales);
        }

        int totalAlimentos = alimentos.size();
        Random random = new Random();
        int number = random.nextInt(totalAlimentos);

        Alimento alimento = alimentos.get(number);
        return alimento;
    }

    @Override
    public String obtenerPlato() {
        return this.toString();
    }

    @Override
    public String toString() {
        
        StringBuilder macro = new StringBuilder();
        StringBuilder carbos = new StringBuilder();

        for (Alimento macronutriente : macronutrientes) {
            macro.append(macronutriente.toString());
            macro.append("\n-------------------------------\n");
        }

        for (Alimento carbohidrato : carbohidratos) {
            carbos.append(carbohidrato.toString());
            carbos.append("\n-------------------------------\n");
        }
        
        return "*************INFORMACIÓN NUTRICIONAL DE SU PLATO*************" +
                macro.toString() +
                carbos.toString();
    }
}
