
# 📊 Caracterización de los Tiempos de Ejecución

📚 Aquí exploraremos tres herramientas clave para analizar algoritmos: **Ω (Omega)**, **Θ (Theta)** y la **Notación Asintótica Condicional**.


---

## 🌟 Índice

- [🎯 ¿Qué es la caracterización de tiempos?](#🎯-qué-es-la-caracterización-de-tiempos)
- [🟢 Notación Omega (Ω)](#🟢-notación-omega-Ω)
- [🔵 Notación Theta (Θ)](#🔵-notación-theta-Θ)
- [🟡 Notación Asintótica Condicional](#🟡-notación-asintótica-condicional)
- [🧠 Comparación Visual](#🧠-comparación-visual)
- [🧪 MiniQuiz](#🧪-miniquiz-qué-tanto-sabes-de-notación-asintótica)
- [📎 Recursos adicionales](#📎-recursos-adicionales)

---

## 🎯 ¿Qué es la caracterización de tiempos?

Cuando analizamos algoritmos, nos interesa saber cuánto tiempo tardan en ejecutarse según el tamaño de la entrada 📈. Usamos **notaciones asintóticas** para describir su comportamiento en el peor, mejor y caso promedio.

---

## 🟢 Notación Omega (Ω)

> Describe el **tiempo mínimo garantizado** que un algoritmo necesita. Es decir, su rendimiento en el **mejor de los casos**.

📘 **Definición Formal:**

> Una función f(n) ∈ Ω(g(n)) si existen constantes **c > 0** y **n₀ ≥ 0** tales que:
>
> **f(n) ≥ c·g(n)** para todo **n ≥ n₀**

🧠 **Ejemplo práctico:**

```c
// Buscar en una lista ordenada
int buscar(int[] lista, int clave) {
    return lista[0] == clave ? 0 : -1;
}
```

✅ En el **mejor caso**, está en la primera posición → **Ω(1)**

<p align="center">
  <img src="https://d8it4huxumps7.cloudfront.net/uploads/images/67a48ff5202a0_omega_notation.jpg?d=2000x2000" alt="Omega Notation" width="360"/>
</p>

---

## 🔵 Notación Theta (Θ)

> Representa el **crecimiento exacto** de una función. Es decir, el algoritmo se comporta en promedio **igual que g(n)**.

📘 **Definición Formal:**

> f(n) ∈ Θ(g(n)) si existen constantes **c₁, c₂ > 0** y **n₀ ≥ 0** tales que:
>
> **c₁·g(n) ≤ f(n) ≤ c₂·g(n)** para todo **n ≥ n₀**

🧠 **Ejemplo práctico:**

```java
// Suma de todos los elementos de un array
int suma(int[] A) {
    int total = 0;
    for (int i = 0; i < A.length; i++)
        total += A[i];
    return total;
}
```

📊 Ejecuta una operación por cada elemento → **Θ(n)**

<p align="center">
  <img src="https://cdn.kastatic.org/ka-perseus-images/2bdc25c7eda8486d05b8031c5a63535684ecb5a1.png" alt="Omega Notation" width="360"/>
</p>

---

## 🟡 Notación Asintótica Condicional

> Aparece cuando **no es posible definir un solo comportamiento asintótico**, y depende de condiciones particulares del algoritmo.

📘 **Ejemplo clásico:**

```python
def algoritmo(x):
    if x % 2 == 0:
        return x // 2
    else:
        return 3 * x + 1
```

🎲 El tiempo de ejecución depende de si `x` es par o impar → no se puede determinar con certeza su orden exacto sin saber más.

🧪 **Se utiliza** cuando el análisis debe condicionarse a ciertos valores de entrada o supuestos adicionales.

---

## 🧠 Comparación Visual

| Notación | Significado                | Caso                  | Simbología     |
|----------|----------------------------|------------------------|----------------|
| Ω(g(n))  | Tiempo mínimo garantizado  | Mejor caso             | ![Ω](https://latex.codecogs.com/png.image?\Omega(g(n))) |
| Θ(g(n))  | Tiempo exacto              | Caso promedio (ideal) | ![Θ](https://latex.codecogs.com/png.image?\Theta(g(n))) |
| O(g(n))  | Tiempo máximo permitido    | Peor caso              | ![O](https://latex.codecogs.com/png.image?O(g(n))) |

---

## 🧪 MiniQuiz: ¿Qué tanto sabes de notación asintótica?

¡Ponte a prueba con este pequeño quiz! Haz clic en cada pregunta para ver la respuesta y explicación. ✅❌

---

### ❓ Pregunta 1

¿Cuál notación representa el **mejor caso** de un algoritmo?

<details>
<summary>🟢 A) Ω (Omega)</summary>
✅ ¡Correcto! Ω representa el límite inferior, es decir, el mejor tiempo que se puede lograr en ciertas entradas.
</details>

<details>
<summary>🔴 B) Θ (Theta)</summary>
❌ Incorrecto. Θ representa el caso promedio (crecimiento exacto).
</details>

<details>
<summary>🔴 C) O (Big O)</summary>
❌ Incorrecto. O representa el peor caso.
</details>

---

### ❓ Pregunta 2

¿Qué notación se usa cuando un algoritmo se comporta exactamente igual a g(n)?

<details>
<summary>🔵 A) Θ (Theta)</summary>
✅ ¡Correcto! Θ(g(n)) significa que la función f(n) crece exactamente al mismo ritmo que g(n).
</details>

<details>
<summary>🔴 B) O (Big O)</summary>
❌ Nope. O(g(n)) solo da una cota superior.
</details>

<details>
<summary>🔴 C) Ω (Omega)</summary>
❌ Incorrecto. Ω solo da la cota inferior.
</details>

---

### ❓ Pregunta 3

Un algoritmo cuya complejidad depende de si la entrada es par o impar tiene una:

<details>
<summary>🟡 A) Notación Asintótica Condicional</summary>
✅ ¡Muy bien! Este comportamiento depende de condiciones específicas de entrada.
</details>

<details>
<summary>🔴 B) Notación Big O</summary>
❌ Incorrecto. Big O no considera condiciones, solo el peor caso general.
</details>

<details>
<summary>🔴 C) Complejidad constante</summary>
❌ Incorrecto. No es constante si depende del valor de entrada.
</details>

---

🎉 **¡Buen trabajo!** Si acertaste todo, ¡estás en camino a ser un(a) máster en análisis de algoritmos! Si no, repasa un poco arriba 😄

---

## 📎 Recursos adicionales

- 📘 [Big-O Cheat Sheet](https://www.bigocheatsheet.com/)
- 🎥 [Video: Notaciones asintóticas explicadas](https://www.youtube.com/watch?v=V6mKVRU1evU)
- 🧑‍🏫 Curso gratuito en [Visualgo](https://visualgo.net/en)

---
## 6. 📚 Referencias

- Brassard, G. & Bratley, P. (2002). *Fundamentos de Algoritmia*. Prentice Hall.  
- Cormen, T., et al. (2009). *Introduction to Algorithms*. MIT Press.  
