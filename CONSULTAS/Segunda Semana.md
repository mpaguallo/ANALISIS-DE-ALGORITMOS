
<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=24&pause=1000&color=FF69B4&center=true&vCenter=true&width=435&lines=✨+Algoritmia+elemental+💻" alt="Typing SVG" />
</p>

---

## 📚 Índice General

- 📘 [1. Algoritmia Elemental](#1--algoritmia-elemental)
- ⏱️ [2. Eficiencia de los Algoritmos](#2--eficiencia-de-los-algoritmos)
- ⚖️ [3. Análisis del Caso Medio](#3--análisis-del-caso-medio)
- 🧠 [4. Problemas Resueltos](#4--problemas-resueltos)
- ❓ [5. Preguntas Frecuentes](#5--preguntas-frecuentes)
- 🎯 [6. Mini Quiz](#6--mini-quiz)
- 📚 [7. Referencias](#7--referencias)

---

## 1. 📘 Algoritmia Elemental

<details>
<summary>🧩 ¿Qué es un algoritmo?</summary>


La algoritmia elemental estudia los **algoritmos básicos**, sus estructuras y comportamientos ante diferentes entradas. Son los bloques fundamentales para resolver problemas de forma sistemática, ordenada y eficiente.

### 🧩 Características clave de un algoritmo:
| ⚙️ Propiedad        | ✨ Descripción                                                   |
|--------------------|------------------------------------------------------------------|
| 🔄 Determinismo     | Cada paso debe estar claramente definido.                       |
| ⏱ Finitud           | El algoritmo debe terminar tras un número finito de pasos.      |
| 📥 Entrada           | Debe recibir uno o más datos de entrada.                        |
| 📤 Salida            | Debe generar uno o más resultados o respuestas.                 |
| ⚡ Efectividad       | Cada operación debe poder realizarse en un tiempo finito.       |

</details>

---

## 2. ⏱️ Eficiencia de los Algoritmos

<details>
<summary>⚙️ ¿Por qué importa?</summary>

🔍 Estudia **cuánto tiempo** y **cuánta memoria** necesita un algoritmo al ejecutarse según el tamaño de la entrada `n`.

### 🕐 -Eficiencia temporal:
Evalúa la **cantidad de operaciones** o el tiempo de ejecución.

#### 🧪 Ejemplo:
```cpp
for (int i = 0; i < n; i++) {
   cout << "Hola Pau! 💻";
}
```
---
🔍 **Complejidad temporal**: O(n)

### 💾 -Eficiencia espacial:
Evalúa el uso de **memoria o espacio adicional**.

#### Ejemplo:
- Un algoritmo que usa un arreglo auxiliar de tamaño `n` → Espacio: O(n)
- Si solo usa variables simples → Espacio: O(1)

### 🧮 -Notaciones más usadas:

| Notación | Nombre              | Significado                                     |
|----------|---------------------|-------------------------------------------------|
| O(f(n))  | 🧨 *Notación Big-O*  | Caso **peor**: el máximo tiempo/memoria.       |
| Ω(f(n))  | 🍃 *Omega*           | Caso **mejor**: el mínimo que puede tomar.     |
| Θ(f(n))  | ⚖️ *Theta*           | Caso **medio**: comportamiento promedio.       |

</details>

---

## 3. ⚖️ Análisis del Caso Medio

<details>
<summary>🔍 ¿Qué significa "caso medio"?</summary>

  🎯 Estudia el **comportamiento promedio** del algoritmo considerando la probabilidad de todas las entradas posibles.


### 📘 Según *Cormen*:
- El **caso medio** no siempre es fácil de calcular.
- Se requiere conocer la **distribución de las entradas**.
- Es útil cuando el caso peor no refleja la realidad frecuente.

### 📙 Según *Brassard*:
- Se modela el promedio de pasos necesarios en una **situación típica**.
- Ejemplo: En una **búsqueda secuencial** sobre una lista de `n` elementos:
  - Caso mejor: `1` comparación.
  - Caso peor: `n` comparaciones.
  - 🧠 **Caso medio**: ≈ `n/2` comparaciones.

### 📐 Fórmula del caso medio:
```math
T(n) = Σ [ P(i) * T_i(n) ]     
```
<p align="center">
para i en entradas posibles
</p>
Donde:
- `P(i)` = probabilidad de la entrada `i`.
- `T_i(n)` = tiempo que toma el algoritmo con esa entrada.


</details>

---

## 4. 🧠 Problemas Resueltos

<details>
<summary>🎯 Ver ejercicios con solución paso a paso</summary>

### ✅ Problema 1: Comparar eficiencia  
¿Qué algoritmo es más eficiente para grandes entradas: uno con `O(n log n)` o uno con `O(n²)`?

<details>
<summary>Ver respuesta</summary>

`O(n log n)` crece **más lento** que `O(n²)` a medida que `n` aumenta.  
✅ Por lo tanto, es **más eficiente**.

</details>

---

### ✅ Problema 2: Análisis de caso medio  
¿Cuál es el tiempo promedio de búsqueda en un arreglo sin ordenar?

<details>
<summary>Ver respuesta</summary>

El promedio de comparaciones es:  
\[
\frac{1 + 2 + \dots + n}{n} = \frac{n+1}{2}
\]  
✅ Tiempo medio: **O(n)**

</details>

---

### ✅ Problema 3: Clasificación de algoritmos

Ordena de **más eficiente a menos** los siguientes algoritmos:  
- A: O(n log n)  
- B: O(n²)  
- C: O(log n)

<details>
<summary>Ver respuesta</summary>

1. C: O(log n) → más eficiente  
2. A: O(n log n)  
3. B: O(n²) → menos eficiente  

✅ ¡Correcto!

</details>

</details>

---

## 5. ❓ Preguntas Frecuentes

<details>
<summary>📊 ¿La notación O(n) se refiere siempre al peor caso?</summary>

No necesariamente. Aunque comúnmente se usa para el **peor caso**, también puede referirse al promedio, si se especifica.

</details>

<details>
<summary>⚖️ ¿Qué significa caso medio en la práctica?</summary>

Es el comportamiento **esperado** cuando las entradas son **aleatorias o diversas**.  
Suele estar entre el mejor y el peor caso.

</details>

<details>
<summary>🌀 ¿Cómo comparar dos algoritmos con diferente eficiencia?</summary>

Compara sus **funciones de crecimiento** ignorando constantes y términos menores.  
Ej:  
`f(n) = n² + 5n + 3` → O(n²)  
`g(n) = 10n log n` → O(n log n) → **Mejor**

</details>

---

## 6. 🎯 Mini Quiz

> ✅ ¡Simulación de autocorrección para estudiar de forma divertida!

---

### ✅ Pregunta 1  
¿Cuál es la notación correcta para una **cota superior**?

- [ ] Ω(n)  
- [x] O(n)  
- [ ] Θ(n)

<details><summary>💡 Ver explicación</summary>
✅ La notación O(n) representa el **crecimiento máximo posible** del algoritmo.
</details>

---

### ✅ Pregunta 2  
¿Qué tipo de análisis se basa en entradas aleatorias?

- [ ] Peor caso  
- [ ] Mejor caso  
- [x] Caso medio

<details><summary>💡 Ver explicación</summary>
✅ El caso medio asume una distribución probable de entradas para calcular el comportamiento típico.
</details>

---

### ✅ Pregunta 3  
¿Cuál algoritmo es más eficiente para `n` muy grande?

- [ ] O(n²)  
- [x] O(n log n)  
- [ ] O(n³)

<details><summary>💡 Ver explicación</summary>
✅ O(n log n) crece mucho más lento que O(n²) o O(n³), lo que lo hace ideal para grandes volúmenes de datos.
</details>

---
### ✅ Pregunta 4
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

### ✅ Pregunta 5  
Verdadero o Falso:  
> "El análisis del caso medio se basa en suposiciones probabilísticas sobre las entradas."

- Verdadero  
- Falso  

<details><summary>💡 Ver explicación</summary>
✅ ¡Verdadero! El **caso medio** supone que todas las entradas del mismo tamaño son igualmente probables. Se calcula como un valor esperado ponderado.
</details>

---
## 7. 📚 Referencias

<details>
<summary>Haz clic para ver detalles</summary>
  
- Cormen, T. H., Leiserson, C. E., Rivest, R. L., & Stein, C. (2022). *Introduction to Algorithms* (4th ed.).
  
- Brassard, G., & Bratley, P. *Fundamentos de algoritmia*
  
</details>

---

<p align="center">🧩 "Comprender la eficiencia de los algoritmos es como afilar la mente: menos esfuerzo, más impacto."</p>
