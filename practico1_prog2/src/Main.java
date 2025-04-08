//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("AB123CD", "Toyota", 2020, 1000));
        vehiculos.add(new Vehiculo("AC857DF", "Peugeot", 2023, 1000));
        vehiculos.add(new Vehiculo("AA859HT", "Renault", 2018, 1100));
        vehiculos.add(new Vehiculo("AF378VA", "Citroen", 2024, 1500));
        vehiculos.add(new Camion("AD777GH", "Volvo", 2021, 5000, true));
        vehiculos.add(new Camion("AA426TD", "Merecedes", 2022, 5000, false));

        VehiculoPrinter printer = new VehiculoPrinter();

        for (Vehiculo v : vehiculos) {
            printer.imprimir(v);
        }
    }
}


