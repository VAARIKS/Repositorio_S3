// Ejercicio 7: Division
public class Division {
    public void dividir(int numero1, int numero2) {
        try {
            int resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.dividir(10, 2);
        division.dividir(10, 0);
    }
}
