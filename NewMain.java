package javaapplication67;
import java.util.*;
public class NewMain {

    public static void main(String[] args) {
        int[] arr = new int[50];
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            arr[i] = (rand.nextInt(100) + 1);  // Números entre 1 y 100
        }
        System.out.println("Arreglo original: " + Arrays.toString(arr));
        
        // Ordenamos usando Arrays.sort(), que utiliza Dual-Pivot
        Arrays.sort(arr);
        
        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
    }
    
}
