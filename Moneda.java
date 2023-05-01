package models;

/**
 *
 * @author chanp
 */
public class Moneda {
    private int id;
    private String nombreMoneda;
    private String simbolo;
    private double valorPesos;

    public Moneda() {
    }

    public Moneda(int id, String nombreMoneda, String simbolo, double valorPesos) {
        this.id = id;
        this.nombreMoneda = nombreMoneda;
        this.simbolo = simbolo;
        this.valorPesos = valorPesos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public double getValorPesos() {
        return valorPesos;
    }

    public void setValorPesos(double valorPesos) {
        this.valorPesos = valorPesos;
    }

    @Override
    public String toString() {
        return "Monedas{" + "id=" + id + ", nombreMoneda=" + nombreMoneda + ", simbolo=" + simbolo + ", valorPesos=" + valorPesos + '}';
    }
    
    
}
