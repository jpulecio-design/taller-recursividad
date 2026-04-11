package Recursividad;

public class RecursividadNumerica {
    // Ej 1 Factorial O(n)
    // caso base equivale a n== 0 o n==1
    public static long calcularFactorial(int numero) {
        boolean esCasoBase = (numero == 0);
        if (esCasoBase)
            return 1;
        return numero * calcularFactorial(numero - 1);

    }

    // Ej 3 - Sumatoria 1 + 1/2 + ... + 1/n O(n)
    // Caso base: n == 1 pasa a 1.0
    public static double calcularSumatoriaFracciones(int n) {
        boolean esCasoBase = (n == 1);
        if (esCasoBase)
            return 1.0;
        return (1.0 / n) + calcularSumatoriaFracciones(n - 1);
    }

    // Ej 5 - Sumatoria 1 + 2 + ... + n O(n)
    // Caso base: n == 1 → 1
    public static int calcularSumatoria(int n) {
        boolean esCasoBase = (n == 1);
        if (esCasoBase)
            return 1;
        return n + calcularSumatoria(n - 1);
    }
}
