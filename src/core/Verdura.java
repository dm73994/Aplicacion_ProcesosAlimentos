package core;

import core.tipos.Cantidad;
import core.tipos.Origen;
import core.tipos.TipoVerdura;

public class Verdura extends Alimento {
    private TipoVerdura nombre;

    Verdura(TipoVerdura nombre, Cantidad cantidad, Double gramos, Origen origen) {
        super(cantidad, gramos, origen);
        this.nombre = nombre;
    }

    @Override
    public Double calcGramos() {
        return 0.0;
    }
}
