# 📊✨ Análisis de Algoritmos 


---

## 🌟 ¿Qué veremos aquí?

🎯 En esta sección nos enfocaremos en conceptos clave del análisis algorítmico intermedio:

| Sección | Contenido |
|--------|-----------|
| 🔹 3.2 | [Análisis del caso medio](#-32-análisis-del-caso-medio) |
| 🔸 3.3 | [Análisis amortizado](#-33-análisis-amortizado) |
| 🔹 3.4 | [Recurrencias](#-34-recurrencias) |

---

## 🔹  Análisis del caso medio

> 🧠 El **caso medio** evalúa el comportamiento **esperado** de un algoritmo, tomando en cuenta la probabilidad de los casos posibles.

### 📌 ¿Por qué es importante?

- No siempre se ejecuta el peor escenario.
- El caso medio da una **visión más realista** del rendimiento.
- Ayuda a comparar algoritmos **cuando sus casos extremos son similares**.

<details>
<summary>🔍 Ejemplo visual: Búsqueda lineal</summary>

```java
public int buscar(int[] A, int x) {
    for (int i = 0; i < A.length; i++) {
        if (A[i] == x) return i;
    }
    return -1;
}
```

📊 **Costo esperado:**
- Cada posición es igual de probable.
- Tiempo promedio ≈ (1 + 2 + ... + n)/n = **O(n)**

<p align="center">
  <img src="https://i.imgur.com/qd1Yeqr.png" width="400"/>
</p>

</details>

---

## 🔸  Análisis amortizado

> 📦 Evalúa el costo **promedio a largo plazo** de una operación, en lugar de analizar una sola ejecución costosa.

### 🛠 Técnicas comunes:
- **Método agregado**: costo total entre todas las operaciones.
- **Contabilidad**: cada operación guarda créditos para futuras operaciones caras.
- **Potencial**: se define una función de energía almacenada.

---

<details>
<summary>📦 Ejemplo: ArrayList en Java</summary>

```java
ArrayList<Integer> lista = new ArrayList<>();
for (int i = 0; i < n; i++) {
    lista.add(i);  // Se duplica ocasionalmente
}
```

### 🔍 Análisis:

- Añadir normalmente: O(1)
- Redimensionar: O(n) solo cuando se llena
- 🔁 En total, sobre n inserciones, el **costo promedio es O(1)**

<p align="center">
  <img src="https://i.imgur.com/Nzsjci2.png" width="450"/>
</p>

</details>

---

## 🔹  Recurrencias

> 🔁 Las **recurrencias** son ecuaciones que describen algoritmos recursivos. Son esenciales para encontrar su complejidad.

### 🧠 Métodos para resolverlas:

| Método | Cuándo usarlo |
|--------|----------------|
| 🔢 Sustitución | Cuando puedes hacer varias sustituciones para encontrar el patrón |
| 🌳 Árbol de recurrencia | Visualizas el coste en cada nivel de recursión |
| 📐 Teorema Maestro | Para formas T(n) = aT(n/b) + f(n) |

---

<details>
<summary>📘 Ejemplo: Búsqueda Binaria</summary>

```java
int binarySearch(int[] A, int x) {
    int l = 0, r = A.length - 1;
    while (l <= r) {
        int m = (l + r) / 2;
        if (A[m] == x) return m;
        if (A[m] < x) l = m + 1;
        else r = m - 1;
    }
    return -1;
}
```

### ⏱ Análisis:

- Divide el problema en mitades.
- T(n) = T(n/2) + c
- ✅ Solución: **O(log n)**

<p align="center">
  <img src="https://i.imgur.com/Dz2oLdo.png" width="400"/>
</p>

</details>

---



## 🧩 Recursos recomendados

- 📘 *Fundamentos de Algoritmia* — Brassard & Bratley  
- 📺 [Video: Amortized Analysis (MIT)](https://www.youtube.com/watch?v=1iq3PpYxC5A)  
- 🎥 [YouTube: Master Theorem y Recurrencias](https://www.youtube.com/results?search_query=teorema+maestro+recurrencias)

---

