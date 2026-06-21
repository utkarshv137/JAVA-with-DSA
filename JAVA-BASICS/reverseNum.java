public class reverseNum {
    public static void main(String[] args) {
        int x = 34368;
        int newNum = 0 ; 
        while(x>0){
         int lastdigit = x%10 ; 
         x /= 10  ; 
         newNum = newNum * 10 + lastdigit ;
         
        }
        System.out.println(newNum);
    }
    
}
