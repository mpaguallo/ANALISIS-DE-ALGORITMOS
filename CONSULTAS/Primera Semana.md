# 🧠 Algoritmia Elemental  
📘 *Basado en "Fundamentos de Algoritmia" — G. Brassard & P. Bratley*

---

## 📚 Índice
- [1.1 Notación](#11-notación)
- [1.2 Contradicción](#12-contradicción)
- [1.3 Inducción Matemática](#13-inducción-matemática)
- [1.4 Problemas Propuestos](#14-problemas-propuestos)

---

## 1.1. 📐 Notación

<details>
<summary>📘 Haz clic para ver detalles</summary>

### 🔢 Notación Matemática

- **Sumatorias**: `∑`  
  Ejemplo: `∑_{i=1}^{n} i = n(n+1)/2`
- **Productos**: `∏`  
  Ejemplo: `∏_{i=1}^{n} i = n!`
- **Funciones**:  
  f(n) = 3n² + 2n + 1 ➜ Crece como n²

### 🔁 Notación Asintótica

| Notación | Significado     | Ejemplo               |
|----------|------------------|------------------------|
| O(f(n))  | Cota superior    | f(n) = O(n²)           |
| Ω(f(n))  | Cota inferior    | f(n) = Ω(n log n)      |
| Θ(f(n))  | Cota ajustada    | f(n) = Θ(n)            |

</details>

---

## 1.2. ❌ Contradicción

<details>
<summary>🧩 ¿Cómo funciona?</summary>

1. Supón que la afirmación **es falsa**.
2. Deriva una **contradicción lógica**.
3. Concluye que la afirmación **es verdadera**.

### 🧪 Ejemplo: √2 es irracional

Supón √2 = a/b con a y b enteros coprimos.  
→ Se llega a que a y b son pares (contradicción).  
✅ Entonces, √2 no es racional.

</details>

---

## 1.3. 🧬 Inducción Matemática

<details>
<summary>📖 Explicación con ejemplo</summary>

### 🔸 Paso base  
Probar que se cumple para *n = 1* (o 0).

### 🔸 Paso inductivo  
Asumimos que se cumple para *n = k*.  
Probamos que se cumple para *n = k + 1*.

---

### 🧮 Ejemplo clásico

**Demostrar:**  
`1 + 2 + ... + n = n(n + 1)/2`

**Base:** n = 1  
1 = 1(1+1)/2 = 1 ✅

**Inducción:**  
Supón que vale para n = k  
`1 + 2 + ... + k = k(k+1)/2`

Queremos probar para k+1:  
`(k(k+1)/2) + (k+1) = (k+1)(k+2)/2` ✅

</details>

---

## 1.4. 🧠 Problemas Propuestos

<details>
<summary>🎯 Ver ejercicios con solución</summary>

### ✍️ Problema 1: Asintótica  
**¿Cuál es la complejidad de:**  
`f(n) = 4n³ + 2n log n + 5`

<details>
<summary>🧩 Ver solución</summary>

La función dominante es n³  
✅ f(n) = **O(n³)**

</details>

---

### ✍️ Problema 2: Contradicción  
**Demuestra:**  
No existen enteros impares cuyo cuadrado sea divisible por 4.

<details>
<summary>🧩 Ver solución</summary>

Todo impar: (2k + 1)  
(2k + 1)² = 4k² + 4k + 1 ≡ 1 (mod 4)  
✅ No divisible ⇒ Contradicción

</details>

---

### ✍️ Problema 3: Inducción  
**Demuestra que:**  
`2ⁿ > n²` para todo `n ≥ 5`

<details>
<summary>🧩 Ver solución</summary>

**Base:** n = 5  
2⁵ = 32 > 25 = 5² ✅

**Inducción:**  
Supón 2ᵏ > k²  
Queremos ver: 2ᵏ⁺¹ > (k+1)²  
Se cumple para k ≥ 5 por crecimiento exponencial  
✅ Demostrado

</details>

</details>

---

## 🎁 Bonus

<details>
<summary>💬 ¿Sabías que?</summary>

📌 La inducción matemática es como un dominó:  
Si el primero cae (base) y cada pieza empuja a la siguiente (paso inductivo)...  
¡todas caen!

</details>
