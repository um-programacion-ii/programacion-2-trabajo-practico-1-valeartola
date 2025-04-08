public class Camion extends Vehiculo {
    private boolean tieneAcoplado;

    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    @Override
    public String getDescripcion() {
        String acopladoTexto = tieneAcoplado ? " | Tiene acoplado" : " | Sin acoplado";
        return super.getDescripcion() + acopladoTexto;
    }
}

