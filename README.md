# Taller de Recursividad 

**Estudiante:** Juan Andres Pulecio Delgado
**Asignatura:** Estructura de Datos

---

## Descripcion

Taller practico de recursividad en Java con 14 ejercicios. Cada solucion
usa una funcion recursiva, sigue principios de Clean Code y responsabilidad
unica (SRP), y documenta el caso base, caso recursivo y complejidad Big O.

Los datos de entrada se generan con Random y se muestran en consola antes
de cada resultado.

---

## Estructura del repositorio
```
Taller-Recursividad/
├── src/
│   └── Recursividad/
│       ├── App.java
│       ├── Consola.java
│       ├── Matriz.java
│       ├── EjercicioEjecutable.java
│       ├── RecursividadNumerica.java
│       ├── RecursividadDigitos.java
│       ├── RecursividadCadenas.java
│       ├── RecursividadMatematica.java
│       └── RecursividadEstructuras.java
└── README.md
```
---

## Ejercicios

| # | Descripcion                      | Clase                  | Complejidad|
|---|----------------------------------|------------------------|------------|
| 1 |Factorial                         | RecursividadNumerica   | O(n)       |
| 2 |Invertir numero                   | RecursividadDigitos    | O(log n)   |
| 3 |Sumatoria 1 + 1/2 + ... + 1/n     | RecursividadNumerica   | O(n)       |
| 4 |Suma de digitos                   | RecursividadDigitos    | O(log n)   |
| 5 |Sumatoria 1 + 2 + ... + n         | RecursividadNumerica   | O(n)       |
| 6 |Potencia base^exponente           | RecursividadNumerica   | O(n)       |
| 7 |Maximo Comun Divisor (Euclides)   | RecursividadMatematica | O(log n)   |
| 8 |Copiar cadena                     | RecursividadCadenas    | O(n)       |
| 9 |Cociente por restas sucesivas     | RecursividadNumerica   | O(n)       |
|10 |Multiplicacion por sumas sucesivas| RecursividadNumerica   | O(n)       |
|11 |Suma de arreglo                   | RecursividadEstructuras| O(n)       |
|12 |Suma de matriz                    | RecursividadEstructuras| O(n^m)     |
|13 |Serie de Fibonacci                | RecursividadMatematica | O(2^n)     |
|14 |Funcion de Ackermann              | RecursividadMatematica | O(c^n)     |

---

## Instrucciones para ejecutar

### Requisitos

- Java 17 o superior
- IntelliJ IDEA, Eclipse o VS Code con Extension Pack for Java

### Pasos

1. Clona el repositorio:

   git clone https://github.com/jpulecio-design/taller-recursividad

2. Abre el proyecto en tu IDE.

3. Verifica que los archivos .java esten dentro del paquete Recursividad
   en la carpeta src/Recursividad/.

4. Ejecuta la clase App.java. No se requiere entrada por teclado,
   los datos se generan automaticamente.

5. Los resultados de cada ejercicio se imprimen en consola.
