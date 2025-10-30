package ordenacion;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

    public static int busquedaBinaria(int[] arreglo, int valorBuscado) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2; // posición central

            if (arreglo[medio] == valorBuscado) {
                return medio; // encontrado
            } else if (arreglo[medio] < valorBuscado) {
                inicio = medio + 1; // buscar en la mitad derecha
            } else {
                fin = medio - 1; // buscar en la mitad izquierda
            }
        }

        return -1; // no encontrado
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40};
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        System.out.print("Ingrese el número que desea buscar: ");
        int valor = sc.nextInt();

        int posicion = busquedaBinaria(numeros, valor);

        if (posicion != -1) {
            System.out.println("✅ Número encontrado en la posición: " + posicion);
        } else {
            System.out.println("❌ El número no se encuentra en el arreglo.");
        }

        sc.close();
    }
}