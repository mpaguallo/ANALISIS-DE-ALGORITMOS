// ╔════════════════════════════════════════════════════════════════════════════╗
// ║     ✨ Generador Congruencial Lineal - Taller de Pseudoaleatorios ✨        ║
// ║          Universidad Técnica Particular de Loja - Escuela de CC            ║
// ╚════════════════════════════════════════════════════════════════════════════╝

import java.util.*;

public class GeneradorCongruencialLineal {

    // ════════════════════════════════════════════════════════════════
    // 🔢 Parámetros del Generador Congruencial Lineal (GCL)
    // ════════════════════════════════════════════════════════════════
    private static final long A = 1664525;
    private static final long C = 1013904223;
    private static final long M = (long) Math.pow(2, 32);  // 2^32

    public static void main(String[] args) {

        // ════════════════════════════════════════════════════════════════
        // 📥 Entrada del usuario: Semilla inicial
        // ════════════════════════════════════════════════════════════════
        Scanner scanner = new Scanner(System.in);
        System.out.print("🔹 Ingrese una semilla entera positiva: ");
        long semilla = scanner.nextLong();
        scanner.close();

        // ════════════════════════════════════════════════════════════════
        // 🔁 Generación de 100 números pseudoaleatorios normalizados
        // ════════════════════════════════════════════════════════════════
        List<Double> numeros = new ArrayList<>();
        long xn = semilla;

        for (int i = 0; i < 100; i++) {
            xn = (A * xn + C) % M;
            double ri = (double) xn / M;
            numeros.add(ri);
        }

        // ════════════════════════════════════════════════════════════════
        // 📋 Mostrar los primeros 10 valores generados
        // ════════════════════════════════════════════════════════════════
        System.out.println("\n📊 Primeros 10 números generados:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("r[%02d] = %.6f%n", i + 1, numeros.get(i));
        }

        // ════════════════════════════════════════════════════════════════
        // 📊 Análisis de distribución por intervalos [0.0, 1.0)
        // ════════════════════════════════════════════════════════════════
        int[] frecuencias = new int[5]; // 5 intervalos: [0.0–0.2), ..., [0.8–1.0)

        for (double r : numeros) {
            if      (r < 0.2) frecuencias[0]++;
            else if (r < 0.4) frecuencias[1]++;
            else if (r < 0.6) frecuencias[2]++;
            else if (r < 0.8) frecuencias[3]++;
            else              frecuencias[4]++;
        }

        // ════════════════════════════════════════════════════════════════
        // 📈 Mostrar análisis de frecuencias
        // ════════════════════════════════════════════════════════════════
        String[] rangos = { "[0.0, 0.2)", "[0.2, 0.4)", "[0.4, 0.6)", "[0.6, 0.8)", "[0.8, 1.0)" };
        System.out.println("\n📈 Distribución de frecuencias:");
        for (int i = 0; i < rangos.length; i++) {
            System.out.printf("%-12s : %2d números%n", rangos[i], frecuencias[i]);
        }

        // ════════════════════════════════════════════════════════════════
        // 🧠 Reflexión sugerida
        // ════════════════════════════════════════════════════════════════
        System.out.println("\n🧠 Reflexión:");
        System.out.println("¿La distribución es aproximadamente uniforme? 🤔");
        System.out.println("¿Qué efecto tiene cambiar la semilla? 🔄");
    }
}
