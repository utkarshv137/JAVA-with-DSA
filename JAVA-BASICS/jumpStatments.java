
import java.util.* ;

public class jumpStatments {
    public static void main(String[] args) {

        for(int i = 5 ; i > 0  ; i -- ){
            if (i == 3) {
                break ;
            }
        }
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
    }
}
