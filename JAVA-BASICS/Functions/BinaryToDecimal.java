
import java.util.* ;
public class BinaryToDecimal {
    public static int BiToDeci(int a ){
        int deci = 0 ; 
        int pow = 0 ;   
        while(a>0){
            int ld = a%10 ; 
            deci = deci + (ld * (int) Math.pow(2,pow)) ;
            a /= 10 ;
            pow++ ;
        }
        return deci ;
    }
    public static void main(String[] args) {
        System.out.println(BiToDeci(0));
        
    }
}
