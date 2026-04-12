package Recursividad;

public class RecursividadEstructuras {
    // Ej 11 - Suma de arreglo O(n)
    // Caso base: indice == arreglo.length equivale a 0
    public static int sumarElementosArreglo(int[] arreglo, int indiceActual) {
        boolean llegamosAlFinal = (indiceActual == arreglo.length);
        if (llegamosAlFinal)
            return 0;
        return arreglo[indiceActual] + sumarElementosArreglo(arreglo, indiceActual + 1);
    }
}
