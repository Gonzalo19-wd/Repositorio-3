package ordenacion;
import java.util.Scanner;

public class busquedaLineal {

    // Método que realiza la búsqueda lineal
    public static int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i; // devuelve el índice donde se encontró
            }
        }
        return -1; // no se encontró
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {10, 25, 30, 45, 60, 75, 90};

        System.out.print("Ingrese el número que desea buscar: ");
        int valor = sc.nextInt();

        int posicion = busquedaLineal(numeros, valor);

        if (posicion != -1) {
            System.out.println("✅ Número encontrado en la posición: " + posicion);
        } else {
            System.out.println("❌ El número no se encuentra en el arreglo.");
        }

        sc.close();
    }
}