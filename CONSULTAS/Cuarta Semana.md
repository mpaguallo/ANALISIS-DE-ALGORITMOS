<h1 align="center">🎯 ¡Entiende cómo crecen los algoritmos! 🌟</h1>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=f95050&center=true&vCenter=true&width=435&lines='Notación+Asintótica'"/>
</p>

---

## 📑 Índice de Contenidos

- [🧠 ¿Qué es la Notación Asintótica?](#🧠-qué-es-la-notación-asintótica)
- [✨ Notación O: La cota superior](#✨-notación-o-la-cota-superior)
- [🧮 Ejemplo práctico](#🧮-ejemplo-práctico)
- [🔢 Tabla comparativa de complejidades](#🔢-tabla-comparativa-de-complejidades)
- [🎮 MiniQuiz Interactivo sobre Notación Asintótica 🧩](#🎮-miniquiz-interactivo-sobre-notación-asintótica-🧩)
- [🎉 ¡Sigue practicando!](#🎉-¡sigue-practicando!)

---

## 🧠 ¿Qué es la Notación Asintótica?

La **notación asintótica** es como una lupa 🔍 que nos ayuda a analizar cómo crece el tiempo o espacio que usa un algoritmo cuando el tamaño de la entrada (`n`) se hace **enorme**. 😮

> **💡 En palabras simples:**  
> Nos permite comparar algoritmos sin preocuparnos por detalles pequeños (como constantes o hardware). Solo nos importa **cómo escala** el algoritmo a medida que el problema crece.

Por ejemplo, ¿es mejor un algoritmo que duplica su tiempo al doblar la entrada o uno que lo aumenta exponencialmente? La notación asintótica nos da la respuesta. 🚀

---

## ✨ Notación O: La cota superior

La notación **O(g(n))** describe el **peor caso** del crecimiento de un algoritmo. Es como decir: "¡No te preocupes, este algoritmo no será más lento que esto!" 😎

### 🔍 Definición formal (según Cormen et al.):

Una función `f(n)` es **O(g(n))** si existen constantes positivas `c` y `n₀` tales que:

- **`f(n)`**: Tiempo real del algoritmo.  
- **`g(n)`**: Una función que limita cuánto puede crecer `f(n)`.  
- **En resumen**: `f(n)` no crece más rápido que `g(n)` (multiplicado por una constante) cuando `n` es grande.

> **🎯 Ejemplo visual**: Imagina que `f(n)` es un coche 🚗 y `g(n)` es la velocidad máxima permitida. No importa qué tan rápido intente ir el coche, nunca superará esa velocidad límite.

---

## 🧮 Ejemplo práctico

Supongamos que un algoritmo realiza:

f(n) = 3n + 5
- Cuando `n` es grande, el término `3n` es el que manda. El `+5` es como una gota en el océano 🌊.  
- Ignoramos el coeficiente `3` y el término constante `5`. Entonces:

f(n) = O(n)

**Resultado**: El algoritmo tiene un crecimiento **lineal**. 📈

> **💡 Analogía**: Si estás contando monedas 💰, no importa si cuentas 3 monedas por segundo o 5 extra al final. Lo importante es que el tiempo crece proporcionalmente al número de monedas (`n`).

---

## 🔢 Tabla comparativa de complejidades

Aquí tienes una tabla para comparar los tipos de crecimiento más comunes. ¡Piénsalo como un ranking de velocidad! 🏎️

| **Notación** | **Nombre**          | **Eficiencia**         | **Ejemplo**                        |
|--------------|---------------------|------------------------|------------------------------------|
| **O(1)**     | Constante           | ⚡ Súper rápido         | Acceder a un elemento en un arreglo |
| **O(log n)** | Logarítmico         | 🚀 Muy eficiente        | Búsqueda binaria                   |
| **O(n)**     | Lineal              | 🛤️ Bueno               | Recorrer una lista                 |
| **O(n log n)**| Quasilineal        | 🌟 Óptimo para ordenar | QuickSort, MergeSort               |
| **O(n²)**    | Cuadrático          | 🐢 Lento                | Ordenamiento burbuja               |
| **O(2ⁿ)**    | Exponencial         | 🐌 Imposible con `n` grandes | Fuerza bruta en problemas NP  |

---

## 🎮 MiniQuiz Interactivo sobre Notación Asintótica 🧩

¡Ponte a prueba con estas preguntas sobre notación asintótica!  
Haz clic en los bloques desplegables para revelar las respuestas. ✅

---

### 🧠 **1. ¿Qué representa la notación O en análisis de algoritmos?**

🔘 a) Cota inferior del tiempo de ejecución  
🔘 b) Cota superior del tiempo de ejecución  
🔘 c) Tiempo exacto de ejecución  
🔘 d) Ninguna de las anteriores  

<details>
<summary>🔍 Ver respuesta</summary>
<b>✅ b) Cota superior del tiempo de ejecución</b>  
📌 La notación <code>O</code> describe el límite máximo del crecimiento de un algoritmo, asegurando que no será más lento que una función dada para valores grandes de <code>n</code>.
</details>

---

### 📊 **2. Si un algoritmo tiene un tiempo de ejecución \( f(n) = 5n^3 + 2n^2 + 10 \), ¿cuál es su orden de complejidad?**

🔘 a) O(n)  
🔘 b) O(n²)  
🔘 c) O(n³)  
🔘 d) O(n⁴)  

<details>
<summary>🔍 Ver respuesta</summary>
<b>✅ c) O(n³)</b>  
📌 El término dominante es \( 5n^3 \), por lo que ignoramos los términos de menor orden \( 2n^2, 10 \) y las constantes, dando como resultado <code>O(n^3)</code>.
</details>

---

### 🚀 **3. ¿Cuál de estas complejidades es la más eficiente para grandes valores de `n`?**

🔘 a) O(n²)  
🔘 b) O(log n)  
🔘 c) O(n)  
🔘 d) O(2ⁿ)  

<details>
<summary>🔍 Ver respuesta</summary>
<b>✅ b) O(log n)</b>  
📌 El crecimiento logarítmico (<code>O(log n)</code>) es mucho más lento que los demás, lo que lo hace ideal para problemas con grandes valores de <code>n</code>.
</details>

---

### ❓ **4. Verdadero o falso: En la notación `O(g(n))`, los términos constantes y coeficientes son importantes para determinar el orden de crecimiento.**

🔘 a) Verdadero  
🔘 b) Falso  

<details>
<summary>🔍 Ver respuesta</summary>
<b>✅ b) Falso</b>  
📌 En la notación <code>O</code>, ignoramos constantes y términos de menor orden para enfocarnos únicamente en el crecimiento dominante de la función.
</details>

---

> 🧾 **Referencias:**  
> 📘 *Introduction to Algorithms* (Cormen et al., 2022)  
> 📙 *Fundamentos de Algoritmia* (Brassard & Bratley)
