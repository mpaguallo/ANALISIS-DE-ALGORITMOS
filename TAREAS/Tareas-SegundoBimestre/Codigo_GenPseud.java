// ==============================================
//        PROGRAMA: Codigo_GenPseud
//        Descripción: Generador de números pseudoaleatorios
//        usando el método de congruencia lineal
// ==============================================

public class Codigo_GenPseud {

    // ========================================================
    // Método principal
    // Descripción: Ejecuta el generador y muestra los resultados
    // ========================================================
    public static void main(String[] args) {
        int cantidad = 10;           // Cantidad de números a generar
        long semilla = 24685;        // Valor inicial (semilla)

        // Generar números pseudoaleatorios
        double[] numeros = generarPseudoaleatorios(semilla, cantidad);

        // ==============================
        // Mostrar resultados con estilo
        // ==============================
        System.out.println("🎲✨ GENERADOR PSEUDOALEATORIO ✨🎲");
        System.out.println("🔧 Semilla utilizada: " + semilla);
        System.out.println("🔢 Cantidad generada: " + cantidad);
        System.out.println("\n📈 Números pseudoaleatorios generados:");
        System.out.println("---------------------------------------");

        int index = 1;
        for (double num : numeros) {
            System.out.printf("🔹 %2d → %.10f%n", index, num);
            index++;
        }

        System.out.println("---------------------------------------");
        System.out.println("✅ Generación completada exitosamente.");
    }

    // ========================================================
    // Método: generarPseudoaleatorios
    // Descripción: Implementa un generador congruencial lineal
    // Parámetros:
    //   - semilla: valor inicial
    //   - cantidad: cuántos números generar
    // Retorna: arreglo de valores normalizados entre [0,1]
    // ========================================================
    public static double[] generarPseudoaleatorios(long semilla, int cantidad) {
        // Parámetros estándar (Numerical Recipes)
        long a = 1664525;           // Multiplicador
        long c = 1013904223;        // Incremento
        long m = (long) Math.pow(2, 32); // Módulo (2^32)

        double[] resultados = new double[cantidad];
        long x = semilla;           // Valor actual

        for (int i = 0; i < cantidad; i++) {
            x = (a * x + c) % m;                    // Fórmula principal
            resultados[i] = (double) x / m;         // Normalización [0,1]
        }

        return resultados;
    }
}

