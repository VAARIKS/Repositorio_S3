// Ejercicio 10: Archivo
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
    public void leerArchivo(String nombreArchivo) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while ((linea = lector.readLine()) != null) {
            System.out.println(linea);
        }
        lector.close();
    }

    public static void main(String[] args) {
        Archivo archivo = new Archivo();
        try {
            archivo.leerArchivo("datos.txt");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
