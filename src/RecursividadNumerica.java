public class RecursividadNumerica {
    // Ej 1 Factorial O(n)
    // caso base equivale a n== 0 o n==1
    public static long calcularFactorial(int numero) {
        boolean esCasoBase = (numero == 0);
        if (esCasoBase)
            return 1;
        return numero * calcularFactorial(numero - 1);

    }
}
