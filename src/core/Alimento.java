package core;

import core.tipos.Cantidad;
import core.tipos.Nutrientes;
import core.tipos.Origen;

public class Alimento implements Nutrientes {
    private Cantidad cantidad;
    private Double gramos;
    private Origen origen;

    public Alimento() {
        this.cantidad = null;
        this.gramos = 0.0;
        this.origen = null;
    }

    public Alimento(Cantidad cantidad, Double gramos, Origen origen) {
        this.cantidad = cantidad;
        this.gramos = gramos;
        this.origen = origen;
    }

    @Override
    public Double calcGramos() {
        return 0.0;
    }
}
