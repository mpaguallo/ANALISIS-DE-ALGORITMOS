
<h1 align="center">⚔️ Algoritmos Divide y Vencerás</h1>
<h2 align="center">🔍 1.1 Búsqueda Binaria</h2>

---

<div align="center">
  <img src="https://img.shields.io/badge/Estrategia-Divide%20y%20Vencerás-9C27B0?style=for-the-badge&logo=codeforces&logoColor=white" />
  <img src="https://img.shields.io/badge/Tema-Búsqueda%20Binaria-2196F3?style=for-the-badge&logo=googlescholar&logoColor=white" />
</div>

---

## 📚 Índice

- [🎯 Objetivo](#-objetivo)
- [🧠 ¿Qué es Divide y Vencerás?](#-qué-es-divide-y-vencerás)
- [🔍 ¿Cómo funciona la búsqueda binaria?](#-cómo-funciona-la-búsqueda-binaria)
- [💻 Código de ejemplo en Java](#-código-de-ejemplo-en-java)
- [📋 MiniQuiz](#-miniquiz-sobre-búsqueda-binaria)

---

## 🎯 Objetivo

Comprender cómo aplicar la estrategia **Divide y Vencerás** mediante el algoritmo de **búsqueda binaria**, aprovechando su eficiencia en arreglos ordenados.

---

## 🧠 ¿Qué es Divide y Vencerás?

Es una técnica algorítmica que consiste en:

1. **Dividir** el problema en subproblemas más pequeños.
2. **Resolver** cada subproblema de forma recursiva.
3. **Combinar** las soluciones en una solución global.

🧩 Se aplica cuando el problema puede separarse en partes similares al original.

---

## 🔍 ¿Cómo funciona la búsqueda binaria?

La **búsqueda binaria** encuentra un elemento en un arreglo ordenado **dividiendo el intervalo de búsqueda en dos** en cada paso:

1. Compara el elemento buscado con el del centro.
2. Si son iguales, lo encontró.
3. Si es menor, busca en la mitad izquierda.
4. Si es mayor, busca en la mitad derecha.

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Binary_Search_Depiction.svg/512px-Binary_Search_Depiction.svg.png" width="400" />
</p>

📈 **Complejidad temporal**: `O(log n)`

---

## 💻 Código de ejemplo en Java

```java
public class BusquedaBinaria {
    public static int buscar(int[] arreglo, int objetivo) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arreglo[medio] == objetivo) {
                return medio;
            } else if (arreglo[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1; // No encontrado
    }

    public static void main(String[] args) {
        int[] datos = {1, 3, 5, 7, 9, 11};
        int indice = buscar(datos, 7);
        System.out.println("Índice encontrado: " + indice);
    }
}
```

---

## 📋 MiniQuiz: ¿Qué tanto sabes sobre búsqueda binaria?

---

### ❓ Pregunta 1:
¿Qué condición debe cumplir el arreglo para aplicar búsqueda binaria?

- A) Que tenga números positivos  
- B) Que esté ordenado  
- C) Que no tenga ceros  
- D) Que sea bidimensional

<details>
<summary>💡 Ver respuesta</summary>
✅ B) Que esté ordenado.
</details>

---

### ❓ Pregunta 2:
¿Cuál es la complejidad temporal de la búsqueda binaria?

- A) O(n)  
- B) O(n log n)  
- C) O(log n)  
- D) O(1)

<details>
<summary>💡 Ver respuesta</summary>
✅ C) O(log n). Cada paso divide el problema a la mitad.
</details>

---

### ❓ Pregunta 3:
¿Qué ocurre si el valor no está en el arreglo?

- A) Lanza una excepción  
- B) Devuelve 0  
- C) Devuelve -1  
- D) Termina el programa

<details>
<summary>💡 Ver respuesta</summary>
✅ C) Devuelve -1 en este ejemplo, indicando que no se encontró.
</details>

---

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=8E24AA&center=true&vCenter=true&multiline=true&width=600&lines=⚔️+BÚSQUEDA+BINARIA+EN+ACCIÓN" alt="Animación Typing" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=2196F3&center=true&vCenter=true&multiline=true&width=600&lines=🔍+Divide+y+conquista+con+eficiencia+logarítmica" alt="Animación Typing" />
</p>

