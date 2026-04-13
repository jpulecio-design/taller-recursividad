package Recursividad;

public class RecursividadCadenas {

    // Ej 8 - Copiar cadena
    // Complejidad: O(n) donde n=longitud
    // Caso base: cadena vacia -> ""
    public static String copiarCadena(String cadenaOriginal) {
        if (cadenaOriginal.isEmpty())
            return "";
        char primerCaracter = cadenaOriginal.charAt(0);
        String restoDeCadena = cadenaOriginal.substring(1);
        return primerCaracter + copiarCadena(restoDeCadena);
    }
}