package Recursividad;

public class RecursividadDigitos {
    // Ej 2 - Invertir numero O(n) n=digitos
    // O(log n)

    public static String invertirNumero(int numero) {
        if (numero < 10)
            return String.valueOf(numero);
        int ultimoDigito = numero % 10;
        return ultimoDigito + invertirNumero(numero / 10);
    }

    // Ej 4 - Suma de digitos O(n) n=digitos
    // O(log n)

    public static int sumarDigitos(int numero) {
        if (numero < 10)
            return numero;
        int ultimoDigito = numero % 10;
        return ultimoDigito + sumarDigitos(numero / 10);
    }
}
