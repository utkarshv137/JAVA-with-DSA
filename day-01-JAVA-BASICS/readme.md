# JAVA
- Java is a high-level, class-based, object-oriented programming language 
- Originally created by James Gosling at Sun Microsystems in 1995 (now owned by Oracle), it operates on the core philosophy of "Write Once, Run Anywhere" (WORA).
- This means compiled Java code can run on all platforms that support Java without the need for recompilation.
- it is the very stirct language when it comes to syntax 
- it also called typed language as we need to define data type before declaration . 
## Core Architecture ComponentsJava's 
cross-platform capabilities rely on three essential components:
- JDK (Java Development Kit):Contains the tools needed to develop and compile Java applications.
- JRE (Java Runtime Environment): Provides the minimum requirements to execute a Java application.
- JVM (Java Virtual Machine): Converts Java bytecode into native machine code execution instructions.
```
+-------------------------------------------------------------+
| JDK (Development Tools: javac, jar, etc.)                   |
|   +-------------------------------------------------------+ |
|   | JRE (Standard Libraries & Deployment Tools)           | |
|   |   +-------------------------------------------------+ | |
|   |   | JVM (Executes Compiled Bytecode)                | | |
|   |   +-------------------------------------------------+ | |
|   +-------------------------------------------------------+ |
+-------------------------------------------------------------+
```
Key Features of Java
- Platform Independent: Compiles source code into intermediate bytecode (.class files) handled entirely by the local JVM.
- Object-Oriented: Organizes software design around data, or objects, utilizing principles like abstraction, encapsulation, inheritance, and polymorphism.
**Note - java is not puerly object oriented because of the primitive datatypes**
- Automatic Garbage Collection: Manages memory automatically by identifying and destroying unused objects to prevent leaks.
- Robust & Secure: Features strict compile-time error checking, safe memory management, and exclusion of pointers to lower security risks.
- Multithreaded: Supports integrated concurrent execution of multiple processing segments for peak system efficiency.

# Java Basics

## Boiler platecode :
```java
public class helloworld{
    public static void main(String args[]){
        System.out.println("helloworld");     
    }
}
```

- here `helloworld` is a file name .
- `;` is the statment terminator .
- `println` display the output in new line .

## Variables in JAVA 
this are the containers which store the values for processing . 
### example :
`  int a = 1 ; `
` int b = 2 ; `

- here *a* and *b* are the identifiers .
- user-defined name given to various programming elements, such as variables, functions, arrays, classes, and structures *identifiers* .

## Data-types in Java
java is mainly has two datatypes :

### 1. Primitive Datatypes
 this are the datatypes which cannot be breake into further datatype .
- `byte` `short` `char` `boolean` `int` `long` `float` `double`
### 2. Non-Primitive Datatypes
 this are the datatypes which can be breake into further datatype .
- `String` `Arry` `Class` `Object` `Interface` 

## Input in java 
in java we take input from user with the help of the Scanner class .
- **note - you have to import Scanner class before using the fuction and to import scanner class you have to use this sytax :**
```java
import java.util.Scanner ;
```
- now access the function of the class using objects .

```java
 Scanner st = new Scanner(System.in) ;
      String x = st.next() ;// will read input till first space
      String y = st.nextLine(); // read whole inut string 
```
### there are various input function for example
- `.nextInt()`
- `.nextFloat()`
- `.nextBoolean()`
- `.nextDouble()`

## Type-Conversion && Type-Casting
### Type-Conversion :
it means chaning the datatype of a value from one datatype to another 
but type conversion occur only if :
- we are Converting smaller datatype to bigger one .
- it is also known as implicit conversion .
- we can also convert the char to integer type the integer value we will get will be the AISEC value . 
**byte -> short -> int -> float -> long -> double**
  Example :
```java

    public static void main(String[] args) {
        int a = 10 ; 
        float b = 23.98f ;
        double y = a ; 
        long z = a ; 
        char ch = '$' ;
        a = ch ;
        System.out.println(ch);
    }
 ```

### Type-Casting :
it is when we convter bigger datatype into smaller one .  
**Note - data loss happens while converting bigger datatype into smaller , therefore it is also known as lossy conversion**
- it is also called explicit/narrowing conversion .  
Example - 
```java
 public static void main(String[] args) {
        int a = 10 ; 
        float n = (int) a ; 
        System.out.println(n);
        
    }
```"# JAVA-DSA" 
