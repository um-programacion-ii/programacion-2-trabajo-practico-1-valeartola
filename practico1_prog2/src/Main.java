//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("AB123CD", "Toyota", 2020, 1000,  5));
        vehiculos.add(new Auto("AC857DF", "Peugeot", 2023, 1000,  5 ));
        vehiculos.add(new Vehiculo("AA859HT", "Renault", 2018, 1100));
        vehiculos.add(new Vehiculo("AF378VA", "Citroen", 2024, 1500));
        vehiculos.add(new Camion("AD777GH", "Volvo", 2021, 5000, true));
        vehiculos.add(new Camion("AA426TD", "Merecedes", 2022, 5000, false));
        vehiculos.add(new Auto("AF243KI", "Fiat", 2019, 1000, 5));

        for (Vehiculo v : vehiculos) {
            VehiculoPrinter.imprimir(v);
        }

    }
}


