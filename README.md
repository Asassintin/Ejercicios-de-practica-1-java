# Ejercicios de Práctica 1 — Java

Este repositorio contiene una colección de ejercicios básicos en Java diseñados para practicar conceptos fundamentales del lenguaje como:

- Tipos primitivos de datos
- Operaciones matemáticas básicas
- Casting y conversión de tipos
- Manejo de caracteres y valores ASCII
- Operaciones trigonométricas
- Uso de la clase `Math` y sus utilidades
- Entrada y salida básica con `System.out`

Estos ejercicios son ideales para principiantes que están aprendiendo Java y quieren reforzar los conceptos básicos del lenguaje.

## 📋 Descripción del Contenido

### Archivos Java

1. **`IntegerOperations.java`**
   - Operaciones básicas con números enteros
   - Suma, resta, multiplicación, división y módulo
   - Variables: a=30, b=15, c=10

2. **`FloatingPointOperations.java`**
   - Cálculos con números de punto flotante
   - Calcula el área de un círculo usando `float` y `double`
   - Radio: 10.6, PI: 3.14159f

3. **`TypeCastingExercise.java`**
   - Conversión de tipos entre `double` e `int`
   - Casting explícito e implícito

4. **`CharBooleanExercise.java`**
   - Manejo de caracteres (`char`)
   - Conversión de caracteres a valores ASCII
   - Uso de variables booleanas

5. **`CircleMath.java`**
   - Cálculo de circunferencia y área usando `Math.PI`
   - Uso de `printf` para formato de salida
   - Radio: 7.5

6. **`HypotenuseCalculator.java`**
   - Cálculo de hipotenusa usando el teorema de Pitágoras
   - Uso de `Math.pow` y `Math.sqrt`

7. **`RandomNumberGenerator.java`**
   - Generación de números aleatorios usando `Math.random()`
   - Números en el rango [0.0, 1.0)

8. **`TrigonometryExercise.java`**
   - Conversión de grados a radianes
   - Cálculo de seno y coseno
   - Uso de `Math.toRadians`, `Math.sin`, `Math.cos`

### Otros Archivos

- **`Ejercicios de Práctica 1.docx`** - Documento con las instrucciones originales de los ejercicios
- **`README.md`** - Este archivo de documentación

## ⚙️ Requisitos del Sistema

- **Java Development Kit (JDK)** 8 o superior
- **Sistema Operativo:** Windows, macOS o Linux
- **Terminal/Línea de comandos:** PowerShell (Windows), Terminal (macOS/Linux)
- **Editor/IDE (opcional):** VS Code, IntelliJ IDEA, Eclipse, NetBeans

## 🚀 Cómo Compilar y Ejecutar

### En Windows (PowerShell)

Abre PowerShell y navega a la carpeta del proyecto:

```powershell
cd "ruta\a\tu\proyecto\Ejercicios-de-practica-1-java"
```

#### Compilar todos los archivos:
```powershell
javac *.java
```

#### Ejecutar un ejercicio específico:
```powershell
# Ejecutar operaciones con enteros
java IntegerOperations

# Ejecutar operaciones con punto flotante
java FloatingPointOperations

# Ejecutar ejercicio de casting
java TypeCastingExercise

# Ejecutar ejercicio de caracteres y booleanos
java CharBooleanExercise

# Ejecutar cálculos de círculo con Math.PI
java CircleMath

# Ejecutar calculadora de hipotenusa
java HypotenuseCalculator

# Ejecutar generador de números aleatorios
java RandomNumberGenerator

# Ejecutar ejercicio de trigonometría
java TrigonometryExercise
```

#### Compilar y ejecutar un archivo individual:
```powershell
javac NombreDelArchivo.java
java NombreDeLaClase
```

### En macOS/Linux (Terminal)

```bash
# Compilar todos los archivos
javac *.java

# Ejecutar cualquier ejercicio
java NombreDeLaClase
```

## 📊 Ejemplos de Salida

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
El area del circulo es: 352.9890524
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

### CircleMath
```
La circunferencia del círculo es: 47.1239
El área del círculo es: 176.7146
```

### HypotenuseCalculator
```
La longitud de la hipotenusa es: 5.00
```

### RandomNumberGenerator
```
Un número aleatorio entre 0.0 y 1.0 es: 0.XXXXXXXX
```
*(El valor varía en cada ejecución)*

### TrigonometryExercise
```
El ángulo en radianes es: 0.785398
El seno del ángulo es: 0.707107
El coseno del ángulo es: 0.707107
```

## 📁 Estructura del Proyecto

```
Ejercicios-de-practica-1-java/
├── 📄 README.md                     # Documentación del proyecto
├── ☕ CharBooleanExercise.java      # Ejercicio de char y boolean
├── ☕ CircleMath.java               # Cálculos de círculo con Math.PI
├── ☕ FloatingPointOperations.java  # Operaciones con punto flotante
├── ☕ HypotenuseCalculator.java     # Calculadora de hipotenusa
├── ☕ IntegerOperations.java        # Operaciones básicas con enteros
├── ☕ RandomNumberGenerator.java    # Generador de números aleatorios
├── ☕ TrigonometryExercise.java     # Ejercicios de trigonometría
├── ☕ TypeCastingExercise.java      # Conversión de tipos
└── 📝 Ejercicios de Práctica 1.docx # Documento con instrucciones
```

## 🎯 Conceptos de Java Cubiertos

### Tipos de Datos Primitivos
- **`int`** - Números enteros
- **`double`** - Números de punto flotante de doble precisión
- **`float`** - Números de punto flotante de precisión simple
- **`char`** - Caracteres individuales
- **`boolean`** - Valores verdadero/falso

### Operadores Aritméticos
- **`+`** - Suma
- **`-`** - Resta
- **`*`** - Multiplicación
- **`/`** - División
- **`%`** - Módulo (residuo)

### Conversión de Tipos
- **Casting explícito** - `(int) doubleVariable`
- **Casting implícito** - Conversión automática
- **Conversión char a int** - Para obtener valores ASCII

### Entrada y Salida
- **`System.out.println()`** - Imprimir con salto de línea
- **`System.out.printf()`** - Imprimir con formato

### Clase Math
- **`Math.PI`** - Constante π (pi)
- **`Math.pow(base, exponente)`** - Potenciación
- **`Math.sqrt(numero)`** - Raíz cuadrada
- **`Math.random()`** - Número aleatorio [0.0, 1.0)
- **`Math.toRadians(grados)`** - Conversión grados a radianes
- **`Math.sin(radianes)`** - Función seno
- **`Math.cos(radianes)`** - Función coseno

## 🎓 Objetivos de Aprendizaje

Al completar estos ejercicios, habrás practicado:

1. **Declaración y uso de variables** con diferentes tipos de datos
2. **Operaciones matemáticas básicas** y su implementación en Java
3. **Conversión entre tipos de datos** y manejo de casting
4. **Uso de la clase Math** para operaciones matemáticas avanzadas
5. **Formato de salida** usando `println` y `printf`
6. **Conceptos de trigonometría** aplicados en programación
7. **Generación de números aleatorios** para aplicaciones dinámicas

