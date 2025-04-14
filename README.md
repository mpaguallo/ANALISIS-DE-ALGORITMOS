
<h1 align="center">📊 "Análisis de Algoritmos" 📊</h1>


<p align="center">
    <img src="http://virtual.itpachuca.edu.mx/moodle/pluginfile.php/63387/course/overviewfiles/programacion.gif" width="400" />
</p>

<p align="center">
  <em>“El análisis de algoritmos no solo mide el tiempo, sino la eficiencia de una idea”</em>
</p>

---

## 🧭 **Tabla de Contenidos**

- [📌 Introducción](#-introducción)
  - [🔑 Concepto de Algoritmia](#-concepto-de-algoritmia)
  - [📚 Análisis de Algoritmos](#-análisis-de-algoritmos)
- [🌟 Tipos de Algoritmos](#-tipos-de-algoritmos)
- [📐 Algoritmos Analizados](#-algoritmos-analizados)
  - [🔁 Bubble Sort](#bubble-sort)
  - [⚡ Quick Sort](#quick-sort)
  - [🔎 Búsqueda Binaria](#búsqueda-binaria)
  - [🌉 Floyd-Warshall](#floyd-warshall)
  - [💡 Algoritmo de Dijkstra](#algoritmo-de-dijkstra)


---

## 📌 **Introducción**

### 🔑 **Concepto de Algoritmia**

La **algoritmia** es el arte de diseñar y analizar algoritmos, es decir, de crear métodos eficientes para resolver problemas mediante una secuencia de pasos bien definidos. En la **programación** moderna, los algoritmos son el núcleo de todo lo que hacemos. 🧠

### 📚 **Análisis de Algoritmos**

El **análisis de algoritmos** se refiere al estudio de la **eficiencia** de los algoritmos. Este análisis se enfoca principalmente en el tiempo que tardan en ejecutarse (**complejidad temporal**) y la cantidad de recursos que consumen, como la **memoria** (**complejidad espacial**). 

Los **algoritmos más eficientes** se seleccionan según el tipo de problema y el tamaño de los datos.

---

## 🌟 **Tipos de Algoritmos**

| **Tipos de Algoritmos**                           | **Ejemplos**                                |
|--------------------------------------------------|--------------------------------------------|
| 🔁 **Algoritmos de Ordenamiento**                | `Merge Sort`, `Quick Sort`, `Bubble Sort`  |
| 🔍 **Algoritmos de Búsqueda**                    | `Búsqueda Binaria`, `Búsqueda Lineal`      |
| 🌐 **Algoritmos de Grafos**                      | `Dijkstra`, `Floyd-Warshall`               |
| ⚔️ **Algoritmos de Divide y Vencerás**           | `Quick Sort`, `Merge Sort`, `Karatsuba`    |
| 💰 **Algoritmos Greedy**                         | `Kruskal`, `Prim`                          |
| 🧩 **Algoritmos de Backtracking**                | `Suma de subconjuntos`, `Sudoku`           |

---

## 📐 **Algoritmos Analizados**

<details>
<summary>🔁 <strong>Bubble Sort</strong></summary>

<p align="center">
  <img src="https://www.programmingsimplified.com/images/c/bubble-sort.gif" width="370"/>
</p>

📌 <strong>Tipo:</strong> Ordenamiento  
🧠 <strong>Complejidad Temporal:</strong>  
- Mejor caso: <code>O(n)</code> 🟢 (cuando la lista ya está ordenada)  
- Peor caso: <code>O(n²)</code> 🔴 (cuando está invertida)

📋 <strong>Descripción:</strong>  
Este algoritmo compara cada par de elementos adyacentes y los intercambia si están en el orden incorrecto. Repite este proceso hasta que no se realicen más intercambios.

🧪 <strong>Ideal para:</strong>  
Usado principalmente con fines educativos. No es eficiente para grandes conjuntos de datos.

### 📥 Ejemplo de Entrada y Salida:

- **Entrada:** `[5, 2, 9, 1, 5, 6]`  
- **Salida esperada:** `[1, 2, 5, 5, 6, 9]`

### 💻 Código en Java:

```java
for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}

```
</details>

<details>
<summary>⚡ <strong>Quick Sort</strong></summary>

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif" width="250"/>
</p>

📌 <strong>Tipo:</strong> Ordenamiento  
🧠 <strong>Complejidad Temporal:</strong>  
- Promedio: <code>O(n log n)</code> 🟢  
- Peor caso: <code>O(n²)</code> 🔴

📋 <strong>Descripción:</strong>  
Quick Sort selecciona un **pivote** y divide el arreglo en dos partes: una con elementos menores y otra con elementos mayores. Luego ordena las sublistas recursivamente. Es un claro ejemplo del paradigma **Divide y Vencerás**.

🧪 <strong>Ideal para:</strong>  
Grandes conjuntos de datos debido a su buena eficiencia en promedio. Muy usado en implementaciones prácticas.

### 📥 Ejemplo de Entrada y Salida:

- **Entrada:** `[10, 7, 8, 9, 1, 5]`  
- **Salida esperada:** `[1, 5, 7, 8, 9, 10]`

### 💻 Código en Java:

```java
void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

```
</details>
<details> <summary>🔎 <strong>Búsqueda Binaria</strong></summary> <p align="center"> <img src="https://www.freecodecamp.org/espanol/news/content/images/2021/03/binary-search-1.gif" width="430"/> </p>
📌 <strong>Tipo:</strong> Búsqueda
🧠 <strong>Complejidad Temporal:</strong>

Mejor caso: <code>O(1)</code> 🟢

Peor caso: <code>O(log n)</code> 🟡

📋 <strong>Descripción:</strong>
Busca un elemento dividiendo el arreglo ordenado en mitades sucesivas.

🧪 <strong>Ideal para:</strong>
Arreglos ordenados.

📥 Ejemplo:
Entrada: [1, 3, 5, 7, 9], buscar 5

Salida: Índice 2

💻 Código en Java:
```java
int binarySearch(int[] arr, int x) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == x) return mid;
        if (arr[mid] < x) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}
```
</details>
<details> <summary>🌉 <strong>Floyd-Warshall</strong></summary> <p align="center"> <img src="https://upload.wikimedia.org/wikipedia/commons/0/0f/Floyd_warshall_gif.gif" width="210"/> </p>
📌 <strong>Tipo:</strong> Grafos
🧠 <strong>Complejidad Temporal:</strong>

Siempre: <code>O(n³)</code> 🔴

📋 <strong>Descripción:</strong>
Calcula las rutas más cortas entre todos los pares de nodos de un grafo ponderado.

🧪 <strong>Ideal para:</strong>
Problemas de redes, conexiones y caminos mínimos.

💻 Código en Java:
```java
for (int k = 0; k < n; k++) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
        }
    }
}
```
</details>
<details> <summary>💡 <strong>Algoritmo de Dijkstra</strong></summary> <p align="center"> <img src="https://upload.wikimedia.org/wikipedia/commons/5/57/Dijkstra_Animation.gif" width="270"/> </p>
📌 <strong>Tipo:</strong> Grafos
🧠 <strong>Complejidad Temporal:</strong>

Con heap: <code>O((V + E) log V)</code> 🟢

📋 <strong>Descripción:</strong>
Encuentra el camino más corto desde un nodo origen a todos los demás en un grafo con pesos positivos.

🧪 <strong>Ideal para:</strong>
GPS, redes, videojuegos.

💻 Código en Java (esbozo):
```java
PriorityQueue<Node> pq = new PriorityQueue<>();
dist[src] = 0;
pq.add(new Node(src, 0));

while (!pq.isEmpty()) {
    Node current = pq.poll();
    for (Edge e : adj[current.id]) {
        if (dist[e.to] > dist[current.id] + e.weight) {
            dist[e.to] = dist[current.id] + e.weight;
            pq.add(new Node(e.to, dist[e.to]));
        }
    }
}

```
</details>
<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&pause=1000&color=2F80ED&width=435&lines=Gracias+por+explorar+el+repositorio!;¡Sigue+explorando+los+algoritmos!;" />
</p>

