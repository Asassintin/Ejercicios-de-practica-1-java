# Ejercicios de Práctica 1 — Java

Colección de ejercicios básicos en Java para practicar tipos primitivos, operaciones matemáticas, casting, caracteres, trigonometría y utilidades de `Math`.

## Novedades y cambios

- Añadidos: `CircleMath.java`, `HypotenuseCalculator.java`, `RandomNumberGenerator.java`, `TrigonometryExercise.java`.
- Actualizado README para reflejar los archivos reales y comandos en Windows PowerShell.

## Ejercicios incluidos

- `IntegerOperations.java` — Operaciones con enteros: suma, resta, multiplicación, división, módulo.
- `FloatingPointOperations.java` — Cálculos con punto flotante; área de un círculo con `float`/`double`.
- `TypeCastingExercise.java` — Conversión de tipos entre `double` ↔ `int`.
- `CharBooleanExercise.java` — Uso de `char`, conversión a ASCII y booleanos.
- `CircleMath.java` — Circunferencia y área usando `Math.PI` y formato con `printf`.
- `HypotenuseCalculator.java` — Hipotenusa con Pitágoras usando `Math.pow` y `Math.sqrt`.
- `RandomNumberGenerator.java` — Número aleatorio en [0.0, 1.0) con `Math.random()`.
- `TrigonometryExercise.java` — Grados → radianes, seno y coseno con `Math.toRadians`, `Math.sin`, `Math.cos`.

## Requisitos

- JDK 8 o superior
- Windows/macOS/Linux (instrucciones abajo con PowerShell para Windows)
- Editor/IDE opcional (VS Code, IntelliJ, Eclipse)

## Cómo compilar y ejecutar (Windows PowerShell)

En PowerShell, dentro de la carpeta del proyecto:

```powershell
# Compilar todos los archivos
javac *.java

# Ejecutar un ejercicio (ejemplos)
java IntegerOperations
java FloatingPointOperations
java TypeCastingExercise
java CharBooleanExercise
java CircleMath
java HypotenuseCalculator
java RandomNumberGenerator
java TrigonometryExercise
```

Para compilar/ejecutar un archivo específico:

```powershell
javac NombreDelArchivo.java
java NombreDeLaClase
```

## Salidas de ejemplo

- IntegerOperations
	- El resultado de la suma es: 45
	- El resultado de la resta es: 20
	- El resultado de la multiplicacion es: 150
	- El resultado de la division es: 2
	- El resultado del residuo es: 10

- FloatingPointOperations (radio 10.6, pi 3.14159f)
	- El area del circulo es: 352.9890524

- TypeCastingExercise
	- Double convertido a int: 100
	- Int convertido a double: 80.0

- CharBooleanExercise
	- El caracter es: M
	- El valor Ascii del caracter es: 77
	- Es Java divertido? true

- CircleMath (radio 7.5)
	- La circunferencia del círculo es: 47.1239
	- El área del círculo es: 176.7146

- HypotenuseCalculator (catetos 3 y 4)
	- La longitud de la hipotenusa es: 5.00

- RandomNumberGenerator
	- Un número aleatorio entre 0.0 y 1.0 es: 0.XXXXXXXX (varía en cada ejecución)

- TrigonometryExercise (45°)
	- El ángulo en radianes es: 0.785398
	- El seno del ángulo es: 0.707107
	- El coseno del ángulo es: 0.707107

## Estructura del proyecto

```
Ejercicios-de-practica-1-java/
├── README.md
├── CharBooleanExercise.java
├── CircleMath.java
├── FloatingPointOperations.java
├── HypotenuseCalculator.java
├── IntegerOperations.java
├── RandomNumberGenerator.java
├── TrigonometryExercise.java
├── TypeCastingExercise.java
└── Ejercicios de Práctica 1.docx
```

## Conceptos de Java cubiertos

- Tipos primitivos: `int`, `double`, `float`, `char`, `boolean`
- Operadores aritméticos: `+`, `-`, `*`, `/`, `%`
- Conversión de tipos: casting explícito e implícito
- E/S básica: `System.out.println`, `System.out.printf`
- Utilidades de `Math`: `PI`, `pow`, `sqrt`, `random`, `toRadians`, `sin`, `cos`

## Contribuciones y licencia

Sugerencias y mejoras son bienvenidas mediante issues o pull requests.
Uso educativo.