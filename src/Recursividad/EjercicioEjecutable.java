package Recursividad;   

import java.util.Random;

public class EjercicioEjecutable {

    private static final Random random = new Random();

    // Generadores 

    private static int generarEnteroEntre(int minimo, int maximo) {
        return random.nextInt(maximo - minimo + 1) + minimo;
    }

    private static int[] generarArregloRandom(int tamanio, int minimo, int maximo) {
        int[] arreglo = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            arreglo[i] = generarEnteroEntre(minimo, maximo);
        }
        return arreglo;
    }

    private static Matriz generarMatrizRandom(int filas, int columnas, int minimo, int maximo) {
        Matriz matriz = new Matriz(filas, columnas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz.asignarElemento(i, j, generarEnteroEntre(minimo, maximo));
            }
        }
        return matriz;
    }

    // Ejercicios 

    public static void ejecutarEjercicio1() {
        Consola.imprimirSeccion("1", "Factorial");
        int numero = generarEnteroEntre(1, 10);
        long resultado = RecursividadNumerica.calcularFactorial(numero);
        Consola.imprimirDato("Numero generado", numero);
        Consola.imprimirDato(numero + "!", resultado);
    }

    public static void ejecutarEjercicio2() {
        Consola.imprimirSeccion("2", "Invertir numero");
        int numero = generarEnteroEntre(100, 9999);
        String resultado = RecursividadDigitos.invertirNumero(numero);
        Consola.imprimirDato("Numero generado", numero);
        Consola.imprimirDato("Invertido", resultado);
    }

    public static void ejecutarEjercicio3() {
        Consola.imprimirSeccion("3", "Sumatoria 1 + 1/2 + ... + 1/n");
        int n = generarEnteroEntre(2, 10);
        double resultado = RecursividadNumerica.calcularSumatoriaFracciones(n);
        Consola.imprimirDato("n generado", n);
        Consola.imprimirDecimal("Sumatoria", resultado);
    }

    public static void ejecutarEjercicio4() {
        Consola.imprimirSeccion("4", "Suma de digitos");
        int numero = generarEnteroEntre(100, 9999);
        int resultado = RecursividadDigitos.sumarDigitos(numero);
        Consola.imprimirDato("Numero generado", numero);
        Consola.imprimirDato("Suma de digitos", resultado);
    }

    public static void ejecutarEjercicio5() {
        Consola.imprimirSeccion("5", "Sumatoria 1 + 2 + ... + n");
        int n = generarEnteroEntre(1, 15);
        int resultado = RecursividadNumerica.calcularSumatoria(n);
        Consola.imprimirDato("n generado", n);
        Consola.imprimirDato("Sumatoria", resultado);
    }

    public static void ejecutarEjercicio6() {
        Consola.imprimirSeccion("6", "Potencia base^exponente");
        int base = generarEnteroEntre(2, 9);
        int exponente = generarEnteroEntre(1, 6);
        double resultado = RecursividadNumerica.calcularPotencia(base, exponente);
        Consola.imprimirDato("Base generada", base);
        Consola.imprimirDato("Exponente", exponente);
        Consola.imprimirDato(base + "^" + exponente, resultado);
    }

    public static void ejecutarEjercicio7() {
        Consola.imprimirSeccion("7", "Maximo Comun Divisor (Euclides)");
        int m = generarEnteroEntre(10, 100);
        int n = generarEnteroEntre(1, 50);
        int resultado = RecursividadMatematica.calcularMcd(m, n);
        Consola.imprimirDato("M generado", m);
        Consola.imprimirDato("N generado", n);
        Consola.imprimirDato("MCD(" + m + ", " + n + ")", resultado);
    }

    public static void ejecutarEjercicio8() {
        Consola.imprimirSeccion("8", "Copiar cadena");
        String[] palabras = { "recursividad", "unimayor", "java", "estructuras" };
        String cadenaOriginal = palabras[generarEnteroEntre(0, palabras.length - 1)];
        String copia = RecursividadCadenas.copiarCadena(cadenaOriginal);
        Consola.imprimirDato("Cadena original", cadenaOriginal);
        Consola.imprimirDato("Copia", copia);
    }

    public static void ejecutarEjercicio9() {
        Consola.imprimirSeccion("9", "Cociente de division entera (restas sucesivas)");
        int dividendo = generarEnteroEntre(20, 100);
        int divisor = generarEnteroEntre(2, 10);
        int resultado = RecursividadNumerica.calcularCociente(dividendo, divisor);
        Consola.imprimirDato("Dividendo", dividendo);
        Consola.imprimirDato("Divisor", divisor);
        Consola.imprimirDato("Cociente", resultado);
    }

    public static void ejecutarEjercicio10() {
        Consola.imprimirSeccion("10", "Multiplicacion por sumas sucesivas");
        int primerNumero = generarEnteroEntre(2, 15);
        int segundoNumero = generarEnteroEntre(2, 10);
        int resultado = RecursividadNumerica.calcularMultiplicacion(primerNumero, segundoNumero);
        Consola.imprimirDato("Primer numero", primerNumero);
        Consola.imprimirDato("Segundo numero", segundoNumero);
        Consola.imprimirDato("Resultado", resultado);
    }

    public static void ejecutarEjercicio11() {
        Consola.imprimirSeccion("11", "Suma de elementos de un arreglo");
        int[] arreglo = generarArregloRandom(6, 1, 20);
        int resultado = RecursividadEstructuras.sumarElementosArreglo(arreglo, 0);
        Consola.imprimirArreglo("Arreglo generado", arreglo);
        Consola.imprimirDato("Suma total", resultado);
    }

    public static void ejecutarEjercicio12() {
        Consola.imprimirSeccion("12", "Suma de elementos de una matriz");
        Matriz matriz = generarMatrizRandom(3, 4, 1, 15);
        int resultado = RecursividadEstructuras.sumarElementosMatriz(matriz, 0, 0);
        Consola.imprimirMatriz("Matriz generada (3x4)", matriz);
        Consola.imprimirDato("Suma total", resultado);
    }

    public static void ejecutarEjercicio13() {
        Consola.imprimirSeccion("13", "Serie de Fibonacci");
        int limite = generarEnteroEntre(6, 12);
        Consola.imprimirDato("Limite generado", limite);
        System.out.print("  Serie           : ");
        for (int i = 0; i <= limite; i++) {
            System.out.print(RecursividadMatematica.calcularFibonacci(i) + " ");
        }
        System.out.println();
    }

    public static void ejecutarEjercicio14() {
        Consola.imprimirSeccion("14", "Funcion de Ackermann");
        int m = generarEnteroEntre(0, 3);
        int n = generarEnteroEntre(0, 4);
        int resultado = RecursividadMatematica.calcularAckermann(m, n);
        Consola.imprimirDato("m generado", m);
        Consola.imprimirDato("n generado", n);
        Consola.imprimirDato("Ackermann(" + m + "," + n + ")", resultado);
    }
}