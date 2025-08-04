// ==============================================
//        PROGRAMA: Codigo_MergeSort
//        Descripción: Implementación del algoritmo
//        de ordenamiento Merge Sort (Ordenamiento por mezcla)
// ==============================================

public class Codigo_MergeSort {

    // ========================================================
    // Método: mergeSort
    // Descripción: Divide recursivamente el arreglo en mitades
    // hasta que los subarreglos sean de tamaño 1 o 0
    // Parámetros: A - arreglo a ordenar
    //             p - índice inicial
    //             r - índice final
    // ========================================================
    public static void mergeSort(int[] A, int p, int r) {
        if (p >= r) {
            return; // Caso base: un solo elemento ya está ordenado
        }

        int q = (p + r) / 2; // Punto medio
        mergeSort(A, p, q);       // Ordenar mitad izquierda
        mergeSort(A, q + 1, r);   // Ordenar mitad derecha
        merge(A, p, q, r);        // Combinar ambas mitades
    }

    // ========================================================
    // Método: merge
    // Descripción: Combina dos subarreglos ordenados en uno solo
    // Parámetros: A - arreglo original
    //             p - índice inicial
    //             q - punto medio
    //             r - índice final
    // ========================================================
    public static void merge(int[] A, int p, int q, int r) {
        int n_L = q - p + 1;   // Tamaño del subarreglo izquierdo
        int n_R = r - q;       // Tamaño del subarreglo derecho

        int[] L = new int[n_L]; // Subarreglo izquierdo
        int[] R = new int[n_R]; // Subarreglo derecho

        // Copiar elementos a subarreglos
        for (int i = 0; i < n_L; i++) {
            L[i] = A[p + i];
        }
        for (int j = 0; j < n_R; j++) {
            R[j] = A[q + 1 + j];
        }

        int i = 0, j = 0, k = p;

        // Combinar los subarreglos L y R en A
        while (i < n_L && j < n_R) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de L (si hay)
        while (i < n_L) {
            A[k] = L[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de R (si hay)
        while (j < n_R) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    // =========================================
    // Método principal: punto de entrada
    // =========================================
    public static void main(String[] args) {
        int[] A = {3, 7, 9, 14, 6, 11, 2}; // Arreglo de ejemplo

        System.out.println("🧠✨ ORDENAMIENTO MERGE SORT ✨🧠");
        System.out.println("Arreglo original:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        // Llamar al método de ordenamiento
        mergeSort(A, 0, A.length - 1);

        // Resultado final
        System.out.println("\n\n✅ Arreglo ordenado con Merge Sort:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n📦 Proceso completado con éxito.");
    }
}
