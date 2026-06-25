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

` int a = 1 ;`
`int b = 2 ;`

- here _a_ and _b_ are the identifiers .
- user-defined name given to various programming elements, such as variables, functions, arrays, classes, and structures _identifiers_ .

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
```

### Type Promotion in Expressions

- Java automatically promotes each byte, short, or char operand to int when evaluating an expression.  

```java
      byte a= 1 ;
        short b = 32;
        char x = 'c' ;
        int ans = a+b+x ;
        System.out.println(ans);

```

- If one operand is long, float or double the whole expression is promoted to long, float, or double respectively.

```java
      long p = 343 ;
        float q = 43.04f ;
        int r = 33;
        double s = p+q+r ;
        System.out.println(s);
```

## Operators in java

Symbols tells compiler to perform some operation .  
`+`, `-`,`*`.  
Types of Operator in java :-

- **Arithmetic (binary/unary)**  
  Binary - needs atleast two operands.
  - `+`,`-`,`/`,`%`

  unary - need only one opreand .
  - `++a` (pre-increment - value get updated first then used ), `a++` (post-increment value get used first then increased) ,  
    `a--` ,`--a`

- **Relational**  
   `==`,`!=`,`>`,`<`,`>=`,`<=` .
- **Logical**  
   `&&` ,`||` , `!`
- **Assigment**  
   `=`,`+=`,`-=`,`*=`,`/=`
- **Bitwise**

## Flow Control in JAVA

Flow control (or control flow) is the order in which statements in a program are executed.

By default, a program runs from top to bottom, one statement after another. Flow control statements allow you to change this order by making decisions, repeating actions, or jumping to other parts of the code.

### Conditional Statments

#### if-else Statment

```java
if(condition){

} else{

}
```

#### ternry Operator

- **variable = condition ? statment1 : statment2 ;**
- its basically another method for executing if-else statment .
- ```java
    boolean ans = (a>b)? true : false ;
        System.out.println(ans);
  ```

#### Switch-Case Statment

- it Contains a variale which can be of any data type .
- based on the value of variable it decide which case to choose .  
  example -

```java
 Scanner input = new Scanner(System.in) ;
        String day = input.next();

        switch (day) {
            case "monday":
                System.out.println("monday is bloody woking day");
                break;
            case "sunday":
                System.out.println("hehe its time to rock");
                break;

            default:
                System.out.println("i guess its another boring day");
                break;
        }

```

### Loops

Used to repeat a block of code.  
there of three Types :-

1. **while loop**
   - runs the block the of code util the condition is ture  
     eample : -
   ```java
   int a = 0;
       while (a<=3){
           System.out.println(a);
           a++ ;
       }
   ```
2. **for loop**
   - it is also the iterative loop

   ```java
     for(int i = 0 ; i<=2 ; i++){
           System.out.println("for loop");
       }

   ```

3. **do-while loop**
   - it is also same as while loop
   - but in this do block executes the statment first and then in the last checks the conditions .
   ```java
    int c = 3 ;
       do{
           System.out.println("i am do-while");
           c-- ;
       }while(c>1) ;
   ```

### Jumps Statment

- **Break** - breaks out of a loop , example

```java

       for(int i = 5 ; i > 0  ; i -- ){
           if (i == 3) {
               break ;
           }
       }
```

- **continue** - skip a iteration of a loop , example
  ```java
    Scanner input = new Scanner(System.in) ;
      int num ;
      while(true){
          num = input.nextInt() ;
          if(num % 10 == 0){
              continue ;
          }else{
              System.out.println("entered num :" + num);
          }
      }
  ```

## Function in Java

- function contain block of code which executes multiple times in java
- we just needs to call the function whenever we need to execute tha block of code
- function are stored in stack memory
- there the two types of functions in java -
  1. **User-defined** - as the name suggest this are made by the users
  2. **In-built / System-defined** - this are the functions which are predefined by the System ex - math class has predefine functions such as max ,min, sqrt,pow.
- example

  ```java
      public static void printHelloWorld(){
      System.out.println("helloworld");
   }
      public static void main(String[] args) {
      printHelloWorld();

     }
  ```

### Call by value and Call by Refrence

- Call by value - in this a fuction creates a copy of original value and returns the updated value of a variable
- call by refrence the original value of a gets updated

  ```java

  // Call by value
  // swaping the value of a and b
  public static void swap(int a , int b ){
      int temp = a ;
      a = b ;
      b = temp ;
      System.out.println("the value of  a : " + a);
      System.out.println("the value of  b : " + b);
  }
  public static void main(String[] args) {
      int a = 10 ;
      int b = 5 ;
      swap(a,b) ;
      System.out.println(a);
      System.out.println(b);
  }

  ```

### Function Overloading

- java allow function overloading in which we can create function with same name but they will perform different operation
- the java differentiate in fuction maily with the type of parameter we pass , and also depends on the return type of the function .

```java
 // Function Overloading
    public static int sum(int a, int b){
        int ans = a + b ;
        return ans ;
    }

    public static int sum(float a, float b){
        int ans = (int)(a + b) ;
        return ans ;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 8));
        System.out.println(sum(7.5f, 9.8f));
    }

```

## AARAYA in Java

- this are the set of similar data in java
- the elements in arrays are stored continously

```java
  public static void main(String[] args) {
        int arr[] = new int[3] ;
        arr[0] = 29 ;
        arr[1] = 97 ;
        arr[2] = 30 ;
        int num[] = { 1, 2,3} ;
        for(int i = 0 ; i<arr.length ; i++){
        System.out.println(arr[i]);
        }
    }

```
- here ``new`` keyword allocates the space for array in memory 
- we can access arrays  though loops such as for or while  loop 
- aarays are stored in heap memory 
