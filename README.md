# Ejercicios de Práctica 1 - Java

## Descripción

Este repositorio contiene una colección de ejercicios básicos de programación en Java diseñados para practicar conceptos fundamentales del lenguaje. Los ejercicios cubren tipos de datos básicos, operaciones matemáticas, conversión de tipos y manipulación de caracteres.

## Contenido del Repositorio

### Ejercicios Incluidos

#### 1. **IntegerOperations.java**
- **Propósito**: Práctica de operaciones básicas con números enteros
- **Conceptos**: Suma, resta, multiplicación, división y módulo
- **Descripción**: Demuestra operaciones aritméticas básicas usando variables enteras y muestra los resultados por consola

#### 2. **FloatingPointOperations.java**
- **Propósito**: Trabajo con números de punto flotante
- **Conceptos**: Variables `double` y `float`, cálculos de área
- **Descripción**: Calcula el área de un círculo utilizando valores de punto flotante

#### 3. **TypeCastingExercise.java**
- **Propósito**: Conversión entre tipos de datos
- **Conceptos**: Casting explícito entre `int` y `double`
- **Descripción**: Demuestra cómo convertir entre diferentes tipos numéricos

#### 4. **CharBooleanExercise.java**
- **Propósito**: Trabajo con caracteres y valores booleanos
- **Conceptos**: Tipo `char`, valores ASCII, tipo `boolean`
- **Descripción**: Muestra un carácter, su valor ASCII y el uso de variables booleanas

#### 5. **calculos_con_circulos.java**
- **Propósito**: Cálculos matemáticos avanzados con círculos
- **Conceptos**: Uso de `Math.PI`, cálculo de circunferencia y área
- **Descripción**: Calcula tanto la circunferencia como el área de un círculo usando la constante PI

## Requisitos del Sistema

- **Java Development Kit (JDK)**: Versión 8 o superior
- **Sistema Operativo**: Windows, macOS, o Linux
- **Editor de texto** o **IDE**: Cualquier editor de texto o un IDE como IntelliJ IDEA, Eclipse, o VS Code

## Cómo Ejecutar los Ejercicios

### Compilación

Para compilar todos los archivos Java, ejecuta el siguiente comando en la terminal:

```bash
javac *.java
```

O para compilar un archivo específico:

```bash
javac NombreDelArchivo.java
```

### Ejecución

Para ejecutar un programa específico:

```bash
java NombreDeLaClase
```

### Ejemplos de Ejecución

```bash
# Compilar todos los archivos
javac *.java

# Ejecutar cada ejercicio
java IntegerOperations
java FloatingPointOperations
java TypeCastingExercise
java CharBooleanExercise
java calculos_con_circulos
```

## Resultados Esperados

### IntegerOperations
```
El resultado de la suma es: 45
El resultado de la resta es: 20
El resultado de la multiplicacion es: 150
El resultado de la division es: 2
El resultado del residuo es: 10
```

### FloatingPointOperations
```
El area del circulo es: 352.8745776
```

### TypeCastingExercise
```
Double convertido a int: 100
Int convertido a double: 80.0
```

### CharBooleanExercise
```
El caracter es: M
El valor Ascii del caracter es: 77
Es Java divertido? true
```

### calculos_con_circulos
```
La circunferencia del círculo es: 34.55751918948772
El área del círculo es: 95.03317777109123
```

## Estructura del Proyecto

```
Ejercicios-de-practica-1-java/
├── README.md
├── .gitignore
├── IntegerOperations.java
├── FloatingPointOperations.java
├── TypeCastingExercise.java
├── CharBooleanExercise.java
├── calculos_con_circulos.java
├── Ejercicios de Práctica 1.docx
└── Programacion II.code-workspace
```

## Conceptos de Java Cubiertos

- **Tipos de datos primitivos**: `int`, `double`, `float`, `char`, `boolean`
- **Operadores aritméticos**: `+`, `-`, `*`, `/`, `%`
- **Conversión de tipos**: Casting explícito e implícito
- **Entrada/Salida**: Uso de `System.out.println()`
- **Constantes matemáticas**: `Math.PI`
- **Valores ASCII**: Conversión de caracteres a enteros

## Notas Adicionales

- Todos los ejercicios incluyen comentarios y mensajes informativos en español
- Los programas son independientes y pueden ejecutarse por separado
- Cada ejercicio se enfoca en conceptos específicos para facilitar el aprendizaje gradual
- Los valores utilizados en los ejercicios son ejemplos que pueden modificarse para experimentar

## Contribuciones

Este repositorio es parte de ejercicios académicos. Si encuentras errores o tienes sugerencias de mejora, no dudes en crear un issue o enviar un pull request.

## Licencia

Este proyecto es de uso educativo y está disponible para fines de aprendizaje.