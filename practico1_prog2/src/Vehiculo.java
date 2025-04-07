public class Vehiculo {
    protected String patente;
    protected String marca;
    protected int anio;
    protected int capacidadCargaKg;

    public Vehiculo(String patente, String marca, int anio, int capacidadCargaKg){
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

    public int getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(int capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }

}
