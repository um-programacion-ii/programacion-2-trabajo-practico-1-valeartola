public class Vehiculo {
    protected String patente;
    protected String marca;
    protected int anio;
    private double capacidadCargaKg;

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg){
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getDescripcion() {
        return "Vehículo: " + patente + " " + marca + " " + anio + " " + capacidadCargaKg;
    }
}
