# ANALISIS-DE-ALGORITMOS
# 📊 **Análisis de Algoritmos en Java**

<p align="center">
  <img src="https://img.shields.io/badge/Lenguaje-Java-blue?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Tipo-Análisis%20Teórico%20%26%20Práctico-purple?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Estado-Activo-green?style=for-the-badge" />
</p>

## 🧭 **Tabla de Contenidos**

- [📌 Introducción](#-introducción)
  - [🔑 Conceptos de Algoritmia](#-conceptos-de-algoritmia)
  - [📚 Análisis de Algoritmos](#-análisis-de-algoritmos)
  - [📝 Tipos de Algoritmos](#-tipos-de-algoritmos)
- [🚀 Algoritmos Analizados](#-algoritmos-analizados)
  - [🔁 Bubble Sort](#-bubble-sort)
  - [⚡ Quick Sort](#-quick-sort)
  - [🔍 Búsqueda Binaria](#-búsqueda-binaria)
- [🎉 Frase Final Animada](#-frase-final-animada)

---

## 📌 **Introducción**

### 🔑 **Conceptos de Algoritmia**

La **algoritmia** es el estudio y la práctica de diseñar algoritmos, que son secuencias de pasos que resuelven problemas. Estos algoritmos son fundamentales para la programación, ya que proporcionan la base de soluciones eficientes.

### 📚 **Análisis de Algoritmos**

El **análisis de algoritmos** consiste en evaluar el **rendimiento** de un algoritmo en cuanto a su **complejidad temporal** y **complejidad espacial**. La complejidad temporal analiza el tiempo que tarda el algoritmo en ejecutar, mientras que la complejidad espacial se enfoca en el uso de memoria.

### 📝 **Tipos de Algoritmos**

Existen diferentes tipos de algoritmos, que varían según su propósito y la técnica utilizada para resolver un problema. Algunos de los tipos más comunes son:

- **Algoritmos de Ordenamiento:** Organizan datos de acuerdo a un criterio determinado (Ejemplo: Quick Sort, Bubble Sort).
- **Algoritmos de Búsqueda:** Encuentran elementos dentro de un conjunto de datos (Ejemplo: Búsqueda Binaria).
- **Algoritmos de Dividir y Vencer:** Dividen un problema en subproblemas más pequeños y los resuelven recursivamente.

---

## 🚀 **Algoritmos Analizados**

### 🔁 **Bubble Sort**

<details>
  <summary>📋 Ver detalles de Bubble Sort</summary>
  
  📌 **Tipo:** Ordenamiento  
  🧠 **Complejidad Temporal:**  
  - Mejor caso: `O(n)` 🟢  
  - Peor caso: `O(n²)` 🔴  

  📋 **Descripción:**  
  Este algoritmo compara elementos adyacentes y los intercambia si están en el orden incorrecto. Continúa hasta que el arreglo esté completamente ordenado.

  🧪 **Ideal para:**  
  Usado principalmente con fines educativos y para arreglos pequeños.

  #### **Código de ejemplo:**

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

