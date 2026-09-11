// Ejercicio 5: Auto
public class Auto {
    static class Motor {
        private String tipo;

        public Motor(String tipo) {
            this.tipo = tipo;
        }

        public String obtenerTipoMotor() {
            return tipo;
        }
    }

    public static void main(String[] args) {
        Motor motor = new Motor("V8");
        System.out.println("Tipo de motor: " + motor.obtenerTipoMotor());
    }
}
