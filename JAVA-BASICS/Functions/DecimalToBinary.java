public class DecimalToBinary {
    public static int DecToBi(int n){
        int Binary = 0; 
        int  pow = 0 ;
        while(n>0){
          int rem = n % 2 ;
          Binary = Binary + (rem * (int)Math.pow(10,pow) ); 
          n /= 2 ;
          pow++;
        }
        return Binary ;
    }
    public static void main(String[] args) {
        System.out.println(DecToBi(8));
    }
}
