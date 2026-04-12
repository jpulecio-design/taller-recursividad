package Recursividad;

public class Consola {

    public static void imprimirTitulo(String titulo) {
        System.out.println("\n═══════════════════════════════════════════");
        System.out.println("  " + titulo);
        System.out.println("═══════════════════════════════════════════");
    }

    public static void imprimirSeccion(String numero, String descripcion) {
        System.out.println("\n── [" + numero + "] " + descripcion + " ──");
    }

    public static void imprimirDato(String etiqueta, Object valor) {
        System.out.printf("  %-20s: %s%n", etiqueta, valor);
    }

    public static void imprimirDecimal(String etiqueta, double valor) {
        System.out.printf("  %-20s: %.4f%n", etiqueta, valor);
    }

    public static void imprimirArreglo(String etiqueta, int[] arreglo) {
        System.out.print("  " + etiqueta + ": [ ");
        for (int elemento : arreglo)
            System.out.print(elemento + " ");
        System.out.println("]");
    }

    public static void imprimirMatriz(String etiqueta, Matriz matriz) {
        System.out.println("  " + etiqueta + ":");
        for (int i = 0; i < matriz.obtenerFilas(); i++) {
            System.out.print("    ");
            for (int j = 0; j < matriz.obtenerColumnas(); j++) {
                System.out.printf("%5d", matriz.obtenerElemento(i, j));
            }
            System.out.println();
        }
    }
}