
<h1 align="center">🎲 Algoritmos Probabilistas</h1>
<h2 align="center">📘 Semana 15 – Algoritmos de Monte Carlo</h2>

---

<div align="center">
  <img src="https://img.shields.io/badge/Tema-Algoritmos%20de%20Monte%20Carlo-blueviolet?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Semana-15-success?style=for-the-badge" />
</div>

---

## 📚 Índice

- [🎯 Objetivo](#-objetivo)
- [🔍 ¿Qué es un Algoritmo de Monte Carlo?](#-qué-es-un-algoritmo-de-monte-carlo)
- [🧪 Ejemplo Clásico: Estimar PI](#-ejemplo-clásico-estimar-pi)
- [📊 Aplicaciones Comunes](#-aplicaciones-comunes)
- [🧠 Ventajas y Desventajas](#-ventajas-y-desventajas)
- [🎥 Video Educativo](#-video-educativo)
- [📋 MiniQuiz](#-miniquiz-sobre-monte-carlo)

---

## 🎯 Objetivo

Comprender el funcionamiento, uso y aplicaciones de los **algoritmos de Monte Carlo**, que utilizan el azar para resolver problemas que podrían ser demasiado complejos con métodos deterministas.

---

## 🔍 ¿Qué es un Algoritmo de Monte Carlo?

> Un algoritmo **Monte Carlo** es un tipo de algoritmo probabilista que **no garantiza resultados exactos**, pero ofrece **aproximaciones eficientes** con alta probabilidad de acierto.

Se basa en tres ideas principales:

1. Generar valores aleatorios.
2. Ejecutar muchas simulaciones.
3. Calcular una estimación basada en resultados agregados.

---

## 🧪 Ejemplo Clásico: Estimar PI

```java
int dentro = 0, total = 100000;
for (int i = 0; i < total; i++) {
    double x = Math.random();
    double y = Math.random();
    if (x*x + y*y <= 1) dentro++;
}
double pi = 4.0 * dentro / total;
System.out.println("PI estimado: " + pi);
```

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/8/84/Pi_30K.gif" width="300" alt="Monte Carlo PI Estimation" />
</p>

Este método genera puntos aleatorios dentro de un cuadrado y calcula cuántos caen dentro del círculo inscrito.

---

## 📊 Aplicaciones Comunes

- 📈 Simulación financiera
- 🧪 Cálculo de integrales definidas
- 🎮 Física computacional (partículas, sistemas)
- 🎲 Juegos y simulaciones aleatorias
- 🧬 Biología y genética (simulación de poblaciones)
- 🌐 Estimación de probabilidades en sistemas complejos

---

## 🧠 Ventajas y Desventajas

| Ventajas                                      | Desventajas                                  |
|----------------------------------------------|----------------------------------------------|
| Fácil de implementar                          | No siempre produce resultados exactos        |
| Escalable a problemas de alta dimensión       | Requiere muchas muestras para buena precisión|
| No necesita solución exacta                   | Depende de buena generación de aleatoriedad  |
| Útil cuando no hay solución analítica simple  |                                              |

---

## 🎥 Video Educativo

<p align="center">
  <strong>🎥 Aprende sobre el Método de Monte Carlo</strong><br><br>
  <a href="https://www.youtube.com/watch?v=v0nISE5B2wQ">
    <img src="https://img.youtube.com/vi/v0nISE5B2wQ/0.jpg" alt="Video sobre Monte Carlo" width="500">
  </a><br>
  ⬆️ Haz clic en la imagen para verlo en YouTube
</p>

---

## 📋 MiniQuiz: Sobre Monte Carlo

### ❓ Pregunta 1:
¿Qué tipo de resultado ofrece Monte Carlo?

- A) Exacto  
- B) Aleatorio sin sentido  
- C) Estimación con probabilidad  
- D) Siempre incorrecto  

<details>
<summary>💡 Ver respuesta</summary>
✅ C) Estimación con probabilidad
</details>

---

### ❓ Pregunta 2:
¿Cuál es una aplicación típica de Monte Carlo?

- A) Compilar código  
- B) Calcular áreas y probabilidades  
- C) Ordenar listas  
- D) Buscar errores lógicos  

<details>
<summary>💡 Ver respuesta</summary>
✅ B) Calcular áreas y probabilidades
</details>

---

### ❓ Pregunta 3:
¿Qué se requiere para aumentar la precisión de Monte Carlo?

- A) Menos muestras  
- B) Más muestras  
- C) Menos código  
- D) Tiempo constante  

<details>
<summary>💡 Ver respuesta</summary>
✅ B) Más muestras
</details>

---

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=FFD700&center=true&vCenter=true&multiline=true&width=600&lines=📘+Semana+15:+Monte+Carlo" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=FFD700&center=true&vCenter=true&multiline=true&width=600&lines=¡Simula,+calcula+y+estima+con+azar!" />
</p>
