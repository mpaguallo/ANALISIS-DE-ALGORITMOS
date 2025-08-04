// ==============================================
//        PROGRAMA: Codigo_Strassen
//        Descripción: Multiplicación de matrices 2x2
//        usando el algoritmo de Strassen
// ==============================================

public class Codigo_Strassen {

    // ========================================================
    // Método: multiplicar
    // Descripción: Multiplica dos matrices 2x2 usando Strassen
    // Parámetros: A y B - matrices de tamaño 2x2
    // Retorno: Matriz C resultante de la multiplicación
    // ========================================================
    public static int[][] multiplicar(int[][] A, int[][] B) {
        int[][] C = new int[2][2]; // Matriz resultado

        // =======================
        // Productos intermedios
        // =======================
        int M1 = (A[0][0] + A[1][1]) * (B[0][0] + B[1][1]);
        int M2 = (A[1][0] + A[1][1]) * B[0][0];
        int M3 = A[0][0] * (B[0][1] - B[1][1]);
        int M4 = A[1][1] * (B[1][0] - B[0][0]);
        int M5 = (A[0][0] + A[0][1]) * B[1][1];
        int M6 = (A[1][0] - A[0][0]) * (B[0][0] + B[0][1]);
        int M7 = (A[0][1] - A[1][1]) * (B[1][0] + B[1][1]);

        // ===============================
        // Cálculo final de la matriz C
        // ===============================
        C[0][0] = M1 + M4 - M5 + M7;
        C[0][1] = M3 + M5;
        C[1][0] = M2 + M4;
        C[1][1] = M1 - M2 + M3 + M6;

        return C;
    }

    // ========================================================
    // Método principal
    // ========================================================
    public static void main(String[] args) {
        int[][] A = {
                {1, 3},
                {5, 7}
        };
        int[][] B = {
                {8, 4},
                {6, 2}
        };


        System.out.println("🧮✨ MULTIPLICACIÓN DE MATRICES 2x2 ✨🧮");
        System.out.println("🔢 Usando el algoritmo de Strassen\n");

        System.out.println("📌 Matriz A:");
        imprimirMatriz(A);

        System.out.println("\n📌 Matriz B:");
        imprimirMatriz(B);

        int[][] C = multiplicar(A, B);

        System.out.println("\n✅ Resultado de A × B:");
        imprimirMatriz(C);

        System.out.println("\n📦 Multiplicación completada con éxito.");
    }

    // Método auxiliar para imprimir matrices 2x2
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            System.out.print("│ ");
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("│");
        }
    }
}
