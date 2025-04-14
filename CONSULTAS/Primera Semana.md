<h1 align="center"> 🧠 Algoritmia Elemental  </h1>
<p align="center"> 📘 Basado en "Fundamentos de Algoritmia" — G. Brassard & P. Bratley
<p align="center"> <img src="https://mujeres360.org/wp-content/uploads/2021/09/algoritmos.jpeg" width="350"/> </p>

---

## 📚 Índice General

- 📝 [Notación](#1--notación)
- ❌ [Contradicción](#2--contradicción)
- 🧬 [Inducción Matemática](#3--inducción-matemática)
- 🧠 [Problemas Propuestos](#4--problemas-propuestos)
- ❓ [Preguntas Frecuentes](#5--preguntas-frecuentes)
- 🎯 [Mini Quiz](#6--mini-quiz)
---

## 1. 📝 Notación

<details>
<summary>📘 Haz clic para ver detalles</summary>

### 🔢 Notación Matemática

Las notaciones básicas permiten describir fórmulas compactas:

- **Sumatorias**: `∑`  
  \[
  \sum_{i=1}^{n} i = \frac{n(n+1)}{2}
  \]
- **Productos**: `∏`  
  \[
  \prod_{i=1}^{n} i = n!
  \]
- **Funciones**:  
  f(n) = 3n² + 2n + 1 → Dominada por **n²** a gran escala.

---

### 📈 Notación Asintótica

| Notación | Se lee como         | Significado                            | Ejemplo               |
|----------|---------------------|----------------------------------------|------------------------|
| O(f(n))  | "Orden de"          | Cota superior (comportamiento máximo)  | f(n) = O(n²)           |
| Ω(f(n))  | "Omega de"          | Cota inferior (mínimo crecimiento)     | f(n) = Ω(n log n)      |
| Θ(f(n))  | "Theta de"          | Cota ajustada (exacto a gran escala)   | f(n) = Θ(n)            |

✅ **Tip**: Esta notación permite comparar algoritmos de forma independiente del hardware.

</details>

---

## 2. ❌ Contradicción

<details>
<summary>🧩 ¿Cómo funciona esta técnica?</summary>

### 🧠 Lógica de la contradicción

1. Se **asume lo contrario** de lo que se quiere demostrar.
2. Se sigue un razonamiento lógico.
3. Si se llega a un **absurdo o contradicción**, la suposición inicial debe ser falsa.

---

### 🧪 Ejemplo: √2 es irracional

Supongamos que √2 = a/b, con a y b enteros coprimos.

- Elevando al cuadrado: 2 = a²/b² ⇒ a² = 2b²
- Entonces, a² es par ⇒ a es par ⇒ a = 2k
- Sustituimos y deducimos que b también es par

⚠️ Contradicción: ¡a y b no eran coprimos si ambos son pares!

✅ Por lo tanto, √2 **no es racional**.

</details>

---

## 3. 🧬 Inducción Matemática

<details>
<summary>📖 Ver explicación con ejemplo</summary>

La **inducción matemática** es una técnica de demostración fundamental.

### 🧱 Estructura

1. **Paso base**: se prueba para n = n₀ (generalmente 0 o 1).
2. **Paso inductivo**: se asume que vale para `n = k` y se prueba para `n = k + 1`.

---

### 🧮 Ejemplo clásico

**Demostrar que:**  
\[
1 + 2 + \dots + n = \frac{n(n + 1)}{2}
\]

- **Paso base**: n = 1  
  1 = 1(1+1)/2 = 1 ✅

- **Paso inductivo**:  
  Supón válida para n = k  
  \[
  1 + 2 + \dots + k = \frac{k(k + 1)}{2}
  \]

  Queremos demostrar:
  \[
  \left(\frac{k(k + 1)}{2}\right) + (k + 1) = \frac{(k + 1)(k + 2)}{2}
  \]

✅ ¡Se cumple! Entonces la fórmula vale para todo n ∈ ℕ.

---

📌 **Analogía**: como fichas de dominó que caen una tras otra si empujas la primera y cada una empuja la siguiente.

</details>

---

## 4. 🧠 Problemas Propuestos

<details>
<summary>🎯 Ver ejercicios con solución paso a paso</summary>

### ✍️ Problema 1: Complejidad Asintótica  
**¿Cuál es la complejidad de:**  
`f(n) = 4n³ + 2n log n + 5`

<details>
<summary>✅ Ver solución</summary>

- Termino dominante: 4n³  
- Otros crecen más lento  
⇒ f(n) = **O(n³)** ✅

</details>

---

### ✍️ Problema 2: Contradicción  
**Demuestra:**  
No existen enteros impares cuyo cuadrado sea divisible por 4.

<details>
<summary>✅ Ver solución</summary>

Todo impar: (2k + 1)  
(2k + 1)² = 4k² + 4k + 1 = impar  
⚠️ Nunca divisible por 4  
✅ Contradicción si asumimos lo contrario

</details>

---

### ✍️ Problema 3: Inducción  
**Demuestra que:**  
`2ⁿ > n²` para todo `n ≥ 5`

<details>
<summary>✅ Ver solución</summary>

**Base**:  
n = 5 → 2⁵ = 32 > 25 = 5² ✅

**Inducción**:  
Supón que 2ᵏ > k²  
Probar que 2ᵏ⁺¹ > (k + 1)²

2ᵏ⁺¹ = 2·2ᵏ > 2·k²  
Si 2·k² ≥ (k + 1)² para k ≥ 5, se cumple  
✅ Demostrado por desigualdad cuadrática

</details>

</details>

---

## 5. ❓ Preguntas Frecuentes

<details>
<summary>📊 ¿Qué diferencia hay entre O(n), Ω(n) y Θ(n)?</summary>

- **O(n)**: cota **superior** — cuánto *como máximo* crece una función.
- **Ω(n)**: cota **inferior** — cuánto *como mínimo* crece.
- **Θ(n)**: cota **ajustada** — si crece *exactamente* como n.

</details>

<details>
<summary>🔁 ¿La inducción matemática solo se aplica a números?</summary>

No. También puede aplicarse a **estructuras de datos**, **propiedades de grafos**, **series lógicas**, etc.

</details>

<details>
<summary>🔍 ¿Cómo saber qué término domina en una función?</summary>

Evalúa el **crecimiento** cuando `n → ∞`.  
Ejemplo:  
f(n) = 3n² + 100n + 5  
Dominante: `n²`  
✅ Ignora constantes y términos de menor orden.

</details>

---

## 6. 🎯 Mini Quiz

> ✅ Simulación de respuestas usando `<details>` para autocorrección.

---

### ✅ Pregunta 1  
¿Cuál es la notación correcta para expresar una función que no crece más que `n²`?

- [ ] Ω(n²)  
- [x] O(n²)  
- [ ] Θ(n²)

<details>
<summary>💡 Ver respuesta</summary>
✅ La notación **O(n²)** representa una **cota superior**.  
Es decir, el algoritmo no crece más rápido que n².
</details>

---

### ✅ Pregunta 2  
¿Es correcto afirmar que `2ⁿ > n²` para `n ≥ 5`?

- [x] Sí  
- [ ] No  
- [ ] Solo para n pares

<details>
<summary>💡 Ver explicación</summary>
✅ Por inducción matemática, se demuestra que `2ⁿ > n²` para todo `n ≥ 5`.  
El crecimiento exponencial supera al polinomial a partir de ese punto.
</details>

---

### ✅ Pregunta 3  
¿Cuál de estas expresiones **NO** representa una sumatoria?

- [ ] ∑  
- [ ] Σ  
- [x] ∏

<details>
<summary>💡 Ver explicación</summary>
✅ ∏ representa un **producto** acumulado, no una suma.  
∑ o Σ sí son símbolos válidos de sumatoria.
</details>

---

### ✅ Pregunta 4  
¿Cuál es el paso **clave** para aplicar inducción matemática?

- [ ] Aplicar logaritmos  
- [x] Asumir el caso `n = k`  
- [ ] Calcular el caso base con derivadas

<details>
<summary>💡 Ver explicación</summary>
✅ El paso inductivo parte de asumir que funciona para `n = k` y probar para `n = k + 1` .
</details>

---

### ✅ Pregunta 5  
¿Qué representa esta sumatoria?  
\[
\sum_{i=1}^{n} i
\]

- [ ] Producto de `n` factores  
- [ ] n veces el mismo número  
- [x] Suma de los primeros n enteros

<details>
<summary>💡 Ver explicación</summary>
✅ Representa `1 + 2 + 3 + ... + n`, cuya fórmula es `n(n+1)/2`.
</details>

---
