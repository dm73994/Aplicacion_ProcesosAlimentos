package core;

import core.tipos.Cantidad;
import core.tipos.Origen;
import core.tipos.TipoNutriente;
import core.tipos.TipoVerdura;

public class Verdura extends Alimento {
    private final String nombre;

    public Verdura(String nombre) {
        super(Origen.VEGETAL);
        this.nombre = nombre;
    }

    public Verdura(String nombre, Double cantidadBaja, Double cantidadMedia, Double cantidadAlta, TipoNutriente nutriente) {
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
