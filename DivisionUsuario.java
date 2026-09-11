// Ejercicio 8: DivisionUsuario
import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionUsuario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Ingrese el primer número: ");
            int numero1 = teclado.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int numero2 = teclado.nextInt();
            int resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar números enteros.");
        } finally {
            teclado.close();
        }
    }
}
