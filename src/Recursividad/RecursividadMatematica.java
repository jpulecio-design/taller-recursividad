package Recursividad;

public class RecursividadMatematica {
    // Ej 7 - MCD Euclides O(log(n))
    // Caso base: n == 0 → m
    public static int calcularMcd(int m, int n) {
        boolean esCasoBase = (n == 0);
        if (esCasoBase)
            return m;
        return calcularMcd(n, m % n);
    }

    // Ej 13 - Fibonacci O(2^n)
    // Caso base: n==0 → 0, n==1 → 1
    public static int calcularFibonacci(int n) {
        boolean esPrimerCasoBase = (n == 0);
        boolean esSegundoCasoBase = (n == 1);
        if (esPrimerCasoBase)
            return 0;
        if (esSegundoCasoBase)
            return 1;
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

    // Ej 14 - Ackermann O(mayor que exponencial)
    // Caso base 1: m == 0 → n + 1
    // Caso base 2: m>0, n == 0 → ackermann(m-1, 1)
    // Caso recursivo → ackermann(m-1, ackermann(m, n-1))
    public static int calcularAckermann(int m, int n) {
        boolean esPrimerCasoBase = (m == 0);
        boolean esSegundoCasoBase = (m > 0 && n == 0);
        if (esPrimerCasoBase)
            return n + 1;
        if (esSegundoCasoBase)
            return calcularAckermann(m - 1, 1);
        return calcularAckermann(m - 1, calcularAckermann(m, n - 1));
    }
}
