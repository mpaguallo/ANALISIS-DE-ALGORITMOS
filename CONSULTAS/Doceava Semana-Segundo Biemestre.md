
<h1 align="center">⚔️ Algoritmos Divide y Vencerás</h1>
<h2 align="center">📘 1.1 Ordenación</h2>

---

<div align="center">
  <img src="https://img.shields.io/badge/Tema-Algoritmos%20Avanzados-blueviolet?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Estrategia-Divide%20y%20Vencerás-orange?style=for-the-badge" />
</div>

---

## 📚 Índice

- [🎯 Objetivo](#-objetivo)
- [🧩 ¿Qué es "Divide y Vencerás"?](#-qué-es-divide-y-vencerás)
- [📊 Algoritmos de Ordenación con Divide y Vencerás](#-algoritmos-de-ordenación-con-divide-y-vencerás)
  - [📌 Merge Sort](#-merge-sort)
  - [⚡ Quick Sort](#-quick-sort)
- [🧠 Conceptos Clave](#-conceptos-clave)
- [🌈 Ventajas de la Estrategia](#-ventajas-de-la-estrategia)
- [🧪 Ejemplo Interactivo](#-ejemplo-interactivo)
- [📋 MiniQuiz](#-miniquiz-sobre-ordenación-con-divide-y-vencerás)

---

## 🎯 Objetivo

Este apartado tiene como objetivo comprender y aplicar algoritmos de **ordenación** basados en la estrategia de **Divide y Vencerás**, destacando su eficiencia y versatilidad.

---

## 🧩 ¿Qué es "Divide y Vencerás"?

> Es una estrategia de diseño de algoritmos que consiste en dividir un problema en subproblemas más pequeños, resolverlos de manera recursiva y luego combinar sus soluciones.

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/8/8d/Merge-sort-example-300px.gif" width="350" alt="Ejemplo Divide y Vencerás" />
</p>

---

## 📊 Algoritmos de Ordenación con Divide y Vencerás

### 📌 Merge Sort

<details open>
  <summary><strong>Descripción</strong></summary>

> Merge Sort divide el arreglo en mitades hasta que cada subarreglo tenga un solo elemento, y luego los combina ordenadamente.

```java
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        // Lógica de combinación
    }
}
```

<p align="center">
  <img src="https://miro.medium.com/v2/resize:fit:1400/format:webp/1*_V9O_hOvw9nG0R3Bz_rFCA.gif" width="300" />
</p>

</details>

---

### ⚡ Quick Sort

<details>
  <summary><strong>Descripción</strong></summary>

> Quick Sort elige un **pivote**, reorganiza el arreglo en elementos menores y mayores que el pivote, y aplica el proceso recursivamente.

```java
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        // lógica de partición
        return pivotIndex;
    }
}
```

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif" width="300" />
</p>

</details>

---

## 🧠 Conceptos Clave

| Concepto             | Descripción                                                    |
|----------------------|----------------------------------------------------------------|
| Divide               | Separar el problema en partes más pequeñas                     |
| Conquista            | Resolver los subproblemas recursivamente                       |
| Combina              | Integrar las soluciones parciales en una solución completa     |
| Eficiencia           | Muchos de estos algoritmos tienen complejidad O(n log n)       |

---

## 🌈 Ventajas de la Estrategia

> ✅ Maneja grandes cantidades de datos eficientemente  
> ✅ Se adapta bien a estructuras recursivas  
> ✅ Muchos algoritmos óptimos usan esta estrategia  
> ✅ Mejora la organización del código

---

## 🧪 Ejemplo Interactivo

```java
public class OrdenarEjemplo {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 9, 1, 5, 6};
        MergeSort.mergeSort(arreglo, 0, arreglo.length - 1);

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}
```

> 💡 *Ejecuta este código y observa cómo se ordena el arreglo paso a paso.*

---

## 🎥 Video Recomendado

<p align="center">
  <strong>🎥 ¿Cómo funciona Merge Sort y Quick Sort?</strong><br><br>
  <a href="https://www.youtube.com/watch?v=es2T6KY45cA">
    <img src="https://img.youtube.com/vi/es2T6KY45cA/0.jpg" alt="Video explicativo" width="500">
  </a><br>
  ⬆️ Haz clic en la imagen para verlo en YouTube
</p>

---

## 📋 MiniQuiz: Sobre Ordenación con Divide y Vencerás

### ❓ Pregunta 1:
¿Qué estrategia sigue Merge Sort?

- A) Divide y Combina  
- B) Iteración Secuencial  
- C) Divide y Vencerás  
- D) Selección Directa  

<details>
<summary>💡 Ver respuesta</summary>
✅ C) Divide y Vencerás.
</details>

---

### ❓ Pregunta 2:
¿Cuál es el **caso promedio** de complejidad de Quick Sort?

- A) O(n)  
- B) O(n log n)  
- C) O(n²)  
- D) O(log n)  

<details>
<summary>💡 Ver respuesta</summary>
✅ B) O(n log n)
</details>

---

### ❓ Pregunta 3:
¿Cuál de los siguientes algoritmos **no usa** Divide y Vencerás?

- A) Merge Sort  
- B) Bubble Sort  
- C) Quick Sort  
- D) Binary Search  

<details>
<summary>💡 Ver respuesta</summary>
✅ B) Bubble Sort
</details>

---

### 🏁 ¿Cómo te fue?

- 0 - 1 correctas: 🌱 ¡Recién comienzas, sigue aprendiendo!
- 2 correctas: 🔧 Vas por buen camino.
- 3 correctas: 🧠 ¡Gran dominio del tema!

---

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=F75C7E&center=true&vCenter=true&multiline=true&width=600&lines=📘+Algoritmos+Divide+y+Vencerás" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=F75C7E&center=true&vCenter=true&multiline=true&width=600&lines=¡Aprende+a+ordenar+como+un+pro!" />
</p>

