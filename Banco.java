// Ejercicio 4: Banco
public class Banco {
    static double tasaInteres = 5.0;

    public static void actualizarTasa(double nuevaTasa) {
        tasaInteres = nuevaTasa;
    }

    public static void mostrarTasa() {
        System.out.println("Tasa de interés: " + tasaInteres + "%");
    }

    public static void main(String[] args) {
        Banco.mostrarTasa();
        Banco.actualizarTasa(6.5);
        Banco.mostrarTasa();
    }
}
