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
}
