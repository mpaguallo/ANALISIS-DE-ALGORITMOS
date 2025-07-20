
<h1 align="center">⚡ Algoritmos Voraces</h1>
<h2 align="center">📘 4.1 Características | 4.2 Grafos No Dirigidos</h2>

---

<div align="center">
  <img src="https://img.shields.io/badge/Paradigma-Voraz-00C853?style=for-the-badge&logo=codeforces&logoColor=white" />
  <img src="https://img.shields.io/badge/Área-Algoritmia-1E88E5?style=for-the-badge&logo=gradle&logoColor=white" />
</div>

---

## 📚 Índice

- [🎯 Objetivo](#-objetivo)
- [✨ Características](#-características)
- [🕸️ Grafos No Dirigidos](#-grafos-no-dirigidos)
- [🌱 Ejemplos Clásicos](#-ejemplos-clásicos)
- [📋 MiniQuiz](#-miniquiz-sobre-algoritmos-voraces)
- [🎯 Video Educativo](#-video-educativo)

---

## 🎯 Objetivo

Explorar las **características** y **aplicaciones** de los algoritmos voraces, especialmente en el contexto de **grafos no dirigidos**, reconociendo cuándo son una buena elección y cómo ofrecen soluciones óptimas o aproximadas de forma eficiente.

---

## ✨ Características

<details open>
  <summary><strong>🔍 ¿Qué define a un algoritmo voraz?</strong></summary>

Los algoritmos voraces toman decisiones **localmente óptimas** con la esperanza de encontrar una **solución global óptima**. No retroceden ni reconsideran elecciones anteriores.

| Característica               | Descripción                                                              |
|-----------------------------|--------------------------------------------------------------------------|
| 🧠 Selección local óptima   | Toma la mejor decisión disponible en ese momento                        |
| 🔁 No hay retroceso         | Una vez que elige, no vuelve atrás ni corrige                            |
| 🧩 Subestructura óptima     | Una solución óptima global incluye soluciones óptimas a subproblemas     |
| ⚡ Eficiencia                | Suelen tener menor complejidad que otros enfoques como DP o Backtracking|


</details>

---

## 🕸️ Grafos No Dirigidos

<details>
  <summary><strong>🌐 ¿Cómo aplicamos algoritmos voraces en grafos?</strong></summary>

Los algoritmos voraces se aplican en grafos **no dirigidos** para construir **árboles de expansión mínima**, encontrar caminos más cortos, entre otros.

### 🌲 Árbol de Expansión Mínima (MST)

#### 🛠️ Kruskal

```java
// Pseudocódigo básico
OrdenarAristasPorPeso();
foreach(arista in ordenadas){
  if (!formaCiclo(arista)){
    agregarAlÁrbol(arista);
  }
}
```

➡️ Usa conjuntos disjuntos (Union-Find).  
➡️ Evita ciclos al construir el MST.

#### ⚙️ Prim

```java
// Pseudocódigo básico
InicializarColaPrioridad();
Mientras(hay vértices no visitados){
  seleccionar menor arista conectada;
  marcar vértice como visitado;
}
```

➡️ Usa heaps para mejorar rendimiento.  
➡️ Siempre extiende desde el MST parcial ya construido.

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/5/5c/Prim%27s_algorithm_example.gif" width="400" />
</p>

</details>

---

## 🌱 Ejemplos Clásicos

| Problema                            | ¿Voraz Funciona? | Algoritmo Clásico |
|------------------------------------|------------------|-------------------|
| Cambio de monedas (monedas bien diseñadas) | ✅ Sí           | Greedy Change     |
| Árbol de Expansión Mínima          | ✅ Sí           | Kruskal / Prim    |
| Caminos mínimos (con pesos positivos) | ✅ Parcialmente  | Dijkstra          |
| Problema de la mochila (0/1)       | ❌ No siempre    | Se prefiere DP    |

---

## 📋 MiniQuiz: ¿Qué tanto sabes sobre algoritmos voraces?

---

### ❓ Pregunta 1:
¿Cuál es una característica **clave** de los algoritmos voraces?

- A) Siempre revisan decisiones pasadas  
- B) Aseguran optimalidad en todos los problemas  
- C) Eligen la mejor opción en cada paso  
- D) Funcionan solo con árboles

<details>
<summary>💡 Ver respuesta</summary>
✅ C) Eligen la mejor opción en cada paso.
</details>

---

### ❓ Pregunta 2:
¿Qué algoritmo voraz se usa para construir un árbol de expansión mínima ordenando las aristas?

- A) Prim  
- B) Bellman-Ford  
- C) Kruskal  
- D) Dijkstra

<details>
<summary>💡 Ver respuesta</summary>
✅ C) Kruskal.
</details>

---

### ❓ Pregunta 3:
¿Qué estructura ayuda a Kruskal a evitar ciclos?

- A) Pila  
- B) Cola  
- C) Union-Find  
- D) Árbol AVL

<details>
<summary>💡 Ver respuesta</summary>
✅ C) Union-Find (con compresión de caminos).
</details>

---

### 🏁 ¿Cómo te fue?

- `0 - 1 correctas`: 🌱 ¡Buen inicio!  
- `2 correctas`: 🚀 ¡Sigue mejorando!  
- `3 correctas`: 🧠 ¡Nivel voraz desbloqueado!

---

## 🎯 Video Educativo

<p align="center">
  <strong>🎥 Aprende más sobre algoritmos voraces en el siguiente video:</strong><br><br>
  <a href="https://www.youtube.com/watch?v=ALtJncFD8N8">
    <img src="https://img.youtube.com/vi/ALtJncFD8N8/0.jpg" alt="Video explicativo" width="500">
  </a><br>
  ⬆️ Haz clic en la imagen para verlo en YouTube
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=FFD700&center=true&vCenter=true&multiline=true&width=600&lines=⚡+Algoritmos+Voraces+en+Acción" alt="Animación Typing" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=00C853&center=true&vCenter=true&multiline=true&width=600&lines=🧠+Elige+con+inteligencia+local%2C+espera+éxito!" alt="Animación Typing" />
</p>

