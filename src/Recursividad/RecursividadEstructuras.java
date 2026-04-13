package Recursividad;

public class RecursividadEstructuras {
    // Ej 11 - Suma de arreglo
    // Complejidad: O(n)

    public static int sumarElementosArreglo(int[] arreglo, int indiceActual) {
        if (indiceActual == arreglo.length)
            return 0;
        return arreglo[indiceActual] + sumarElementosArreglo(arreglo, indiceActual + 1);
    }

    // Ej 12 - Suma de matriz
    // Complejidad: O(n^m)

    public static int sumarElementosMatriz(Matriz matriz, int filaActual, int columnaActual) {
        if (filaActual == matriz.obtenerFilas())
            return 0;
        if (columnaActual == matriz.obtenerColumnas())
            return sumarElementosMatriz(matriz, filaActual + 1, 0);
        int elementoActual = matriz.obtenerElemento(filaActual, columnaActual);
        return elementoActual + sumarElementosMatriz(matriz, filaActual, columnaActual + 1);
    }
}
