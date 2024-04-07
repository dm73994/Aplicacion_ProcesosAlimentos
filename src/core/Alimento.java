package core;

import core.tipos.Cantidad;
import core.tipos.Nutrientes;

public class Alimento implements Nutrientes {
    private Cantidad cantidad;
    private Double gramos;

    public Alimento() {
    }

    public Alimento(Cantidad cantidad, Double gramos) {
        this.cantidad = cantidad;
        this.gramos = gramos;
    }

    @Override
    public Double calcGramos() {
        return 0.0;
    }
}
