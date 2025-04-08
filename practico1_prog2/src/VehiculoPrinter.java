public class VehiculoPrinter {
    public static void imprimir(Vehiculo v) {
        System.out.print(v.getTipo() + ": ");

        System.out.print("Patente: " + v.getPatente() + ", ");
        System.out.print("Marca: " + v.getMarca() + ", ");
        System.out.print("Año: " + v.getAnio() + ", ");
        System.out.print("Capacidad de carga (kg): " + v.getCapacidadCargaKg());

        if (v instanceof Camion) {
            Camion c = (Camion) v;
            System.out.print(", Tiene acoplado: " + (c.isTieneAcoplado() ? "Sí" : "No"));
        }

        if (v instanceof Auto) {
            Auto a = (Auto) v;
            System.out.print(", Pasajeros: " + a.getCantidadPasajeros());
        }

        System.out.println(); // salto de línea
    }
}




