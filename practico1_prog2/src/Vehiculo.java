public class Vehiculo {
    protected String patente;
    protected String marca;
    protected int anio;
    private double capacidadCargaKg;

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg){
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula.");
        }
        if (anio < 1900 || anio > 2025) { // Se usa 2025 como año máximo
            throw new IllegalArgumentException("El año debe estar entre 1900 y 2025.");
        }

        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser un valor positivo.");
        }
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
    public String getTipo() {
        return "Vehículo";
    }

}
