package Recursividad;

import java.util.Random;

public class App {

    static Random random = new Random();

    // Generadores de datos random visibles

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

    // Impresion

    static void imprimirTitulo(String titulo) {
        System.out.println("\n═══════════════════════════════════════════");
        System.out.println("  " + titulo);
        System.out.println("═══════════════════════════════════════════");
    }

    static void imprimirSeccion(String numero, String descripcion) {
        System.out.println("\n[" + numero + "] " + descripcion);
    }

    static void imprimirArreglo(String etiqueta, int[] arreglo) {
        System.out.print("  " + etiqueta + ": [ ");
        for (int elemento : arreglo)
            System.out.print(elemento + " ");
        System.out.println("]");
    }

    public static void main(String[] args) throws Exception {

        imprimirTitulo("TALLER DE RECURSIVIDAD ");

        // Ej 1: Factorial
        imprimirSeccion("1", "Factorial");
        int numero1 = generarEnteroEntre(1, 10);
        long resultadoFactorial = RecursividadNumerica.calcularFactorial(numero1);
        System.out.println("  Numero generado : " + numero1);
        System.out.println("  " + numero1 + "!           : " + resultadoFactorial);

        // Ej 2: Invertir numero
        imprimirSeccion("2", "Invertir numero");
        int numero2 = generarEnteroEntre(100, 9999);
        String resultadoInvertido = RecursividadDigitos.invertirNumero(numero2);
        System.out.println("  Número generado : " + numero2);
        System.out.println("  Invertido       : " + resultadoInvertido);
        // Ej 3: Sumatoria 1 + 1/2 + ... + 1/n
        imprimirSeccion("3", "Sumatoria 1 + 1/2 + ... + 1/n");
        int numero3 = generarEnteroEntre(2, 10);
        double resultadoFracciones = RecursividadNumerica.calcularSumatoriaFracciones(numero3);
        System.out.println("  n generado      : " + numero3);
        System.out.printf("  Sumatoria       : %.4f%n", resultadoFracciones);
        // Ej 4: Suma de digitos
        imprimirSeccion("4", "Suma de digitos");
        int numero4 = generarEnteroEntre(100, 9999);
        int resultadoSumaDigitos = RecursividadDigitos.sumarDigitos(numero4);
        System.out.println("  Numero generado : " + numero4);
        System.out.println("  Suma de digitos : " + resultadoSumaDigitos);

        // Ej 5: Sumatoria hasta n
        imprimirSeccion("5", "Sumatoria 1 + 2 + ... + n");
        int numero5 = generarEnteroEntre(1, 15);
        int resultadoSumatoria = RecursividadNumerica.calcularSumatoria(numero5);
        System.out.println("  n generado      : " + numero5);
        System.out.println("  Sumatoria       : " + resultadoSumatoria);
        // Ej 6: Potencia
        imprimirSeccion("6", "Potencia base^exponente");
        int base6 = generarEnteroEntre(2, 9);
        int exponente6 = generarEnteroEntre(1, 6);
        double resultadoPotencia = RecursividadNumerica.calcularPotencia(base6, exponente6);
        System.out.println("  Base generada   : " + base6);
        System.out.println("  Exponente       : " + exponente6);
        System.out.println("  " + base6 + "^" + exponente6 + "             : " + resultadoPotencia);
        // Ej 7: MCD 
        imprimirSeccion("7", "Maximo Comun Divisor (Euclides)");
        int m7 = generarEnteroEntre(10, 100);
        int n7 = generarEnteroEntre(1, 50);
        int resultadoMcd = RecursividadMatematica.calcularMcd(m7, n7);
        System.out.println("  M generado      : " + m7);
        System.out.println("  N generado      : " + n7);
        System.out.println("  MCD(" + m7 + ", " + n7 + ")  : " + resultadoMcd);
        // Ej 8: Copiar cadena 
        imprimirSeccion("8", "Copiar cadena");
        String[] palabras       = {"recursividad", "unimayor", "java", "estructuras"};
        String cadenaOriginal   = palabras[generarEnteroEntre(0, palabras.length - 1)];
        String copiaDeCadena    = RecursividadCadenas.copiarCadena(cadenaOriginal);
        System.out.println("  Cadena original : " + cadenaOriginal);
        System.out.println("  Copia           : " + copiaDeCadena);
    }

}