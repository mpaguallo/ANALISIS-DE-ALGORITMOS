// ==============================================
//        PROGRAMA: Algoritmo de Cambio
//        Descripción: Calcula el cambio óptimo
//        usando monedas de 100, 25, 10, 5 y 1
// ==============================================

import java.util.*;

public class Cambio {

    // ========================================================
    // Método: devolverCambio
    // Descripción: Devuelve una lista con las monedas usadas
    // para dar un cambio exacto usando un enfoque voraz
    // Parámetro: n - cantidad total para dar cambio
    // ========================================================
    public static List<Integer> devolverCambio(int n) {
        int[] C = {100, 25, 10, 5, 1}; // Monedas disponibles
        List<Integer> S = new ArrayList<>(); // Lista de monedas usadas (solución)
        int s = 0; // Suma acumulada hasta el momento

        while (s != n) {
            int x = -1;

            // Elegimos la moneda más grande que aún no sobrepasa el total
            for (int coin : C) {
                if (s + coin <= n) {
                    x = coin;
                    break;
                }
            }

            // Si no se puede avanzar, no hay solución válida
            if (x == -1) {
                System.out.println("⚠️ No se encontró una solución válida.");
                return S;
            }

            // Agregamos la moneda seleccionada y actualizamos la suma
            S.add(x);
            s += x;
        }

        return S;
    }

    // =========================================
    // Método principal
    // =========================================
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada del usuario
        System.out.println("💰 CALCULADORA DE CAMBIO 💰");
        System.out.print("Ingrese una cantidad entera para calcular el cambio: ");
        int n = scanner.nextInt();

        // Cálculo del cambio
        List<Integer> resultado = devolverCambio(n);

        // Salida formateada
        System.out.println("\n====================================");
        System.out.println("     🧾 Resultado del cambio para " + n);
        System.out.println("====================================");
        System.out.print("Monedas utilizadas: ");
        for (int moneda : resultado) {
            System.out.print(moneda + " ");
        }

        System.out.println("\nTotal de monedas: " + resultado.size());
        System.out.println("====================================");
    }
}
