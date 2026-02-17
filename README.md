# Java Learning Repository

This repository contains my learning notes, syntax, and example programs while studying Java programming.

---

# 1. Introduction to Java

## History of Java

Java was developed by Sun Microsystems in 1995 by James Gosling.

## Features of Java

* Platform Independent
* Object Oriented
* Secure
* Robust
* Multithreading Support

## Basic Structure of Java Program

### Syntax

```java
class ClassName {
    public static void main(String[] args) {
        // code
    }
}
```

### Example

```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

## Command Line Argument Example

```java
class CommandLineExample {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}
```

## JDK, JRE, JVM

* JDK → Development tools
* JRE → Runtime environment
* JVM → Executes bytecode

---

# 2. Data in Java

## Primitive Data Types

* int
* float
* double
* char
* boolean

### Syntax

```java
int age = 20;
float marks = 85.5f;
char grade = 'A';
boolean status = true;
```

### Example

```java
class DataExample {
    public static void main(String[] args) {
        int age = 20;
        System.out.println(age);
    }
}
```

## Type Conversion

### Syntax

```java
double num = 10;
int x = (int) num;
```

## Static Keyword Example

```java
class Test {
    static int count = 0;
}
```

## Wrapper Class Example

```java
Integer num = Integer.valueOf(10);
```

---

# 3. Operators

## Types of Operators

* Arithmetic (+ - * / %)
* Relational (== != > <)
* Logical (&& || !)
* Bitwise (& | ^)
* Ternary

### Arithmetic Example

```java
int a = 10, b = 5;
System.out.println(a + b);
```

### Ternary Operator Syntax

```java
int result = (a > b) ? a : b;
```

---

# 4. Conditional Statements

## if Syntax

```java
if(condition){
   // code
}
```

## if-else Example

```java
int age = 18;
if(age >= 18){
    System.out.println("Eligible");
}else{
    System.out.println("Not Eligible");
}
```

## Switch Example

```java
int day = 2;
switch(day){
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
}
```

---

# 5. Loops

## for Loop Syntax

```java
for(int i=0; i<5; i++){
   System.out.println(i);
}
```

## while Loop Example

```java
int i = 0;
while(i < 5){
   System.out.println(i);
   i++;
}
```

## do-while Example

```java
int i = 0;
do{
   System.out.println(i);
   i++;
}while(i < 5);
```

## for-each Example

```java
int[] arr = {1,2,3};
for(int num : arr){
   System.out.println(num);
}
```

---

# 6. Arrays and Enums

## Array Syntax

```java
int[] arr = new int[5];
```

## Multi-dimensional Array

```java
int[][] matrix = new int[2][2];
```

## Varargs Example

```java
static void printNumbers(int... nums){
   for(int n : nums){
      System.out.println(n);
   }
}
```

## Enum Example

```java
enum Day { MON, TUE, WED }
```

---

# 7. OOP Concepts

## Class Syntax

```java
class Student {
   String name;
}
```

## Constructor Example

```java
class Student {
   String name;
   Student(String name){
      this.name = name;
   }
}
```

## Method Example

```java
void display(){
   System.out.println("Hello");
}
```

## Method Overloading

```java
void add(int a, int b){}
void add(double a, double b){}
```

## Initializer Block Example

```java
{
   System.out.println("Object Created");
}
```

---

# 8. String Class

## String Syntax

```java
String name = "Java";
```

## String Methods Example

```java
String name = "Java";
System.out.println(name.length());
System.out.println(name.toUpperCase());
```

## StringBuilder Example

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" Java");
System.out.println(sb);
```

---

# Author

Yash Raj,
B.Tech CSE,
Learning Java Programming.
