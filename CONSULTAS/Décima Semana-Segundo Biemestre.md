
<h1 align="center">⚡ Algoritmos Voraces</h1>
<h2 align="center">📘 1.1 Grafos Dirigidos</h2>

---

<div align="center">
  <img src="https://img.shields.io/badge/Paradigma-Voraz-00C853?style=for-the-badge&logo=codeforces&logoColor=white" />
  <img src="https://img.shields.io/badge/Grafos-Dirigidos-1E88E5?style=for-the-badge&logo=git&logoColor=white" />
</div>

---

## 📚 Índice

- [🎯 Objetivo](#-objetivo)
- [🚦 ¿Qué son los grafos dirigidos?](#-qué-son-los-grafos-dirigidos)
- [🧠 Aplicación de algoritmos voraces](#-aplicación-de-algoritmos-voraces)
- [🛣️ Dijkstra en grafos dirigidos](#-dijkstra-en-grafos-dirigidos)
- [📋 MiniQuiz](#-miniquiz-sobre-grafos-dirigidos)

---

## 🎯 Objetivo

Explorar el uso de algoritmos voraces sobre **grafos dirigidos**, con énfasis en encontrar caminos más cortos desde un nodo origen a todos los demás.

---

## 🚦 ¿Qué son los grafos dirigidos?

Los **grafos dirigidos (digraphs)** son estructuras compuestas por nodos conectados por aristas con una dirección. Es decir, una conexión de `A → B` **no implica** que exista también `B → A`.

<p align="center">
  <img src="http://163.10.22.82/OAS/estructuras_de_grafos/grafoDirigido.gif" width="300" />
</p>


🔁 En los algoritmos, esto afecta la forma en que se recorren los nodos y se calculan caminos.

---

## 🧠 Aplicación de algoritmos voraces

En grafos dirigidos, los algoritmos voraces se utilizan principalmente para encontrar **caminos mínimos** desde una fuente.

### 💡 ¿Por qué funcionan?

Los grafos dirigidos con **pesos positivos** permiten aplicar algoritmos como **Dijkstra**, que elige el nodo más cercano y actualiza los costos de sus vecinos, sin necesidad de revisar caminos anteriores.

---

## 🛣️ Dijkstra en grafos dirigidos

<details open>
  <summary><strong>🚀 Descripción paso a paso</strong></summary>

### 🧮 Ejemplo de Pseudocódigo

```python
Inicializar distancias[] con infinito excepto para la fuente;
Crear una cola de prioridad;
Mientras la cola no esté vacía:
    Extraer el nodo con menor distancia;
    Para cada vecino no visitado:
        Si la distancia actual + peso < distancia[vecino]:
            Actualizar distancia[vecino];
            Añadir vecino a la cola;
```

🎯 Se considera voraz porque **elige siempre el camino localmente más corto**, esperando encontrar el camino más corto global.

</details>

---

## 📋 MiniQuiz: ¿Qué tanto sabes sobre grafos dirigidos y algoritmos voraces?

---

### ❓ Pregunta 1:
¿Qué caracteriza a un grafo dirigido?

- A) Todos los nodos tienen igual grado  
- B) Las aristas tienen dirección  
- C) Solo existe una ruta entre dos nodos  
- D) No puede tener ciclos

<details>
<summary>💡 Ver respuesta</summary>
✅ B) Las aristas tienen dirección.
</details>

---

### ❓ Pregunta 2:
¿Qué algoritmo voraz se usa para caminos mínimos en grafos dirigidos con pesos positivos?

- A) Floyd-Warshall  
- B) Kruskal  
- C) Dijkstra  
- D) Prim

<details>
<summary>💡 Ver respuesta</summary>
✅ C) Dijkstra.
</details>

---

### ❓ Pregunta 3:
¿Por qué Dijkstra es considerado voraz?

- A) Porque explora todos los caminos  
- B) Porque usa una pila  
- C) Porque toma la decisión más prometedora en cada paso  
- D) Porque calcula pesos negativos

<details>
<summary>💡 Ver respuesta</summary>
✅ C) Porque toma la decisión más prometedora en cada paso.
</details>

---

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=FFA726&center=true&vCenter=true&multiline=true&width=600&lines=⚡+GRAFOS+DIRIGIDOS+Y+ALGORITMOS+VORACES" alt="Animación Typing" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=00B0FF&center=true&vCenter=true&multiline=true&width=600&lines=📌+El+camino+más+corto+comienzan" alt="Animación Typing" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=00B0FF&center=true&vCenter=true&multiline=true&width=600&lines=Con+la+mejor+decisión" alt="Animación Typing" />
</p>

