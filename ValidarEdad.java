// Ejercicio 9: ValidarEdad
public class ValidarEdad {
    public void verificarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("La edad debe ser mayor o igual a 18.");
        }
        System.out.println("Edad válida.");
    }

    public static void main(String[] args) {
        ValidarEdad validar = new ValidarEdad();
        try {
            validar.verificarEdad(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
