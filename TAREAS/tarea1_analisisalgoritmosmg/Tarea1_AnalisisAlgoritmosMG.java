
package tarea1_analisisalgoritmosmg;

public class Tarea1_AnalisisAlgoritmosMG {

public static void main(String[] args) {
        // Datos quemados
        int[] A = {2, 5, 8, 12, 1, 3, 7, 10};
        // Definimos los índices de los subarreglos
        // p = inicio del primer subarreglo
        // q = fin del primer subarreglo
        // r = fin del segundo subarreglo
        int p = 0;
        int q = 3;  // A[0] hasta A[3] → {2, 5, 8, 12} (ordenado)
        int r = 7;  // A[4] hasta A[7] → {1, 3, 7, 10} (ordenado)

        // Título del método empleado
        System.out.println("************************************************************");
        System.out.println("            🌟 Método de Fusión (Merge Sort) 🌟              ");
        System.out.println("************************************************************");

        // Mensaje decorado antes de la fusión
        System.out.println("-Estado inicial del arreglo:");
        mostrarArreglo(A);
        System.out.println("============================================================");

        // Llamamos al método merge para fusionar los subarreglos
        merge(A, p, q, r);

        // Mensaje decorado después de la fusión
        System.out.println("¡Arreglo fusionado con éxito!");
        System.out.println("-El nuevo arreglo ordenado es:");
        mostrarArreglo(A);
        System.out.println("============================================================\n");
    }

    // Método para combinar dos subarreglos ordenados
    public static void merge(int[] A, int p, int q, int r) {
        // Tamaño de los subarreglos
        int nL = q - p + 1;  // Longitud del primer subarreglo
        int nR = r - q;      // Longitud del segundo subarreglo

        // Arreglos auxiliares para almacenar los subarreglos
        int[] L = new int[nL];
        int[] R = new int[nR];

        // Copiamos los elementos del primer subarreglo en L
        for (int i = 0; i < nL; i++) {
            L[i] = A[p + i];
        }

        // Copiamos los elementos del segundo subarreglo en R
        for (int j = 0; j < nR; j++) {
            R[j] = A[q + 1 + j];
        }

        // Inicializamos los índices para los subarreglos
        int i = 0, j = 0, k = p;

        // Fusionamos los elementos de L y R de manera ordenada
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        // Si quedan elementos en L, los agregamos al arreglo final
        while (i < nL) {
            A[k] = L[i];
            i++;
            k++;
        }

        // Si quedan elementos en R, los agregamos al arreglo final
        while (j < nR) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    // Método para mostrar el contenido de un arreglo
    public static void mostrarArreglo(int[] arreglo) {
        // Mostramos el arreglo de manera ordenada
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();  // Salto de línea para mejorar la presentación
    }
}
