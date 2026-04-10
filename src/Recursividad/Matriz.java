package Recursividad;
public class Matriz {

    private final int[][] datos;
    private final int filas;
    private final int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.datos = new int[filas][columnas];
    }

    public int obtenerElemento(int fila, int columna) {
        return datos[fila][columna];
    }

    public void asignarElemento(int fila, int columna, int valor) {
        datos[fila][columna] = valor;
    }

    public int obtenerFilas() {
        return filas;
    }

    public int obtenerColumnas() {
        return columnas;
    }
}