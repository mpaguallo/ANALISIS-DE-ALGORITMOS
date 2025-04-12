# ANALISIS-DE-ALGORITMOS
# 📊 **Análisis de Algoritmos en Java**

<p align="center">
  <img src="https://img.shields.io/badge/Lenguaje-Java-blue?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Tipo-Análisis%20Teórico%20%26%20Práctico-purple?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Estado-Activo-green?style=for-the-badge" />
</p>

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/1/1f/Sorting_anim.gif" width="400" />
</p>

<p align="center">
  <em>“Medir la eficiencia de un algoritmo no es solo contar pasos... es descubrir su alma.”</em>
</p>

---

## 🧭 **Tabla de Contenidos**

- [📌 Introducción](#-introducción)
  - [🔑 Conceptos de Algoritmia](#-conceptos-de-algoritmia)
  - [📚 Análisis de Algoritmos](#-análisis-de-algoritmos)
- [🌟 Tipos de Algoritmos](#-tipos-de-algoritmos)
- [📐 Algoritmos Analizados](#-algoritmos-analizados)
  - [🔁 Bubble Sort](#-bubble-sort)
- [🎉 Frase Final Animada](#-frase-final-animada)

---

## 📌 **Introducción**

### 🔑 **Conceptos de Algoritmia**

La **algoritmia** es el arte de diseñar y analizar algoritmos, es decir, de crear métodos eficientes para resolver problemas mediante una secuencia de pasos bien definidos. En la **programación** moderna, los algoritmos son el núcleo de todo lo que hacemos. 🧠

### 📚 **Análisis de Algoritmos**

El **análisis de algoritmos** se refiere al estudio de la **eficiencia** de los algoritmos. Este análisis se enfoca principalmente en el tiempo que tardan en ejecutarse (**complejidad temporal**) y la cantidad de recursos que consumen, como la **memoria** (**complejidad espacial**). 

Los **algoritmos más eficientes** se seleccionan según el tipo de problema y el tamaño de los datos.

---

## 🌟 **Tipos de Algoritmos**

1. **Algoritmos de Ordenamiento**  
   Ejemplo: `Merge Sort`, `Quick Sort`, `Bubble Sort`.

2. **Algoritmos de Búsqueda**  
   Ejemplo: `Búsqueda Binaria`, `Búsqueda Lineal`.

3. **Algoritmos de Grafos**  
   Ejemplo: `Dijkstra`, `Floyd-Warshall`.

4. **Algoritmos de Divide y Vencerás**  
   Ejemplo: `Quick Sort`, `Merge Sort`, `Karatsuba`.

5. **Algoritmos Greedy**  
   Ejemplo: `Kruskal`, `Prim`.

6. **Algoritmos de Backtracking**  
   Ejemplo: `Suma de subconjuntos`, `Sudoku`.

---

## 📐 **Algoritmos Analizados**

### 🔁 **Bubble Sort**

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Bubble_sort_animated.gif/250px-Bubble_sort_animated.gif" width="200"/>
</p>

📌 **Tipo:** Ordenamiento  
🧠 **Complejidad Temporal:**  
- Mejor caso: `O(n)` 🟢 (cuando la lista ya está ordenada)  
- Peor caso: `O(n²)` 🔴 (cuando está invertida)

📋 **Descripción:**  
Este algoritmo compara cada par de elementos adyacentes y los intercambia si están en el orden incorrecto. Repite este proceso hasta que no se realicen más intercambios.

🧪 **Ideal para:**  
Usado principalmente con fines educativos. No es eficiente para grandes conjuntos de datos.

### **Ejemplo de Entrada y Salida:**

- **Entrada:** `[5, 2, 9, 1, 5, 6]`
- **Salida esperada:** `[1, 2, 5, 5, 6, 9]`

#### **Código de Bubble Sort:**

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
