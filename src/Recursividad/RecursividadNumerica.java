package Recursividad;

public class RecursividadNumerica {
    // Ej 1 Factorial O(n)
    // Complejidad: O(n)
    // Caso base: numero == 0 -> retorna 1
    public static long calcularFactorial(int numero) {
        if (numero == 0)
            return 1;
        return numero * calcularFactorial(numero - 1);
    }

    // Ej 3 - Sumatoria 1 + 1/2 + ... + 1/n O(n)
    // Complejidad: O(n)
    // Caso base: n == 1 retorna 1.0
    public static double calcularSumatoriaFracciones(int n) {
        if (n == 1)
            return 1.0;
        return (1.0 / n) + calcularSumatoriaFracciones(n - 1);
    }

    // Ej 5 - Sumatoria 1 + 2 + ... + n O(n)
    // Complejidad: O(n)
    // Caso base: n == 1 -> retorna 1
    public static int calcularSumatoria(int n) {
        if (n == 1)
            return 1;
        return n + calcularSumatoria(n - 1);
    }

    // Ej 6 - Potencia base^exponente
    // Complejidad: O(n)
    // Caso base: exponente == 0 -> retorna 1
    public static double calcularPotencia(double base, int exponente) {
        if (exponente == 0)
            return 1;
        return base * calcularPotencia(base, exponente - 1);
    }

    // Ej 9 - Cociente por restas sucesivas
    // Complejidad: O(n)
    // Caso base: dividendo < divisor -> retorna 0
    public static int calcularCociente(int dividendo, int divisor) {
        if (dividendo < divisor)
            return 0;
        return 1 + calcularCociente(dividendo - divisor, divisor);
    }

    // Ej 10 - Multiplicación por sumas sucesivas
    // Complejidad: O(n)
    // Caso base: segundoNumero == 0 -> retorna 0
    public static int calcularMultiplicacion(int primerNumero, int segundoNumero) {
        if (segundoNumero == 0)
            return 0;
        return primerNumero + calcularMultiplicacion(primerNumero, segundoNumero - 1);
    }

}
