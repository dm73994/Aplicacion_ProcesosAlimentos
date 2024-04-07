package core;

import core.tipos.Cantidad;
import core.tipos.Origen;
import core.tipos.TipoGrasaVegetal;

public class GrasaVegetal extends Alimento {

    private TipoGrasaVegetal nombre;

    public GrasaVegetal(TipoGrasaVegetal nombre, Cantidad cantidad, Double gramos, Origen origen) {
        super(cantidad, gramos, origen);
        this.nombre = nombre;
    }

    @Override
    public Double calcGramos() {
        return 0.0;
    }

}
