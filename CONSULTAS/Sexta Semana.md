
<h1 align="center">🔍 Análisis de Algoritmos en Java</h1>
<h2 align="center">📘 3.1 Estructuras de Control</h2>

---

<div align="center">
  <img src="https://img.shields.io/badge/Lenguaje-Java-007396?style=for-the-badge&logo=java&logoColor=white" />
</div>

---

## 📚 Índice

- [🎯 Objetivo](#-objetivo)
- [🔢 Tipos de Estructuras de Control](#-tipos-de-estructuras-de-control-en-java)
  - [🔀 Selección (Condicionales)](#-selección-condicionales)
  - [🔄 Repetición (Bucles)](#-repetición-bucles)
- [🧠 Conceptos Clave](#-conceptos-clave)
- [🌈 Beneficios de las Estructuras de Control](#-beneficios-de-las-estructuras-de-control)
- [🧪 Ejemplo Interactivo](#-ejemplo-interactivo)
- [📋 MiniQuiz](#-miniquiz-qu%C3%A9-tanto-sabes-sobre-estructuras-de-control-en-java)
---

## 🎯 Objetivo

Este repositorio está dedicado a la práctica y el estudio de **estructuras de control** en Java, fundamentales para la toma de decisiones y la repetición de instrucciones en los algoritmos.

---

## 🔢 Tipos de Estructuras de Control en Java

### 🔀 Selección (Condicionales)

<details open>
  <summary><strong>If - Else</strong></summary>

```java
if (edad >= 18) {
    System.out.println("Eres mayor de edad.");
} else {
    System.out.println("Eres menor de edad.");
}
```

*Se utiliza para ejecutar instrucciones de acuerdo a si se cumple o no una condición.*

<p align="center">
  <img src="https://www.luisllamas.es/images/20099/programacion-if-else.png" alt="Diagrama de If-Else" width="300">
</p>

</details>

<details>
  <summary><strong>Switch - Case</strong></summary>

```java
switch (opcion) {
    case 1:
        System.out.println("Has elegido 1");
        break;
    case 2:
        System.out.println("Has elegido 2");
        break;
    default:
        System.out.println("Opción no válida");
        break;
}
```

*Ideal para múltiples condiciones basadas en el valor de una variable.*

<p align="center">
  <img src="https://media.geeksforgeeks.org/wp-content/uploads/20230224161406/switch-case-in-c.png" alt="Diagrama de If-Else" width="300">
</p>
</details>

---

### 🔄 Repetición (Bucles)

<details>
  <summary><strong>For</strong></summary>

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteración: " + i);
}
```

*Ejecuta un bloque de código un número definido de veces.*

<p align="center">
  <img src="https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjBj3-4fOuu9gkebWFugrsVAYC6fq7DykKNpmIRO0FwEc-H_ZwoH_iAgrqINb00Tp9wr2vDvvx3502A1qmww6IPj9jILVrTZ_2wuSs4UVoYE95VUhE0WDjUnPXym980DeGZeTMxT9YZoCI/s1600/bucle-for.PNG" alt="Diagrama de If-Else" width="300">
</p></details>

<details>
  <summary><strong>While / Do-While</strong></summary>

```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

*Se usa cuando no se sabe cuántas veces se repetirá, pero se basa en una condición.*

</details>

---

## 🧠 Conceptos Clave

| Concepto       | Descripción                                                   |
|----------------|---------------------------------------------------------------|
| Secuencia      | Instrucciones ejecutadas en orden secuencial                  |
| Selección      | Toma de decisiones basadas en condiciones                     |
| Repetición     | Ejecución reiterada de código mientras se cumpla una condición |

---

## 🌈 Beneficios de las Estructuras de Control

> Las estructuras de control permiten que los programas sean **dinámicos**, **flexibles** y capaces de reaccionar ante distintos escenarios, facilitando el desarrollo de algoritmos eficientes.

---

## 🧪 Ejemplo Interactivo

```java
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
```

> 💡 *Ejecuta este código y prueba diferentes casos. ¿Cómo se comporta el programa con números negativos o el cero?*



---
## 🎯 Video Educativo
<p align="center">
  <strong>🎥 Para una mejor explicación, puedes ver el siguiente video:</strong><br><br>
  <a href="https://www.youtube.com/watch?v=rDynuZstCwU&t=9s">
    <img src="https://img.youtube.com/vi/rDynuZstCwU/0.jpg" alt="Video explicativo" width="500">
  </a><br>
  ⬆️ Haz clic en la imagen para verlo en YouTube
</p>

---

## 📋 MiniQuiz: ¿Qué tanto sabes sobre estructuras de control en Java?

> 💡 Marca mentalmente (o en papel) tus respuestas y revisa al final si acertaste.

---

### ❓ Pregunta 1:
¿Cuál de estas estructuras ejecuta el bloque de código al **menos una vez**, sin importar la condición?

- A) `while`
- B) `for`
- C) `do-while`
- D) `switch`

<details>
<summary>💡 Ver respuesta</summary>
✅ C) do-while. Se ejecuta primero el bloque, luego se evalúa la condición.
</details>

---

### ❓ Pregunta 2:
¿Qué estructura se recomienda usar cuando ya sabes cuántas veces quieres repetir un bloque?

- A) `while`
- B) `if`
- C) `for`
- D) `do-while`

<details>
<summary>💡 Ver respuesta</summary>
✅ C) for. Ideal para bucles con conteo controlado o índices conocidos.
</details>

---

### ❓ Pregunta 3:
¿Qué imprimirá este código?

```java
int a = 10;
if (a > 5) {
    System.out.println("Mayor a 5");
} else {
    System.out.println("Menor o igual a 5");
}
```

- A) Mayor a 5  
- B) Menor o igual a 5  
- C) Error de compilación  
- D) Nada

<details>
<summary>💡 Ver respuesta</summary>
✅ A) Mayor a 5. `a = 10`, la condición `a > 5` es verdadera.
</details>

---

### ❓ Pregunta 4:
¿Qué estructura es mejor para manejar **múltiples condiciones fijas** como un menú?

- A) `for`
- B) `if-else`
- C) `switch-case`
- D) `while`

<details>
<summary>💡 Ver respuesta</summary>
✅ C) switch-case. Es más legible y directo cuando tienes varias opciones exactas.
</details>

---

### 🏁 ¿Cómo te fue?

- `0 - 1 correctas`: 🌱 ¡Recién estás empezando! Sigue practicando.
- `2 - 3 correctas`: 🚀 ¡Vas muy bien! Repasa un poco más.
- `4 correctas`: 🧠 ¡Nivel experto en estructuras de control!

---


<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=00BFFF&center=true&vCenter=true&multiline=true&width=600&lines=%F0%9F%93%96+Estructuras+de+Control+en+Java" alt="Animación Typing" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=00BFFF&center=true&vCenter=true&multiline=true&width=600&lines=¡Aprende+con+ejemplos!" alt="Animación Typing" />
</p>
<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=22&pause=1000&color=00BFFF&center=true&vCenter=true&multiline=true&width=600&lines=%F0%9F%93%96+Disfruta+el+proceso+de+codificar%21" alt="Animación Typing" />
</p>
