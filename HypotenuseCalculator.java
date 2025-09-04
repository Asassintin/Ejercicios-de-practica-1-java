/*
 * HypotenuseCalculator.java
 * Calcula la hipotenusa de un triángulo rectángulo usando el teorema de Pitágoras.
 */

public class HypotenuseCalculator {
    public static void main(String[] args) {
        // Declaramos los catetos (sideA y sideB)
        double sideA = 3.0;
        double sideB = 4.0;

        // Calculamos a^2 y b^2 usando Math.pow, luego sumamos y sacamos la raíz cuadrada con Math.sqrt
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        // Imprimimos el resultado. Usamos printf para controlar formato decimal.
        System.out.printf("La longitud de la hipotenusa es: %.2f%n", hypotenuse);
    }
}
