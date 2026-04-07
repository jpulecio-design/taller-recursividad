import java.util.Random;

public class App {

    static Random random = new Random();

    // ── Generadores de datos random visibles ─────────────────

    static int generarEnteroEntre(int minimo, int maximo) {
        return random.nextInt(maximo - minimo + 1) + minimo;
    }

    static int[] generarArregloRandom(int tamanio, int minimo, int maximo) {
        int[] arreglo = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            arreglo[i] = generarEnteroEntre(minimo, maximo);
        }
        return arreglo;
    }


    // ── Impresión ─────────────────────────────────────────────

    static void imprimirTitulo(String titulo) {
        System.out.println("\n═══════════════════════════════════════════");
        System.out.println("  " + titulo);
        System.out.println("═══════════════════════════════════════════");
    }

    static void imprimirSeccion(String numero, String descripcion) {
        System.out.println("\n── [" + numero + "] " + descripcion + " ──");
    }

    static void imprimirArreglo(String etiqueta, int[] arreglo) {
        System.out.print("  " + etiqueta + ": [ ");
        for (int elemento : arreglo) System.out.print(elemento + " ");
        System.out.println("]");
    }

    

    // ── Main ──────────────────────────────────────────────────

    public static void main(String[] args) throws Exception {

        imprimirTitulo("TALLER DE RECURSIVIDAD - UNIMAYOR");

        // ── Ej 1: Factorial ───────────────────────────────────
        imprimirSeccion("1", "Factorial");
        int numero1 = generarEnteroEntre(1, 10);
        long resultadoFactorial = RecursividadNumerica.calcularFactorial(numero1);
        System.out.println("  Número generado : " + numero1);
        System.out.println("  " + numero1 + "!           : " + resultadoFactorial);

        
    }
}