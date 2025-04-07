public class VehiculoPrinter {
    public void imprimir(Vehiculo vehiculo) {
        System.out.println("Vehículo: " + vehiculo.getPatente() + " " + vehiculo.getMarca() + " " + vehiculo.getAnio() + " " + vehiculo.getCapacidadCargaKg());
    }


}
