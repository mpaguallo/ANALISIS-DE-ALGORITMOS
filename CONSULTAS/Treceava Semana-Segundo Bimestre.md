
<h1 align="center">⚔️ Algoritmos Divide y Vencerás</h1>
<h2 align="center">📘 Semana 13 – Mediana & Multiplicación de Matrices</h2>

---

<div align="center">
  <img src="https://img.shields.io/badge/Tema-Divide%20y%20Vencerás-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Semana-13-important?style=for-the-badge" />
</div>

---

## 📚 Índice

- [🎯 Objetivo](#-objetivo)
- [🔍 Problema de la Mediana](#-problema-de-la-mediana)
  - [📌 Mediana de Dos Arreglos Ordenados](#-mediana-de-dos-arreglos-ordenados)
- [🧮 Multiplicación de Matrices](#-multiplicación-de-matrices)
  - [⚡ Algoritmo de Strassen](#-algoritmo-de-strassen)
- [🧠 Conceptos Clave](#-conceptos-clave)
- [🧪 Ejemplos Interactivos](#-ejemplos-interactivos)
- [📋 MiniQuiz](#-miniquiz-divide-y-vencerás-mediana-y-matrices)

---

## 🎯 Objetivo

Explorar la estrategia de **Divide y Vencerás** aplicada a problemas más avanzados como la **búsqueda de la mediana** en arreglos ordenados y la **multiplicación eficiente de matrices**.

---

## 🔍 Problema de la Mediana

### 📌 Mediana de Dos Arreglos Ordenados

> Hallar la mediana de dos arreglos ordenados en tiempo logarítmico.

```java
double findMedianSortedArrays(int[] nums1, int[] nums2) {
    // Algoritmo basado en búsqueda binaria
}
```

✅ Este problema se resuelve con **búsqueda binaria** y división eficiente.


---

## 🧮 Multiplicación de Matrices

### ⚡ Algoritmo de Strassen

> Reduce la complejidad de O(n³) a aproximadamente O(n^2.81) dividiendo matrices.

```java
int[][] strassen(int[][] A, int[][] B) {
    // Dividir matrices en submatrices
    // Calcular 7 productos en lugar de 8
    // Combinar resultados
    return C;
}
```

✅ Divide cada matriz en 4 submatrices y usa recursión.

<p align="center">
  <img src="https://miro.medium.com/v2/resize:fit:1200/format:webp/1*dWhuzVJ9ghk9Gn-RU8qfyQ.gif" width="350" />
</p>

---

## 🧠 Conceptos Clave

| Concepto             | Descripción                                                   |
|----------------------|---------------------------------------------------------------|
| Divide y Vencerás    | Técnica recursiva para dividir, resolver y combinar           |
| Mediana              | Valor central de un conjunto ordenado                         |
| Strassen             | Multiplicación de matrices usando solo 7 productos            |
| Complejidad          | Se reduce de O(n³) a O(n^2.81) en Strassen                    |

---

## 🧪 Ejemplos Interactivos

### 🧩 Mediana

```java
int[] A = {1, 3, 8};
int[] B = {7, 9, 10, 11};
System.out.println(findMedianSortedArrays(A, B)); // Output esperado: 8.0
```

### 🧩 Strassen

```java
int[][] A = {{1, 2}, {3, 4}};
int[][] B = {{5, 6}, {7, 8}};
// Resultado esperado: {{19, 22}, {43, 50}}
```

---

## 📋 MiniQuiz: Divide y Vencerás – Mediana y Matrices

### ❓ Pregunta 1:
¿Cuál es la complejidad del algoritmo de Strassen?

- A) O(n²)
- B) O(n log n)
- C) O(n^2.81)
- D) O(n³)

<details>
<summary>💡 Ver respuesta</summary>
✅ C) O(n^2.81)
</details>

---

### ❓ Pregunta 2:
¿Qué se necesita para aplicar la técnica de Strassen?

- A) Que las matrices sean cuadradas de tamaño potencia de 2  
- B) Que las matrices estén ordenadas  
- C) Que tengan la misma suma de filas  
- D) Que una sea triangular  

<details>
<summary>💡 Ver respuesta</summary>
✅ A) Que las matrices sean cuadradas de tamaño potencia de 2
</details>

---

### ❓ Pregunta 3:
La mediana de dos arreglos ordenados puede encontrarse en tiempo...

- A) O(n²)  
- B) O(n)  
- C) O(log (m+n))  
- D) O(1)  

<details>
<summary>💡 Ver respuesta</summary>
✅ C) O(log (m+n))
</details>

---

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=FFA500&center=true&vCenter=true&multiline=true&width=600&lines=📘+Semana+13:+Divide+y+Vencerás" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=FFA500&center=true&vCenter=true&multiline=true&width=600&lines=¡Aprende+algoritmos+eficientes!" />
</p>

