package core;

import core.tipos.Cantidad;
import core.tipos.Origen;
import core.tipos.TipoNutriente;
import core.tipos.TipoProteina;

public class Proteina extends Alimento {
    private String nombre;

    public Proteina(String nombre, Origen origen) {
        super(origen);
        this.nombre = nombre;
    }

    public Proteina(String nombre, Double cantidadBaja, Double cantidadMedia, Double cantidadAlta, Origen origen, TipoNutriente nutriente) {
        super(cantidadBaja, cantidadMedia, cantidadAlta, origen, nutriente);
        this.nombre = nombre;
    }

    public Proteina(Proteina proteina) {
        super(
                proteina.raciones,
                proteina.origen,
                proteina.nutriente
        );
        this.nombre = proteina.nombre;
    }

    @Override
    public String toString() {
        return "\n" + this.nombre + "\n\t" +
                gramos + "gr\n\t" +
                "origen " + origen + "\n\t" +
                nutriente + "\n";
    }
}
