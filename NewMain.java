package javaapplication87;

public class NewMain {

    public static int busquedaBinaria(int[] matriculas, int matriculaBuscada) {
        int bajo = 0;
        int alto = matriculas.length - 1;

        // Bucle para buscar el valor
        while (bajo <= alto) {
            int medio = (bajo + alto) / 2;  // Calculamos el índice medio

            // Si encontramos la matrícula en el medio
            if (matriculas[medio] == matriculaBuscada) {
                return medio;  // Devolvemos el índice donde se encuentra la matrícula
            }
            // Si la matrícula buscada es mayor que la del medio, buscamos en la mitad superior
            else if (matriculas[medio] < matriculaBuscada) {
                bajo = medio + 1;
            }
            // Si la matrícula buscada es menor que la del medio, buscamos en la mitad inferior
            else {
                alto = medio - 1;
            }
        }

        return -1;  // Retorna -1 si no encuentra la matrícula
    }

    public static void main(String[] args) {
        // Ejemplo de lista de matrículas ordenadas
        int[] matriculas = {1023, 1537, 2054, 3098, 4012, 5674, 6983, 7894};
        int matriculaBuscada = 3098;

        // Llamamos a la función de búsqueda binaria
        int resultado = busquedaBinaria(matriculas, matriculaBuscada);

        // Verificamos el resultado
        if (resultado != -1) {
            System.out.println("Matrícula " + matriculaBuscada + " encontrada en el índice " + resultado + ".");
        } else {
            System.out.println("Matrícula " + matriculaBuscada + " no encontrada.");
        }
    }
}
