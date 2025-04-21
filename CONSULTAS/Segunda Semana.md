
<!-- Encabezado súper cute y decorativo ✨ -->
<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=24&pause=1000&color=FF69B4&center=true&vCenter=true&width=435&lines=✨+Algoritmia+elemental+💻" alt="Typing SVG" />
</p>

---

## 🚀 Navegación Rápida

| Sección | Enlace |
|--------|--------|
| 🧠 ¿Qué es la algoritmia elemental? | [Ir](#1-qué-es-la-algoritmia-elemental) |
| ⚙️ Eficiencia de los algoritmos     | [Ir](#12-eficiencia-de-los-algoritmos) |
| 📊 Caso medio                      | [Ir](#13-análisis-del-caso-medio) |
| 🛠️ Ejemplo comparativo             | [Ir](#🛠️-ejemplo-comparativo) |
| 🎯 Mini Quiz interactivo           | [Ir](#🎯-mini-quiz) |
| 🌟 ¿Sabías que...?                 | [Ir](#🌟-¿sabías-que--curiosidades-de-algoritmos-) |
| 📚 Referencias                    | [Ir](#📚-referencias) |

---



---
## 🧠 1. ¿Qué es la algoritmia elemental?

> 💡 **Definición:**  
La algoritmia elemental estudia los **algoritmos básicos**, sus estructuras y comportamientos ante diferentes entradas. Son los bloques fundamentales para resolver problemas de forma sistemática, ordenada y eficiente.

### 🧩 Características clave de un algoritmo:
| ⚙️ Propiedad        | ✨ Descripción                                                   |
|--------------------|------------------------------------------------------------------|
| 🔄 Determinismo     | Cada paso debe estar claramente definido.                       |
| ⏱ Finitud           | El algoritmo debe terminar tras un número finito de pasos.      |
| 📥 Entrada           | Debe recibir uno o más datos de entrada.                        |
| 📤 Salida            | Debe generar uno o más resultados o respuestas.                 |
| ⚡ Efectividad       | Cada operación debe poder realizarse en un tiempo finito.       |

## ⚙️ 1.2 Eficiencia de los algoritmos

> 🔍 Estudia **cuánto tiempo** y **cuánta memoria** necesita un algoritmo al ejecutarse según el tamaño de la entrada `n`.

### 🕐 Eficiencia temporal:
Evalúa la **cantidad de operaciones** o el tiempo de ejecución.

#### 🧪 Ejemplo:
```cpp
for (int i = 0; i < n; i++) {
   cout << "Hola Pau! 💻";
}
```
🔍 **Complejidad temporal**: O(n)

### 💾 Eficiencia espacial:
Evalúa el uso de **memoria o espacio adicional**.

#### Ejemplo:
- Un algoritmo que usa un arreglo auxiliar de tamaño `n` → Espacio: O(n)
- Si solo usa variables simples → Espacio: O(1)

### 🧮 Notaciones más usadas:

| Notación | Nombre              | Significado                                     |
|----------|---------------------|-------------------------------------------------|
| O(f(n))  | 🧨 *Notación Big-O*  | Caso **peor**: el máximo tiempo/memoria.       |
| Ω(f(n))  | 🍃 *Omega*           | Caso **mejor**: el mínimo que puede tomar.     |
| Θ(f(n))  | ⚖️ *Theta*           | Caso **medio**: comportamiento promedio.       |

## 📊 1.3 Análisis del caso medio

> 🎯 Estudia el **comportamiento promedio** del algoritmo considerando la probabilidad de todas las entradas posibles.

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

## 🛠️ Ejemplo comparativo

### Problema: Buscar un número en una lista no ordenada

| Caso        | Comparaciones esperadas |
|-------------|-------------------------|
| Mejor (está al inicio) | 1       |
| Peor (está al final o no está) | n       |
| Medio (posición aleatoria) | n/2     |

> 🧠 **Conclusión**: Aunque el caso peor es importante, el **caso medio refleja lo que ocurre en la práctica.**




---

### 🧠 Quizlet interactivo para repasar
## 🎯 Mini Quiz  
✅ Simulación de respuestas usando `<details>` para autocorrección.

---

### ✅ Pregunta 1  
¿Cuál notación representa el peor caso de un algoritmo?

- O(n)  
- Θ(n)  
- Ω(n)  

<details>
<summary>💡 Ver respuesta</summary>
🔺 La notación **O(n)** representa el **peor caso** de un algoritmo, ya que define un límite superior para el crecimiento de su tiempo de ejecución.
</details>

---

### ✅ Pregunta 2  
¿Cuál de estas opciones representa un **tiempo constante**?

- O(1)  
- O(n)  
- O(n log n)  

<details>
<summary>💡 Ver respuesta</summary>
⚡ **O(1)** significa que el tiempo de ejecución no depende del tamaño de la entrada. ¡Es lo más rápido que se puede lograr!
</details>

---

### ✅ Pregunta 3  
En un algoritmo de búsqueda lineal, ¿cuál es el tiempo promedio de ejecución?

- O(1)  
- O(n)  
- O(n/2)  

<details>
<summary>💡 Ver explicación</summary>
📊 En promedio, el elemento será encontrado a la mitad de la lista:  
\[
T_{\text{medio}}(n) = \frac{1}{n} \sum_{i=1}^{n} i = \frac{n+1}{2}
\]  
Esto se simplifica como **O(n)** en notación Big-O.
</details>

---

### ✅ Pregunta 4  
¿Qué notación representa el **comportamiento exacto** del algoritmo?

- Θ(n)  
- O(n)  
- Ω(n²)  

<details>
<summary>💡 Ver respuesta</summary>
⚖️ **Θ(n)** representa el comportamiento exacto del algoritmo si el peor y mejor caso coinciden en orden de crecimiento.
</details>

---

### ✅ Pregunta 5  
Verdadero o Falso:  
> "El análisis del caso medio se basa en suposiciones probabilísticas sobre las entradas."

- Verdadero  
- Falso  

<details>
<summary>💡 Ver explicación</summary>
✅ ¡Verdadero! El **caso medio** supone que todas las entradas del mismo tamaño son igualmente probables. Se calcula como un valor esperado ponderado.
</details>


---

### 🌟 ¿Sabías que...? — Curiosidades de algoritmos 🌈

🧩 El término "algoritmo" proviene del matemático persa **Al-Juarismi**, cuyo nombre latinizado fue “Algoritmi”.  
  
🧠 El algoritmo más antiguo registrado es el de **Euclides**, para calcular el máximo común divisor (MCD), ¡tiene más de 2300 años!

📦 Google utiliza miles de algoritmos en paralelo para mostrar resultados de búsqueda en milisegundos.

🎲 ¡Incluso en los videojuegos y TikToks hay algoritmos detrás de cada decisión!

🧚‍♀️ Los algoritmos de aprendizaje profundo imitan el funcionamiento del cerebro, y se usan en medicina, arte, y más 💙

---

## 📚 Referencias

- Cormen, T. H., Leiserson, C. E., Rivest, R. L., & Stein, C. (2022). *Introduction to Algorithms* (4th ed.).
- Brassard, G., & Bratley, P. *Fundamentos de algoritmia*
