package core;

public class Racion {
    private Double racionBaja;
    private Double racionMedia;
    private Double racionAlta;

    public Racion(Double racionBaja, Double racionMedia, Double racionAlta) {
        this.racionBaja = racionBaja;
        this.racionMedia = racionMedia;
        this.racionAlta = racionAlta;
    }

    public Double getRacionBaja() {
        return racionBaja;
    }

    public void setRacionBaja(Double racionBaja) {
        this.racionBaja = racionBaja;
    }

    public Double getRacionMedia() {
        return racionMedia;
    }

    public void setRacionMedia(Double racionMedia) {
        this.racionMedia = racionMedia;
    }

    public Double getRacionAlta() {
        return racionAlta;
    }

    public void setRacionAlta(Double racionAlta) {
        this.racionAlta = racionAlta;
    }

    @Override
    public String toString() {
        return "Racion{" +
                "racionBaja=" + racionBaja +
                ", racionMedia=" + racionMedia +
                ", racionAlta=" + racionAlta +
                '}';
    }
}
