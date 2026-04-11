package Recursividad;

public class RecursividadCadenas {

    // Ej 8 - Copiar cadena O(n) n=longitud
    // Caso base: cadena vacía → ""
    public static String copiarCadena(String cadenaOriginal) {
        boolean esCasoBase = cadenaOriginal.isEmpty();
        if (esCasoBase)
            return "";
        char primerCaracter = cadenaOriginal.charAt(0);
        String restoDeCadena = cadenaOriginal.substring(1);
        return primerCaracter + copiarCadena(restoDeCadena);
    }
}