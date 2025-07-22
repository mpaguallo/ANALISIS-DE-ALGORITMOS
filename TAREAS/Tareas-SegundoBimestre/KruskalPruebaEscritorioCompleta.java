
import java.util.*;

class Edge implements Comparable<Edge> {
    int origen, destino, peso;

    Edge(int origen, int destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public int compareTo(Edge otra) {
        return this.peso - otra.peso;
    }

    @Override
    public String toString() {
        return "(" + origen + "-" + destino + ", " + peso + ")";
    }
}

class Subconjunto {
    int padre;
    int rango;
}

public class KruskalPruebaEscritorioCompleta {

    int vertices;
    List<Edge> aristas = new ArrayList<>();

    KruskalPruebaEscritorioCompleta(int vertices) {
        this.vertices = vertices;
    }

    void agregarArista(int origen, int destino, int peso) {
        aristas.add(new Edge(origen, destino, peso));
    }

    int encontrar(Subconjunto[] subconjuntos, int i) {
        if (subconjuntos[i].padre != i) {
            subconjuntos[i].padre = encontrar(subconjuntos, subconjuntos[i].padre);
        }
        return subconjuntos[i].padre;
    }

    void unir(Subconjunto[] subconjuntos, int x, int y) {
        int raizX = encontrar(subconjuntos, x);
        int raizY = encontrar(subconjuntos, y);

        if (subconjuntos[raizX].rango < subconjuntos[raizY].rango) {
            subconjuntos[raizX].padre = raizY;
        } else if (subconjuntos[raizX].rango > subconjuntos[raizY].rango) {
            subconjuntos[raizY].padre = raizX;
        } else {
            subconjuntos[raizY].padre = raizX;
            subconjuntos[raizX].rango++;
        }
    }

    String estadoPadres(Subconjunto[] subconjuntos) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < subconjuntos.length; i++) {
            sb.append(subconjuntos[i].padre);
            if (i < subconjuntos.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    String estadoRangos(Subconjunto[] subconjuntos) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < subconjuntos.length; i++) {
            sb.append(subconjuntos[i].rango);
            if (i < subconjuntos.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    String estadoResultado(List<Edge> resultado) {
        if (resultado.isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Edge e : resultado) {
            sb.append(e.toString()).append(", ");
        }
        sb.setLength(sb.length() - 2); // quitar última coma
        sb.append("]");
        return sb.toString();
    }

    void encontrarMST() {
        List<Edge> resultado = new ArrayList<>();
        Collections.sort(aristas);

        Subconjunto[] subconjuntos = new Subconjunto[vertices];
        for (int v = 0; v < vertices; v++) {
            subconjuntos[v] = new Subconjunto();
            subconjuntos[v].padre = v;
            subconjuntos[v].rango = 0;
        }

        System.out.println("PRUEBA DE ESCRITORIO COMPLETA\n");
        System.out.printf("%-6s | %-15s | %-10s | %-10s | %-8s | %-20s | %-20s | %-25s\n",
                "Paso", "Arista (u-v, w)", "Raíz u", "Raíz v", "Acción", "Padre antes", "Padre después", "Resultado actual");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        int paso = 1;
        for (Edge arista : aristas) {
            int raizU = encontrar(subconjuntos, arista.origen);
            int raizV = encontrar(subconjuntos, arista.destino);

            String padreAntes = estadoPadres(subconjuntos);
            String rangoAntes = estadoRangos(subconjuntos);

            String accion;
            if (raizU != raizV) {
                accion = "Unir";
                unir(subconjuntos, raizU, raizV);
            } else {
                accion = "Ciclo";
            }

            String padreDespues = estadoPadres(subconjuntos);

            if (accion.equals("Unir")) {
                resultado.add(arista);
            }

            String resultadoStr = estadoResultado(resultado);

            System.out.printf("%-6d | %-15s | %-10d | %-10d | %-8s | %-20s | %-20s | %-25s\n",
                    paso, arista.toString(), raizU, raizV, accion, padreAntes, padreDespues, resultadoStr);

            paso++;

            if (resultado.size() == vertices - 1) break;
        }

        int pesoTotal = resultado.stream().mapToInt(e -> e.peso).sum();

        System.out.println("\nResultado final MST:");
        for (Edge e : resultado) {
            System.out.printf("Arista: %d -- %d  Peso: %d\n", e.origen, e.destino, e.peso);
        }
        System.out.println("Peso total del MST: " + pesoTotal);
    }

    public static void main(String[] args) {
        KruskalPruebaEscritorioCompleta grafo = new KruskalPruebaEscritorioCompleta(6);

        grafo.agregarArista(0, 1, 4);
        grafo.agregarArista(0, 2, 4);
        grafo.agregarArista(1, 2, 2);
        grafo.agregarArista(1, 3, 5);
        grafo.agregarArista(2, 3, 5);
        grafo.agregarArista(2, 4, 11);
        grafo.agregarArista(3, 4, 2);
        grafo.agregarArista(3, 5, 1);
        grafo.agregarArista(4, 5, 7);

        grafo.encontrarMST();
    }
}
