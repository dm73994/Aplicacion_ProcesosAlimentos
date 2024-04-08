package core;

import core.tipos.Cantidad;
import core.tipos.Nutrientes;
import core.tipos.Origen;
import core.tipos.TipoNutriente;

public class Alimento implements Nutrientes {
    protected Double gramos;
    protected Origen origen;
    protected Racion raciones;
    protected TipoNutriente nutriente;

    public Alimento(Origen origen) {
        this.gramos = 0.0;
        this.origen = origen;
    }

    public Alimento(Racion racion, Origen origen, TipoNutriente nutriente) {
        this.gramos = 0.0;
        this.raciones = racion;
        this.origen = origen;
        this.nutriente = nutriente;
    }

    public Alimento(Double cantidadBaja, Double cantidadMedia, Double cantidadAlta, Origen origen, TipoNutriente nutriente) {
        this.gramos = 0.0;
        this.raciones = new Racion(cantidadBaja, cantidadMedia, cantidadAlta);
        this.origen = origen;
        this.nutriente = nutriente;
    }

    @Override
    public Double calcGramos(Cantidad cantidad) {
        switch (cantidad) {
            case ALTO -> setGramos(this.raciones.getRacionAlta());
            case BAJO -> setGramos(this.raciones.getRacionBaja());
            default -> setGramos(this.raciones.getRacionMedia());
        }
        return this.gramos;
    }

    public void setGramos(Double gramos) {
        this.gramos = gramos;
    }

    public Origen getOrigen() {
        return origen;
    }

}
