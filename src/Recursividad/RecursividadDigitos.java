package Recursividad;
public class RecursividadDigitos {
    // Ej 2 - Invertir número O(n) n=digitos
    // Caso base: numero < 10 equivale String del digito
    public static String invertirNumero(int numero) {
        boolean esCasoBase = (numero < 10);
        if (esCasoBase)
            return String.valueOf(numero);
        int ultimoDigito = numero % 10;
        return ultimoDigito + invertirNumero(numero / 10);
    }
    // Ej 4 - Suma de dígitos   O(n) n=digitos
    // Caso base: numero < 10 entonces el numero mismo
    public static int sumarDigitos(int numero) {
        boolean esCasoBase = (numero < 10);
        if (esCasoBase) return numero;
        int ultimoDigito = numero % 10;
        return ultimoDigito + sumarDigitos(numero / 10);
    }
}
