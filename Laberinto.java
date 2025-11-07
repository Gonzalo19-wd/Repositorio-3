package ordenacion;

public class Laberinto {
    static int[][] lab = {
        {1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}
    };
    static int N = 4;

    public static void main(String[] args) {
        int[][] solucion = new int[N][N];
        if (resolver(0, 0, solucion))
            imprimir(solucion);
        else
            System.out.println("No hay camino");
    }

    static boolean resolver(int x, int y, int[][] sol) {
        if (x == N-1 && y == N-1) { // caso base: llegada
            sol[x][y] = 1;
            return true;
        }

        if (esSeguro(x, y)) {
            sol[x][y] = 1;
            if (resolver(x + 1, y, sol)) return true; // abajo
            if (resolver(x, y + 1, sol)) return true; // derecha
            sol[x][y] = 0; // backtrack
            return false;
        }

        return false;
    }

    static boolean esSeguro(int x, int y) {
        return (x >= 0 && y >= 0 && x < N && y < N && lab[x][y] == 1);
    }

    static void imprimir(int[][] sol) {
        for (int[] fila : sol) {
            for (int val : fila)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
