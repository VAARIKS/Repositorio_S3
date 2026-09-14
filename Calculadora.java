// Ejercicio 1: Calculadora
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    public double sumar(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.sumar(10, 20));
        System.out.println(calc.sumar(10, 20, 30));
        System.out.println(calc.sumar(10.5, 20.8));
    }
}
