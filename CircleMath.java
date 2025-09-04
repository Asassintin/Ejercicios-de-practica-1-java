/*
 * CircleMath.java
 * Calcula la circunferencia y el área de un círculo usando Math.PI.
 */
public class CircleMath {
    public static void main(String[] args) {
        // Radio del círculo
        double radius = 7.5;

        // Circunferencia = 2 * PI * r
        double circumference = 2 * Math.PI * radius;

        // Área = PI * r^2
        double area = Math.PI * radius * radius;

        // Imprimimos resultados
        System.out.printf("La circunferencia del círculo es: %.4f%n", circumference);
        System.out.printf("El área del círculo es: %.4f%n", area);
    }
}
