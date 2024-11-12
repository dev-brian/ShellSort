import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ShellSort {

    public static int[] shellSort(int[] datos) {
        int n = datos.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = datos[i];
                int j;
                System.out.println("Considerando elemento " + temp + " en posición " + i);
                for (j = i; j >= gap && datos[j - gap] > temp; j -= gap) {
                    System.out.println("Moviendo elemento " + datos[j - gap] + " de posición " + (j - gap) + " a posición " + j);
                    datos[j] = datos[j - gap];
                }
                datos[j] = temp;
                System.out.println("Colocando elemento " + temp + " en posición " + j);
                imprimirMatriz(datos);
            }
        }
        return datos;
    }

    public static void imprimirMatriz(int[] datos) {
        System.out.println("----------------------- \n Valores del arreglo");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("i:" + i + " datos[i]:" + datos[i]);
        }
        System.out.println("----------------------- \n");
    }

    public static int[] leerArreglo(String archivo) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(archivo));
        ArrayList<Integer> listaDatos = new ArrayList<>();
        String linea;

        System.out.println("Lectura de datos del archivo");
        while ((linea = buffer.readLine()) != null) {
            listaDatos.add(Integer.parseInt(linea.trim()));
        }
        buffer.close();

        int[] datos = new int[listaDatos.size()];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = listaDatos.get(i);
        }
        return datos;
    }

    public static void main(String[] args) throws IOException {
        int[] datos;
        String archivo = "C:\\Users\\elrob\\OneDrive\\Documentos\\Universidad\\UTT\\4toCuatrimestre\\EDA\\Tercer Parcial\\shellSort\\numeros.txt"; // Especifica la ruta del archivo
        
        datos = leerArreglo(archivo);
        datos = shellSort(datos);
    }
}
