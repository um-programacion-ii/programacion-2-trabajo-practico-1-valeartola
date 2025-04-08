public class VehiculoPrinter {
    public void imprimir(Vehiculo vehiculo) {
        System.out.print("Vehículo: " + vehiculo.getPatente() + " " + vehiculo.getMarca() + " " + vehiculo.getAnio() + " " + vehiculo.getCapacidadCargaKg());

        if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            if (camion.isTieneAcoplado()) {
                System.out.print(" | Tiene acoplado");
            } else {
                System.out.print(" | Sin acoplado");
            }
        }

        System.out.println();
    }
}


