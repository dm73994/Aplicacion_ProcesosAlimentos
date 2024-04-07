package core;

import core.tipos.Cantidad;
import core.tipos.Origen;

public class Grasa extends Alimento {

    private GrasaVegetal nombre;

    public Grasa(Cantidad cantidad, Double gramos, GrasaVegetal nombre, Origen origen) {
        super(cantidad, gramos, origen);
        this.nombre = nombre;
    }

    @Override
    public Double calcGramos() {
        return 0.0;
    }
}
