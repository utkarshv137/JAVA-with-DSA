public class CallByValue {
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
}
