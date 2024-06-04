package clases;

/**
 * Clase que contiene métodos estáticos para encontrar el máximo de números enteros positivos.
 */
public class Minimos {

    /**
     * Devuelve el valor minimo de dos números enteros positivos.
     * 
     * @param a primer número entero positivo
     * @param b segundo número entero positivo
     * @return el valor minimo de a y b
     * @throws IllegalArgumentException si alguno de los valores es menor que cero
     */
	public static int minimoDe2EnterosPositivos(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los valores deben ser números enteros positivos");
        }
        return (a < b) ? a : b;
    }


    /**
     * Devuelve el valor minimo de tres números enteros positivos.
     * 
     * @param a primer número entero positivo
     * @param b segundo número entero positivo
     * @param c tercer número entero positivo
     * @return el valor minimo de a, b y c
     * @throws IllegalArgumentException si alguno de los valores es menor que cero
     */
	public static int minimoDe3EnterosPositivos(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Los valores deben ser números enteros positivos");
        }
        int minimo = a;
        if (b < minimo) {
            minimo = b;
        }
        if (c < minimo) {
            minimo = c;
        }
        return minimo;
    }
}
