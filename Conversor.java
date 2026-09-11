// Ejercicio 2: Conversor
public class Conversor {
    public double convertir(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public double convertir(int kilometros) {
        return kilometros * 0.621371;
    }
    
    public void convertir(int segundos, String tipo) {
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;
        System.out.println(minutos + " minutos y " + segundosRestantes + " segundos");
    }
    
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        System.out.println(conversor.convertir(25.0));
        System.out.println(conversor.convertir(10));
        conversor.convertir(150, "tiempo");
    }
}
