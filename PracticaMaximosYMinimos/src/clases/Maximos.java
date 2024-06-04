package clases;

/**
 * Clase que contiene métodos estáticos para encontrar el máximo de números enteros positivos.
 */
public class Maximos {

    /**
     * Devuelve el valor máximo de dos números enteros positivos.
     * 
     * @param a primer número entero positivo
     * @param b segundo número entero positivo
     * @return el valor máximo de a y b
     * @throws IllegalArgumentException si alguno de los valores es menor que cero
     */
    public static int maximoDe2EnterosPositivos(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los valores deben ser números enteros positivos");
        }
        return (a > b) ? a : b;
    }

    /**
     * Devuelve el valor máximo de tres números enteros positivos.
     * 
     * @param a primer número entero positivo
     * @param b segundo número entero positivo
     * @param c tercer número entero positivo
     * @return el valor máximo de a, b y c
     * @throws IllegalArgumentException si alguno de los valores es menor que cero
     */
    public static int maximoDe3EnterosPositivos(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Los valores deben ser números enteros positivos");
        }
        int maximo = a;
        if (b > maximo) {
            maximo = b;
        }
        if (c > maximo) {
            maximo = c;
        }
        return maximo;
    }
}