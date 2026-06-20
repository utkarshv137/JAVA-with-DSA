public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5 ;
        int c = ++a ; 

        // Binary Operator - needs atleate two operators 

        System.out.println("add = " + (a+b) );
        System.out.println("subtract = " + (a-b) );
        System.out.println("multiply = " + (a*b) );
        System.out.println("divide = " + (a/b) );

        // Unary Operator - needs only one operand to perform opp

        System.out.println(a++);
        System.out.println((++a)+","+ (c));
        System.out.println(a--);
    }
}
