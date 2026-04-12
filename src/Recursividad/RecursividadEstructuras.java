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

    // Ej 12 - Suma de matriz O(filas * columnas)
    // Caso base: terminamos todas las filas en 0
    // Caso base fila: terminamos columnas para saltar a siguiente fila
    public static int sumarElementosMatriz(Matriz matriz, int filaActual, int columnaActual) {
        boolean terminamosTodasLasFilas = (filaActual == matriz.obtenerFilas());
        boolean terminamosColumnasDeFila = (columnaActual == matriz.obtenerColumnas());
        if (terminamosTodasLasFilas)
            return 0;
        if (terminamosColumnasDeFila)
            return sumarElementosMatriz(matriz, filaActual + 1, 0);
        int elementoActual = matriz.obtenerElemento(filaActual, columnaActual);
        return elementoActual + sumarElementosMatriz(matriz, filaActual, columnaActual + 1);
    }
}
