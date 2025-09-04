/*
 * RandomNumberGenerator.java
 * Genera un número aleatorio entre 0.0 (inclusive) y 1.0 (exclusivo) usando Math.random().
 */
public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Math.random() devuelve un double en [0.0, 1.0)
        double randomValue = Math.random();

        // Imprimimos el número aleatorio generado
        System.out.printf("Un número aleatorio entre 0.0 y 1.0 es: %.8f%n", randomValue);
    }
}
