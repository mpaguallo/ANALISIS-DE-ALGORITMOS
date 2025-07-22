// ╔══════════════════════════════════════════════════════════════════════════════╗
// ║        💡 Algoritmo de Prim con Prueba de Escritorio                         ║
// ╠══════════════════════════════════════════════════════════════════════════════╣
// ║            📌 Mostrando paso a paso el Árbol de Recubrimiento Mínimo         ║
// ╚══════════════════════════════════════════════════════════════════════════════╝

import java.util.*;

class Arista {
    int origen, destino, peso;

    Arista(int origen, int destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "{" + (origen + 1) + "," + (destino + 1) + "}";
    }
}

public class PrimConsola {
    static int V = 6;
    static List<List<Arista>> grafo = new ArrayList<>();

    // Códigos de color ANSI (puedes quitar si no se ven bien en tu consola)
    static final String CYAN = "\u001B[36m";
    static final String YELLOW = "\u001B[33m";
    static final String GREEN = "\u001B[32m";
    static final String RESET = "\u001B[0m";
    static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        for (int i = 0; i < V; i++) grafo.add(new ArrayList<>());

        // Grafo del profesor
        agregarArista(0, 1, 6);
        agregarArista(0, 2, 1);
        agregarArista(0, 3, 5);
        agregarArista(1, 2, 5);
        agregarArista(1, 4, 3);
        agregarArista(2, 4, 6);
        agregarArista(2, 5, 4);
        agregarArista(2, 3, 5);
        agregarArista(3, 5, 2);
        agregarArista(4, 5, 6);

        prim();
    }

    static void agregarArista(int u, int v, int peso) {
        grafo.get(u).add(new Arista(u, v, peso));
        grafo.get(v).add(new Arista(v, u, peso));
    }

    static void prim() {
        boolean[] visitado = new boolean[V];
        PriorityQueue<Arista> cola = new PriorityQueue<>(Comparator.comparingInt(a -> a.peso));
        List<Arista> arbol = new ArrayList<>();
        Set<Integer> B = new HashSet<>();

        visitado[0] = true;
        B.add(0);
        cola.addAll(grafo.get(0));

        // Encabezado bonito
        System.out.println("\n" + BOLD + "╔════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("║  %-35s │ %-15s │ %-15s │ %-10s │ %-5s ║\n",
                "T (Árbol Parcial)", "B (Visitados)", "N/B (No Visitados)", "e = {u,v}", "Peso");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");

        while (arbol.size() < V - 1) {
            Arista a = cola.poll();

            if (!visitado[a.destino]) {
                visitado[a.destino] = true;
                arbol.add(a);
                B.add(a.destino);
                cola.addAll(grafo.get(a.destino));

                Set<Integer> NB = new HashSet<>();
                for (int i = 0; i < V; i++) if (!visitado[i]) NB.add(i);

                System.out.printf("║  %-35s │ %-15s │ %-15s │ %-10s │ %-5d ║\n",
                        CYAN + arbol.toString() + RESET,
                        GREEN + mostrar(B) + RESET,
                        YELLOW + mostrar(NB) + RESET,
                        a.toString(),
                        a.peso
                );
            }
        }

        System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

        System.out.println("\n" + BOLD + "🎯 Árbol de Recubrimiento Mínimo Final:" + RESET);
        for (Arista a : arbol) {
            System.out.printf("• %d — %d : %d\n", a.origen + 1, a.destino + 1, a.peso);
        }
    }

    static String mostrar(Set<Integer> conjunto) {
        List<Integer> lista = new ArrayList<>();
        for (int x : conjunto) lista.add(x + 1);
        return lista.toString();
    }
}
