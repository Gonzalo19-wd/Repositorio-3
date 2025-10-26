
package ordenacion;
import java.util.Arrays;

public class Ordenacion {

    public static void main(int[] arr) {
        int n = arr.length;

        // Iniciamos con un gap grande y lo reducimos a la mitad cada vez
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Aplicamos una especie de "insertion sort" pero con salto 'gap'
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;

                // Mover elementos que están gap posiciones atrás
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {8, 5, 3, 7, 6, 2, 4, 1};

        System.out.println("Antes:  " + Arrays.toString(numeros));
        main(numeros);
        System.out.println("Después: " + Arrays.toString(numeros));
    }
}

