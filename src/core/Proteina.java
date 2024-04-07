package core;

import core.tipos.Cantidad;
import core.tipos.Origen;
import core.tipos.TipoProteina;

public class Proteina extends Alimento {
    private TipoProteina nombre;

    Proteina(TipoProteina nombre, Cantidad cantidad, Double gramos, Origen origen) {
        super(cantidad, gramos, origen);
        this.nombre = nombre;
    }

    @Override
    public Double calcGramos() {
        return 0.0;
    }
}
