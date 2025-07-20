
<h1 align="center">🎲 Algoritmos Probabilistas</h1>
<h2 align="center">📘 Semana 4 – Tiempo Esperado & Algoritmos Numéricos</h2>

---

<div align="center">
  <img src="https://img.shields.io/badge/Tema-Algoritmos%20Probabilistas-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Semana-4-lightgrey?style=for-the-badge" />
</div>

---

## 📚 Índice

- [🎯 Objetivo](#-objetivo)
- [🔢 ¿Qué son los Algoritmos Probabilistas?](#-qué-son-los-algoritmos-probabilistas)
- [⏱️ Tiempo Esperado](#-tiempo-esperado)
  - [📌 Ejemplo: Búsqueda Aleatoria](#-ejemplo-búsqueda-aleatoria)
- [📐 Algoritmos Numéricos](#-algoritmos-numéricos)
  - [🧮 Método de Monte Carlo](#-método-de-monte-carlo)
  - [⚙️ Otros métodos](#-otros-métodos)
- [🧠 Conceptos Clave](#-conceptos-clave)
- [🎥 Video Educativo](#-video-educativo)
- [📋 MiniQuiz](#-miniquiz-algoritmos-probabilistas-y-numéricos)

---

## 🎯 Objetivo

Comprender la naturaleza de los algoritmos probabilistas, analizar su **tiempo esperado**, y estudiar algoritmos numéricos como **Monte Carlo**, útiles para estimaciones y simulaciones donde los métodos deterministas no son eficientes.

---

## 🔢 ¿Qué son los Algoritmos Probabilistas?

> Son algoritmos que toman decisiones en base a **valores aleatorios**, lo que puede provocar **resultados distintos** incluso con la misma entrada.

Existen dos tipos:

- **Las Vegas**: Siempre dan el resultado correcto, pero el tiempo de ejecución puede variar.
- **Monte Carlo**: Pueden dar un resultado incorrecto con **cierta probabilidad**.

---

## ⏱️ Tiempo Esperado

> Es el promedio de tiempo que un algoritmo tarda en completarse, considerando su comportamiento aleatorio.

### 📌 Ejemplo: Búsqueda Aleatoria

```java
int busquedaAleatoria(int[] arr, int objetivo) {
    Random rand = new Random();
    int intentos = 0;
    while (true) {
        int index = rand.nextInt(arr.length);
        intentos++;
        if (arr[index] == objetivo) {
            return intentos;
        }
    }
}
```

💡 Este algoritmo tiene **tiempo esperado O(n)** si el elemento está presente.


---

## 📐 Algoritmos Numéricos

> Son técnicas para resolver problemas matemáticos **aproximadamente** mediante métodos computacionales.

### 🧮 Método de Monte Carlo

> Utiliza simulaciones aleatorias para estimar valores numéricos, como **áreas, probabilidades o integrales**.

#### 🧪 Ejemplo: Estimar PI

```java
int dentro = 0, total = 10000;
for (int i = 0; i < total; i++) {
    double x = Math.random();
    double y = Math.random();
    if (x * x + y * y <= 1) dentro++;
}
double pi = 4.0 * dentro / total;
System.out.println("PI estimado: " + pi);
```


### ⚙️ Otros métodos

- **Método de Newton-Raphson** para encontrar raíces de funciones.
- **Método de Simpson o Trapecios** para integración numérica.
- **Métodos iterativos** para sistemas de ecuaciones lineales.

---

## 🧠 Conceptos Clave

| Concepto             | Descripción                                                  |
|----------------------|--------------------------------------------------------------|
| Probabilista         | Usa decisiones aleatorias                                    |
| Tiempo esperado      | Tiempo promedio de ejecución                                 |
| Las Vegas            | Siempre correcto, tiempo variable                            |
| Monte Carlo          | Rápido pero puede tener margen de error                      |
| Algoritmos Numéricos | Métodos computacionales para resolver problemas matemáticos  |

---

## 🎥 Video Educativo

<p align="center">
  <strong>🎥 Aprende sobre Algoritmos Probabilistas y Monte Carlo</strong><br><br>
  <a href="https://www.youtube.com/watch?v=sU4UMh_W8W8" target="_blank">
    <img src="https://img.youtube.com/vi/sU4UMh_W8W8/maxresdefault.jpg" alt="Algoritmos Probabilistas" width="500">
  </a><br>
  ⬆️ Haz clic en la imagen para verlo en YouTube
</p>


---

## 📋 MiniQuiz: Algoritmos Probabilistas y Numéricos

### ❓ Pregunta 1:
¿Qué tipo de algoritmo siempre da el resultado correcto pero con tiempo variable?

- A) Monte Carlo  
- B) Newton-Raphson  
- C) Las Vegas  
- D) Bubble Sort  

<details>
<summary>💡 Ver respuesta</summary>
✅ C) Las Vegas
</details>

---

### ❓ Pregunta 2:
¿Cuál es el propósito del Método de Monte Carlo?

- A) Ordenar datos  
- B) Buscar elementos exactos  
- C) Estimar valores mediante simulación  
- D) Verificar errores en código  

<details>
<summary>💡 Ver respuesta</summary>
✅ C) Estimar valores mediante simulación
</details>

---

### ❓ Pregunta 3:
¿Qué representa el "tiempo esperado" en un algoritmo?

- A) El peor tiempo posible  
- B) El promedio de ejecuciones posibles  
- C) El tiempo de compilación  
- D) El mejor tiempo posible  

<details>
<summary>💡 Ver respuesta</summary>
✅ B) El promedio de ejecuciones posibles
</details>

---

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=00BFFF&center=true&vCenter=true&multiline=true&width=600&lines=📘+Semana+4:+Algoritmos+Probabilistas" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=00BFFF&center=true&vCenter=true&multiline=true&width=600&lines=¡Explora+el+azar+y+la+eficiencia!" />
</p>

