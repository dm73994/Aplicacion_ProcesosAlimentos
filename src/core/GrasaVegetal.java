package core;

import core.tipos.Cantidad;
import core.tipos.Origen;
import core.tipos.TipoGrasaVegetal;
import core.tipos.TipoNutriente;

public class GrasaVegetal extends Alimento {

    private String nombre;

    public GrasaVegetal(String nombre) {
        super(Origen.VEGETAL);
        this.nombre = nombre;
    }

    public GrasaVegetal(String nombre, Double cantidadBaja, Double cantidadMedia, Double cantidadAlta, TipoNutriente nutriente) {
        super(cantidadBaja, cantidadMedia, cantidadAlta, Origen.VEGETAL, nutriente);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\n" + this.nombre + "\n\t" +
                gramos + "gr\n\t" +
                "origen " + origen + "\n\t" +
                nutriente + "\n";
    }
}
