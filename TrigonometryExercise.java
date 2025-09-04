/*
 * TrigonometryExercise.java
 * Convierte un ángulo en grados a radianes y calcula seno y coseno.
 */
public class TrigonometryExercise {
    public static void main(String[] args) {
        // Ángulo en grados
        double angleInDegrees = 45.0;

        // Convertimos a radianes usando Math.toRadians
        double angleInRadians = Math.toRadians(angleInDegrees);

        // Calculamos seno y coseno usando Math.sin y Math.cos (ambas reciben radianes)
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);

        // Mostramos resultados. Para ángulos notables (45°), los valores deberían ser cercanos a 0.7071
        System.out.printf("El ángulo en radianes es: %.6f%n", angleInRadians);
        System.out.printf("El seno del ángulo es: %.6f%n", sine);
        System.out.printf("El coseno del ángulo es: %.6f%n", cosine);
    }
}
