//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehiculo t = new Vehiculo("AB123CD", "Toyota", 2020, 1000);
        t.mostrarInformacion();
        Vehiculo p = new Vehiculo("AC857DF", "Peugeot", 2023, 1000);
        p.mostrarInformacion();
        Vehiculo r = new Vehiculo("AA859HI", "Renault", 2018, 1100);
        r.mostrarInformacion();
        Vehiculo c = new Vehiculo("AF378VA", "Citroen", 2024, 1500);
        c.mostrarInformacion();
    }
}
