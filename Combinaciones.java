
package ordenacion;
import java.util.*;

public class Combinaciones {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        List<Integer> actual = new ArrayList<>();
        generarCombinaciones(numeros, 0, actual);
    }

    static void generarCombinaciones(int[] nums, int inicio, List<Integer> actual) {
        // Mostrar la combinación actual
        System.out.println(actual);

        // Intentar agregar más elementos
        for (int i = inicio; i < nums.length; i++) {
            actual.add(nums[i]);  // Elegir un elemento
            generarCombinaciones(nums, i + 1, actual); // Llamada recursiva
            actual.remove(actual.size() - 1); // Backtrack (deshacer la elección)
        }
    }
}