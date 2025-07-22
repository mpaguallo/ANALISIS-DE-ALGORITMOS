// ╔══════════════════════════════════════════════════════════════════════════════╗
// ║        🚀 Algoritmo de Dijkstra con Prueba de Escritorio (Dirigido)         ║
// ╠══════════════════════════════════════════════════════════════════════════════╣
// ║     📌 Muestra paso a paso: nodo actual (V), conjunto C, conjunto S y D[]   ║
// ╚══════════════════════════════════════════════════════════════════════════════╝

import java.util.*;

public class DijkstraConsolaDirigido {

    static final int INF = Integer.MAX_VALUE;
    static final int V = 6; // Número de nodos

    // ANSI para colores (puedes quitar si no se ven bien en tu consola)
    static final String CYAN = "\u001B[36m";
    static final String YELLOW = "\u001B[33m";
    static final String GREEN = "\u001B[32m";
    static final String RESET = "\u001B[0m";
    static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        int[][] L = new int[V][V];

        // Inicializamos la matriz con infinito
        for (int i = 0; i < V; i++) Arrays.fill(L[i], INF);

        // Grafo dirigido (desde, hasta, peso)
        agregarArista(L, 0, 1, 2);
        agregarArista(L, 0, 2, 5);
        agregarArista(L, 1, 3, 1);
        agregarArista(L, 2, 3, 2);
        agregarArista(L, 3, 4, 1);
        agregarArista(L, 2, 4, 3);
        agregarArista(L, 4, 5, 2);

        dijkstraConsola(L, 0); // Nodo fuente = 0 (nodo 1)
    }

    static void agregarArista(int[][] L, int from, int to, int peso) {
        L[from][to] = peso;
    }

    static void dijkstraConsola(int[][] L, int fuente) {
        int[] D = new int[V];
        boolean[] visitado = new boolean[V];
        Set<Integer> C = new HashSet<>();
        Set<Integer> S = new HashSet<>();

        Arrays.fill(D, INF);
        D[fuente] = 0;

        for (int i = 0; i < V; i++) if (i != fuente) C.add(i);
        S.add(fuente);
        visitado[fuente] = true;

        // PRIMER PASO: relajar vecinos del nodo fuente
        for (int w = 0; w < V; w++) {
            if (L[fuente][w] != INF) {
                D[w] = L[fuente][w];
            }
        }

        // Encabezado tabla
        System.out.println("\n" + BOLD + "╔════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("║  %-7s │ %-15s │ %-15s │ %-30s ║\n", "V", "C", "S", "D");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════╣");

        // Mostrar paso inicial
        System.out.printf("║  %-7s │ %-15s │ %-15s │ %-30s ║\n",
                CYAN + (fuente + 1) + RESET,
                mostrar(C, YELLOW),
                mostrar(S, GREEN),
                mostrarD(D)
        );

        // Iteraciones restantes
        for (int iter = 0; iter < V - 1; iter++) {
            int v = -1;
            int minDist = INF;

            for (int i = 0; i < V; i++) {
                if (!visitado[i] && D[i] < minDist) {
                    minDist = D[i];
                    v = i;
                }
            }

            if (v == -1) break;

            visitado[v] = true;
            S.add(v);
            C.remove(v);

            for (int w = 0; w < V; w++) {
                if (!visitado[w] && L[v][w] != INF) {
                    D[w] = Math.min(D[w], D[v] + L[v][w]);
                }
            }

            // Imprimir paso actual
            System.out.printf("║  %-7s │ %-15s │ %-15s │ %-30s ║\n",
                    CYAN + (v + 1) + RESET,
                    mostrar(C, YELLOW),
                    mostrar(S, GREEN),
                    mostrarD(D)
            );
        }

        System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════╝");

        System.out.println("\n" + BOLD + "🎯 Distancias finales desde el nodo " + (fuente + 1) + ":" + RESET);
        for (int i = 0; i < V; i++) {
            String dist = (D[i] == INF) ? "∞" : String.valueOf(D[i]);
            System.out.printf("• Nodo %d: %s\n", i + 1, dist);
        }
    }

    static String mostrar(Set<Integer> conjunto, String color) {
        List<Integer> lista = new ArrayList<>();
        for (int x : conjunto) lista.add(x + 1);
        return color + lista.toString() + RESET;
    }

    static String mostrarD(int[] D) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < D.length; i++) {
            sb.append((D[i] == INF ? "∞" : D[i]));
            if (i < D.length - 1) sb.append(", ");
        }
        return sb.append("]").toString();
    }
}

