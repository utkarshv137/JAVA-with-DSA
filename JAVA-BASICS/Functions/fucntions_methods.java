// package Functions;

import java.util.Scanner ; 
public class fucntions_methods {

    public static void printHelloWorld(){
        System.out.println("helloworld");
    }
    public static void main(String[] args) {
        printHelloWorld();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num1 : ");
        int a = input.nextInt() ; 
        System.out.print("Enter the num2 : ");
        int b = input.nextInt() ; 
        System.out.println("the sum of the two number is : " + sum(a,b)); ;
       
    }

    // Addition fuction 

    public static int sum(int a , int b){

        int add = a+b ; 

        return add ; 
    }
    
    
}
