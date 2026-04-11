package Recursividad;

public class RecursividadMatematica {
        // Ej 7 - MCD Euclides   O(log(n))
    // Caso base: n == 0 → m
    public static int calcularMcd(int m, int n) {
        boolean esCasoBase = (n == 0);
        if (esCasoBase) return m;
        return calcularMcd(n, m % n);
    }
}
