package Recursividad;

public class RecursividadMatematica {
    // Ej 7 - MCD Euclides
    // Complejidad: O(log n)
    // Caso base: n == 0 -> retorna m
    public static int calcularMcd(int m, int n) {
        if (n == 0)
            return m;
        return calcularMcd(n, m % n);
    }

    // Ej 13 - Fibonacci
    // Complejidad: O(2^n)
    // Caso base: n==0 -> retorna 0 | n == 1 -> retorna 1
    public static int calcularFibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

    // Ej 14 - Ackermann
    // Complejidad: O(c^n)
    // Caso base 1: m == 0 -> retorna n + 1
    // Caso base 2: m>0, n == 0 -> retorna calcularAckermann(m-1, 1)
    public static int calcularAckermann(int m, int n) {
        if (m == 0)
            return n + 1;
        if (n == 0)
            return calcularAckermann(m - 1, 1);
        return calcularAckermann(m - 1, calcularAckermann(m, n - 1));
    }
}
